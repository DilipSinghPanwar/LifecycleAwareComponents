package com.lifecycleawarecomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Owner onCreate: ");
        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Owner onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Owner onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Owner onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Owner onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Owner onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Owner onDestroy invoked");
    }
}
