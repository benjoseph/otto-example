package com.josephben.android.ottoexample;

import android.app.Application;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by josephben on 3/21/2016.
 */
public class OttoExample extends Application {

    public static Bus getBus() {
        return bus;
    }

    public static Bus bus = new Bus(ThreadEnforcer.ANY);

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
