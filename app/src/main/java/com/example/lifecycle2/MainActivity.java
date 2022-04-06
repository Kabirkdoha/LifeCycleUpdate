package com.example.lifecycle2;

import androidx.appcompat.app.AppCompatActivity; import androidx.fragment.app.Fragment;

import android.os.Bundle; import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Fragment fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fr = new Fragment1();
        Log.d("LifeCycle", "Activity Created");
    }

    @Override
    protected void onStart() {
        Log.d("LifeCycle", "Activity Started");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d("LifeCycle", "On Stop Called");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("LifeCycle", "On Destroy Called");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d("LifeCycle", "On Pause Called");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("LifeCycle", "On Resume Called");
        super.onResume();
    }
}
