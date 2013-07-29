package hu.paalgyula.android.id3tagger;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.MimeTypeMap;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MimeTypeMap myMime = MimeTypeMap.getSingleton();

        Intent newIntent = new Intent(android.content.Intent.ACTION_VIEW);


        File mp3File = new File("/mnt/sdcard/inflames.mp3");

        //Intent newIntent = new Intent(Intent.ACTION_VIEW);
        String mimeType = myMime.getMimeTypeFromExtension( "mp3" );
        newIntent.setDataAndType(Uri.fromFile( mp3File ),mimeType);
        newIntent.setFlags(newIntent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(newIntent);
        } catch (android.content.ActivityNotFoundException e) {
            Toast.makeText( getApplicationContext(), "No handler for this type of file.", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
