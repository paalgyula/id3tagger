package hu.paalgyula.android.id3tagger;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by paalgyula on 2013.07.30..
 */
public class SongArrayAdapter extends ArrayAdapter<SongEntry> {
    private final int layoutResourceId;
    private final Context context;
    private final SongEntry[] data;

    public SongArrayAdapter(Context context, int layoutResourceId, SongEntry[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent) {
        View row = contentView;
        SongHolder songHolder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            songHolder = new SongHolder();
            songHolder.title = (TextView) row.findViewById(R.id.title);
            songHolder.artistAlbum = (TextView) row.findViewById(R.id.artist_album);

            row.setTag(songHolder);
        } else {
            songHolder = (SongHolder) row.getTag();
        }

        SongEntry songEntry = data[position];
        songHolder.title.setText(songEntry.getTrackName());
        songHolder.artistAlbum.setText(songEntry.getArtistName() + " - " + songEntry.getCollectionName());

        return row;
    }

    static class SongHolder {
        TextView title;
        TextView artistAlbum;
    }
}
