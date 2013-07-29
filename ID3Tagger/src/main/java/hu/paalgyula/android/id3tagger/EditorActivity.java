package hu.paalgyula.android.id3tagger;

import android.app.AlertDialog;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.Mp3File;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;

public class EditorActivity extends FragmentActivity {
    private EditText artist;
    private EditText album;
    private EditText title;

    private String filePath;

    private Button searchButton;

    private DialogFragment dialogFragment = new DialogFragment() {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            Dialog dialog = super.onCreateDialog(savedInstanceState);
            dialog.setTitle("Halihóóó");
            return dialog;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Uri dataUri = getIntent().getData();

        filePath = dataUri.getPath();

        setContentView(R.layout.activity_editor_id3v2);
        artist = (EditText) findViewById(R.id.id3v2_author);
        album = (EditText) findViewById(R.id.id3v2_album);
        title = (EditText) findViewById(R.id.id3v2_title);

        searchButton = (Button) findViewById(R.id.searchButton);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpClient client = new DefaultHttpClient();

                String term = artist.getText().toString();
                term += " " + album.getText().toString();
                term += " " + title.getText().toString();

                Uri uri = new Uri.Builder()
                        .scheme("https")
                        .authority("itunes.apple.com")
                        .path("search")
                        .appendQueryParameter("term", term )
                        .appendQueryParameter("entity", "song")
                        .build();

                dialogFragment.setCancelable(false);
                dialogFragment.show(getSupportFragmentManager(), "Loading");

                Log.w( "EditorActivity", uri.toString() );

                try {
                    HttpGet httpGet = new HttpGet(uri.toString());
                    HttpResponse response = client.execute(httpGet);

                    BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
                    StringBuilder sb = new StringBuilder();
                    for (String line = null; (line = reader.readLine()) != null; ) {
                        sb.append(line).append("\n");
                    }

                    JSONObject jsonResponse = new JSONObject(sb.toString());
                    JSONArray results = jsonResponse.getJSONArray("results");

                    for (int i = 0; i<results.length(); i++) {
                        JSONObject obj = (JSONObject)results.get( i );
                        String song = "Artist = " + obj.getString( "artistName" ) +
                                " Album = " + obj.getString( "collectionName" ) +
                                " Title = " + obj.getString( "trackName" );

                        Log.w( "ResultSong", song );
                        Toast.makeText(EditorActivity.this, song, Toast.LENGTH_SHORT);
                    }

                    //ArrayAdapter<String> aa = new ArrayAdapter<String>()

                    Log.w("Results", results.toString());
                } catch (Exception e) {

                }

                dialogFragment.dismiss();
            }
        });
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        try {
            Mp3File mp3File = new Mp3File(filePath);

            if (mp3File.hasId3v2Tag()) {
                ID3v2 tag = mp3File.getId3v2Tag();
                artist.setText(tag.getArtist());
                album.setText(tag.getAlbum());
                title.setText(tag.getTitle());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.editor, menu);
        return true;
    }

}
