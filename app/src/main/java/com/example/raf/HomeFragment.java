package com.example.raf;

/**
 * Created by Ahmed on 22/04/2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HomeFragment extends Fragment {


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
        MyAdapter mAdapter = new MyAdapter(v.getContext());
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.addBook("Book Thief","Markus Zusak",R.drawable.book1,0);
        mAdapter.addBook("Ten Thousand Skies Above You","Claudia Gray",R.drawable.book2,0);
        mAdapter.addBook("Strill Alice","Lisa Genova",R.drawable.book3,0);
        mAdapter.addBook("Ten Thousand Skies Above You","Claudia Gray",R.drawable.book2,1);
        mAdapter.addBook("Strill Alice","Lisa Genova",R.drawable.book3,1);
        mAdapter.addBook("Book Thief","Markus Zusak",R.drawable.book1,1);
        mAdapter.addBook("Strill Alice","Lisa Genova",R.drawable.book3,2);;
        mAdapter.addBook("Book Thief","Markus Zusak",R.drawable.book1,2);
        mAdapter.addBook("Ten Thousand Skies Above You","Claudia Gray",R.drawable.book2,2);




        return v;
    }

}