package com.jackchan.appdevelop.entity;

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
 * Package_Name：com.jackchan.appdevelop.entity
 * Version：1.0
 * time：2017/6/7 9:28
 * des ：${TODO}
 * gitVersion：2.12.0.windows.1
 * updateAuthor：AllenIverson
 * updateDate：2017/6/7 9:28
 * updateDes：${TODO}
 * ============================================================
 */
public class Response {

    public boolean error;
    public int     errorType; // 1 为Cookie 失效
    public String  errorMessage;
    public String  result;
}
