package com.example.user.yinfeng.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by user on 2016/10/11.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected abstract void initVariables();
    protected abstract void initViews(Bundle savedInstanceState);


}
