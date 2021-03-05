package com.moon.iread.main;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.moon.iread.MainActivity;
import com.moon.iread.R;

import static com.moon.iread.ui.StatusBar.setStatusBarLightMode;

/**
 * @author 懵月
 */
public class ReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        /*状态栏沉浸*/
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setStatusBarLightMode(ReservationActivity.this,true);
    }
}