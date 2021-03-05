package com.moon.iread;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.Selection;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.moon.iread.ui.StatusBar.setStatusBarLightMode;


/**
 * @author 懵月
 */
public class LoginActivity extends AppCompatActivity {

    public Button login;
    public EditText edEmail;
    public EditText edPassword;
    public static Pattern p = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        /*状态栏沉浸*/
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setStatusBarLightMode(LoginActivity.this,true);

        edPassword = this.findViewById(R.id.password);
        /*显示为密码*/
        edPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        /*使光标始终在最后，好像没用*/
        Editable etable = edPassword.getText();
        Selection.setSelection(etable, etable.length());
        login = this.findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edEmail = findViewById(R.id.email);
                Intent intent = new Intent();
                intent.setClass(LoginActivity.this,MainActivity.class);
                if (isEmail(edEmail.getText().toString().trim())){
                    if (!"".equals(edPassword.getText().toString().trim())){
                        startActivity(intent);
                    }else {
                        Toast.makeText(LoginActivity.this, "密码错误", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(LoginActivity.this, "邮箱错误", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    /**验证邮箱是否正确*/
    public static boolean isEmail(String email){
        if (null==email || "".equals(email)){
            return false;
        }else{
            Matcher m = p.matcher(email);
            return m.matches();
        }
    }




}