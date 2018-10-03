package com.linkloving.pos.newodoo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.linkloving.pos.newodoo.R;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        QMUIStatusBarHelper.translucent(this); // 沉浸式状态栏
        setContentView(R.layout.activity_login);
    }
}
