package com.example.raf;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ahmed on 25/04/2016.
 */
public class CategoriesFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView mRecyclerView = (RecyclerView) v.findViewById(R.id.recycle_home);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(v.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        CategoriesAdapter mAdapter = new CategoriesAdapter(v.getContext());
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.addBook("Book Thief","Markus Zusak",R.drawable.book1,mAdapter.CLASSIC);
        mAdapter.addBook("Ten Thousand Skies Above You","Claudia Gray",R.drawable.book2,mAdapter.CLASSIC);
        mAdapter.addBook("Strill Alice","Lisa Genova",R.drawable.book3,mAdapter.CLASSIC);
        mAdapter.addBook("Ten Thousand Skies Above You","Claudia Gray",R.drawable.book2,mAdapter.HISTORY);
        mAdapter.addBook("Strill Alice","Lisa Genova",R.drawable.book3,mAdapter.HISTORY);
        mAdapter.addBook("Book Thief","Markus Zusak",R.drawable.book1,mAdapter.HISTORY);
        mAdapter.addBook("Strill Alice","Lisa Genova",R.drawable.book3,mAdapter.BIO);
        mAdapter.addBook("Book Thief","Markus Zusak",R.drawable.book1,mAdapter.BIO);
        mAdapter.addBook("Ten Thousand Skies Above You","Claudia Gray",R.drawable.book2,mAdapter.BIO);
        mAdapter.addBook("Ten Thousand Skies Above You","Claudia Gray",R.drawable.book2,mAdapter.SERIES);
        mAdapter.addBook("Strill Alice","Lisa Genova",R.drawable.book3,mAdapter.SERIES);
        mAdapter.addBook("Book Thief","Markus Zusak",R.drawable.book1,mAdapter.SERIES);
        mAdapter.addBook("Strill Alice","Lisa Genova",R.drawable.book3,mAdapter.RELEGION);
        mAdapter.addBook("Book Thief","Markus Zusak",R.drawable.book1,mAdapter.RELEGION);
        mAdapter.addBook("Ten Thousand Skies Above You","Claudia Gray",R.drawable.book2,mAdapter.RELEGION);




        return v;
    }

}