package com.jackchan.appdevelop.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * ============================================================
 * Copyright：JackChan和他的朋友们有限公司版权所有 (c) 2017
 * Author：   JackChan
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChan1999
 * GitBook：  https://www.gitbook.com/@alleniverson
 * CSDN博客： http://blog.csdn.net/axi295309066
 * 个人博客： https://jackchan1999.github.io/
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：AppDevelop
 * Package_Name：com.jackchan.appdevelop.activity
 * Version：1.0
 * time：2017/6/7 9:07
 * des ：${TODO}
 * gitVersion：2.12.0.windows.1
 * updateAuthor：AllenIverson
 * updateDate：2017/6/7 9:07
 * updateDes：${TODO}
 * ============================================================
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initValiables();
        initViews();
        initEvent();
        loadData();
    }

    protected abstract void initEvent();

    protected abstract void loadData();

    protected abstract void initViews();

    protected abstract void initValiables();
}
