package com.example.lifecycle2;

import android.content.Context; import android.os.Bundle;

import androidx.annotation.NonNull; import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater; import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) { Log.d("LifeCycle","Fragment On Create Called");
        super.onCreate(savedInstanceState); } @Override
    public void onResume() {
        Log.d("LifeCycle","Fragment On Resume Called"); super.onResume( );
    }
    @Override
    public void onStop() {
        Log.d("LifeCycle","Fragment On Stop Called"); super.onStop( );
    }
    @Override
    public void onStart() {
        Log.d("LifeCycle","Fragment On Start Called"); super.onStart( );
    }
    @Override
    public void onDestroy() {
        Log.d("LifeCycle","Fragment On Destroy Called"); super.onDestroy( );
    }
    @Override
    public void onPause() {
        Log.d("LifeCycle","Fragment On Pause Called"); super.onPause( );
    }
    @Override
    public void onAttach(@NonNull Context context) { Log.d("LifeCycle", "Fragment On Attach Called");
        super.onAttach(context);
    }
    @Override
    public void onDetach() {
        Log.d("LifeCycle","Fragment On Detach Called"); super.onDetach( );
    }

}


