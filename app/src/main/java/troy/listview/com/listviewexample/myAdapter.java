package troy.listview.com.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import troy.listview.com.listviewexample.R;

class myAdapter extends ArrayAdapter<String> {
    public myAdapter(Context context, String [] values) {
        super(context, R.layout.row_layout2, values);
    }

//    ViewGroup represents a bunch of invisible containers
//    convertView is a reference for the previous view

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View view = theInflater.inflate(R.layout.row_layout2, parent, false);

        String tvShow = getItem(position);

        TextView theTextView = (TextView) view.findViewById(R.id.textView1);

        theTextView.setText(tvShow);

        ImageView theImageView = (ImageView) view.findViewById(R.id.imageView1);

        theImageView.setImageResource(R.drawable.images);
        return view;
    }
}