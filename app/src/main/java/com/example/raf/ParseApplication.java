package com.example.raf;

/**
 * Created by Tahaz on 4/25/2016.
 */
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.parse.Parse;
import com.parse.ParseACL;

import com.parse.ParseFacebookUtils;
import com.parse.ParseUser;

import android.app.Application;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, "E4KJFk3dW4oBSuyzfOHnw0oND4x86ilQOf5iczOy", "yhmGW190PwtEIxtRUNaDz9rB3IDR5Gp4rMF91DYy");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this
        // line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);

        ParseFacebookUtils.initialize(this);
    }
}
