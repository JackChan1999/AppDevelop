package com.jackchan.appdevelop.utils;

import android.os.AsyncTask;

import com.jackchan.appdevelop.entity.Response;

public abstract class RequestAsyncTask extends AsyncTask<String, Void, Response> {
    public abstract void onSuccess(String content);

    public abstract void onFail(String errorMessage);

    @Override
    protected void onPreExecute() {
    }

    @Override
    protected void onPostExecute(Response response) {
        if (response.error) {
            onFail(response.errorMessage);
        } else {
            onSuccess(response.result);
        }
    }
}