package com.moon.iread.main;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.moon.iread.R;

import static com.moon.iread.ui.StatusBar.setStatusBarLightMode;

/**
 * @author 懵月
 */
public class PerInfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per_inf);
        /*状态栏沉浸*/
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setStatusBarLightMode(PerInfActivity.this,true);
    }
}