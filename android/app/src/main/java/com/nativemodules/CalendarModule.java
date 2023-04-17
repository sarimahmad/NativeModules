package com.nativemodules;
import android.util.Log;
import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;

public class CalendarModule extends ReactContextBaseJavaModule {
    CalendarModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "CalendarModule";
    }
    @ReactMethod
    public void CalendarEvent(Callback callback){
        Log.d("Calender Modules Print", "Logg from our Calendar Module");
        callback.invoke("Data Returns from the Native Modules");
    }

    @ReactMethod
    public void CalendarPromiseEvent(Promise promise){
        try{
                promise.resolve("Promise Return from the Native Modules");
        }catch (Exception  e){
            promise.reject("Promise Rejected as error", e);
        }
    }
}