package com.example.stopwatch.modulosReact;

import android.content.Context;
import android.content.Intent;

import com.example.stopwatch.MainActivity2;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ComenzarActividadModule extends ReactContextBaseJavaModule {

    Context mContext;

    public ComenzarActividadModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mContext = reactContext;
    }

    @Override
    public String getName() {
        return "ComenzarActividadModule";
    }

    @ReactMethod
    public void cargarHome() {
        ReactApplicationContext context = getReactApplicationContext();

        Intent intent = new Intent(context, MainActivity2.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

}