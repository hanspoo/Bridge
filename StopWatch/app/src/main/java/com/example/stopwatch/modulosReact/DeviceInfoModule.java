package com.example.stopwatch.modulosReact;

import android.content.Context;
import android.os.Build;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class DeviceInfoModule extends ReactContextBaseJavaModule {

    Context mContext;

    public DeviceInfoModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mContext = reactContext;
    }

    @Override
    public String getName() {
        return "DeviceInfoModule";
    }

    @ReactMethod
    public void getDeviceName(Callback cb) {
        try {
            cb.invoke(null, Build.MODEL);
        } catch(Exception e) {
            cb.invoke(e.toString(), null);
        }
    }

}