package com.droidacid.multipanefragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        int screenOrientation = getResources().getConfiguration().orientation;
        
        if(screenOrientation == Configuration.ORIENTATION_PORTRAIT) {
            hideSidePanel();
        }
        
    }

    private void hideSidePanel() {
        View sidePane = findViewById(R.id.side_panel);
        if(sidePane.getVisibility() == View.VISIBLE) {
            sidePane.setVisibility(View.GONE);
        }
    }


}
