package com.example.raf;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Added to Whishlist", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                this.finish();
                overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }


    public void onClick(View v) {

        Intent mainIntent = new Intent(BookActivity.this, GetBookActivity.class);
        BookActivity.this.startActivity(mainIntent);
        overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave);
    }

    public void onClick2(View v) {

        Intent mainIntent = new Intent(BookActivity.this, AddBookActivity.class);
        BookActivity.this.startActivity(mainIntent);
        overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave);
    }


}
