package com.example.msi.footballscores.ui.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.example.msi.footballscores.ScoresApplication;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ScoresApplication.get(this).getRefWatcher().watch(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    public void setTitle(int titleId) {
        ActionBar ab = getSupportActionBar();
        if (ab != null)
            ab.setTitle(titleId);
        else
            super.setTitle(titleId);
    }
}