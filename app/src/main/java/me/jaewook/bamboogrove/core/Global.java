package me.jaewook.bamboogrove.core;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by Jaewook on 2016-07-21.
 */
public class Global extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(this);
    }
}
