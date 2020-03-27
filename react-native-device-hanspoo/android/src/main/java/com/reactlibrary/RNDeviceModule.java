package com.stopwatch.device;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNDeviceModule extends ReactContextBaseJavaModule {

    public DeviceModule(@NonNull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        return "Device";
    }

    @ReactMethod
    public void getDeviceName(Callback cb) {
        try{
            cb.invoke(null, android.os.Build.MODEL);
        }catch (Exception e){
            cb.invoke(e.toString(), null);
        }
    }
}
