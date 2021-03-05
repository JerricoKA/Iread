package com.moon.iread.ui;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;

/**
 * @author：张振月
 * @Project : Iread
 * @File : StatusBar
 * @Package : com.moon.iread.ui
 * @Date: 2021/3/5 下午 4:27
 */


public class StatusBar {
    /**设置状态栏反色*/
    public static void setStatusBarLightMode(Activity activity, boolean isLightMode) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Window window = activity.getWindow();
            int option = window.getDecorView().getSystemUiVisibility();
            if (isLightMode) {
                option |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            } else {
                option &= ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            }
            window.getDecorView().setSystemUiVisibility(option);
        }
    }

}
