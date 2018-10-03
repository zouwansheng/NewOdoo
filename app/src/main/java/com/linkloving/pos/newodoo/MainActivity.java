package com.linkloving.pos.newodoo;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.qmuiteam.qmui.util.QMUIStatusBarHelper;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.topbar)
    QMUITopBar mTopBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        QMUIStatusBarHelper.translucent(MainActivity.this); // 沉浸式状态栏
        View root = LayoutInflater.from(this).inflate(R.layout.activity_main, null);
        ButterKnife.bind(this, root);
        initTopBar();
        setContentView(root);
    }

    private void initTopBar() {
        mTopBar.setBackgroundColor(ContextCompat.getColor(this, R.color.app_color_theme_6));
        mTopBar.setTitle("仓库");
    }
}
