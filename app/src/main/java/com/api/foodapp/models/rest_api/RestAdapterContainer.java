package com.api.foodapp.models.rest_api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.api.foodapp.utils.Constant.DUMMY_BASE_URL;

public class RestAdapterContainer {
    private static Retrofit instance;

    public static Retrofit getInstance() {
        if (instance==null) {
            instance=new Retrofit.Builder().baseUrl(DUMMY_BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return instance;
    }
}
