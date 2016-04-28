package com.example.android.bicycleapp;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Prince on 24/04/2016.
 */
public class Config extends Application {
    @Override
    public void onCreate(){
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
