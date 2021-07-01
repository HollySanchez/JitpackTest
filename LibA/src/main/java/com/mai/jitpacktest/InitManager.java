package com.mai.jitpacktest;

import android.app.Application;
import android.util.Log;

import com.kwad.sdk.api.KsAdSDK;

public class InitManager {
    public static void init(Application app) {
        Log.d("test", "LibA.init");
        LibB b = new LibB();
        b.init(app);
        KsAdSDK.init(app, null);
    }
}
