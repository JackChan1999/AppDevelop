package com.jackchan.appdevelop.exception;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;

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
 * Package_Name：com.jackchan.appdevelop.exception
 * Version：1.0
 * time：2017/5/15 22:02
 * des ：${TODO}
 * gitVersion：2.12.0.windows.1
 * updateAuthor：AllenIverson
 * updateDate：2017/5/15 22:02
 * updateDes：${TODO}
 * ============================================================
 */
public class CrashHandler implements Thread.UncaughtExceptionHandler {

    private Context mContext;

    public CrashHandler(Context context) {
        mContext = context;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                Looper.prepare();
                Toast.makeText(mContext,"很抱歉，程序出现异常，即将退出。",Toast.LENGTH_SHORT).show();
                Looper.loop();
            }
        }).start();

    }
}
