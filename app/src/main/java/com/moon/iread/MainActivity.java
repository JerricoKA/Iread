package com.moon.iread;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.moon.iread.main.*;

import static com.moon.iread.ui.StatusBar.setStatusBarLightMode;
/**
 * @author 懵月
 */
public class MainActivity extends AppCompatActivity {

    public TextView mainTextview;
    public Button perinfo;
    public Button seatsel;
    public Button reservation;
    public Button set;
    public Button about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTextview = this.findViewById(R.id.library_top);
        /*状态栏沉浸*/
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setStatusBarLightMode(MainActivity.this,true);
        /*跳转到个人信息页面*/
        perinfo = this.findViewById(R.id.personal_information);
        perinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,PerInfActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
            }
        });
        /*跳转到选座界面*/
        seatsel = this.findViewById(R.id.seat_selection);
        seatsel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SelSeatActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
            }
        });
        /*跳转到预约选座界面
        * */
        reservation = this.findViewById(R.id.reservation);
        reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ReservationActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
            }
        });
        /*跳转设置界面
        * */
        set = this.findViewById(R.id.set);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SetActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
            }
        });
        /*跳转到关于界面
        * */
        about = this.findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
            }
        });

    }
}