package com.example.navdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.example.navdemo1.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity
        implements SecondFragment.OnFragmentInteractionListener,ThirdFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.container, MainFragment.newInstance())
//                    .commitNow();
//        }
    }

    @Override
    public void onFragmentInteractionThird(Uri uri) {

    }



    @Override
    public void onFragmentInteraction(Uri uri) {

    }


}
