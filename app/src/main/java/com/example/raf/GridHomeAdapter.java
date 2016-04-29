package com.example.raf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ahmed on 23/04/2016.
 */

/**
 * Created by Ahmed on 23/04/2016.
 */
public class GridHomeAdapter extends BaseAdapter {

    private Context context;
    ArrayList<String> mtitles0 = new ArrayList<String>();
    ArrayList<String> mAuthor0 = new ArrayList<String>();
    ArrayList<Integer> mCover0 = new ArrayList<Integer>();


    final int FEATURED = 0;
    final int NEW_RELEASES = 1;
    final int MOST_POPULAR = 2;
    final int [] types = {FEATURED,NEW_RELEASES,MOST_POPULAR};


    //Constructor to initialize values
    public GridHomeAdapter(Context context) {

        this.context = context;
    }

    @Override
    public int getCount() {

        // Number of times getView method call depends upon gridValues.length
        return mtitles0.size();
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }


    // Number of times getView method call depends upon gridValues.length

    public View getView(int position, View convertView, ViewGroup parent) {

        // LayoutInflator to call external grid_item.xml file

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);

            // get layout from grid_item.xml ( Defined Below )

            gridView = inflater.inflate(R.layout.grid_item2, null);

            // set value into textview
            TextView txttitle = (TextView) gridView.findViewById(R.id.title);
            TextView txtauthor = (TextView) gridView.findViewById(R.id.author);
            ImageView imgcover = (ImageView) gridView.findViewById(R.id.cover);


                    txttitle.setText(mtitles0.get(position));
                    txtauthor.setText(mAuthor0.get(position));
                    imgcover.setImageResource(mCover0.get(position));




        } else {

            gridView = (View) convertView;
        }

        return gridView;
    }


    {
    }

    public boolean addItem(String title,String author, int cover , int type){


                mtitles0.add(title);
                mAuthor0.add(author);
                mCover0.add(cover);

        notifyDataSetChanged();
        return true;

    }
}
