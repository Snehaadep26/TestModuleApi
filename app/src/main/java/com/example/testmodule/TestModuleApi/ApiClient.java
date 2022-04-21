package com.example.testmodule.TestModuleApi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit=null;
    public static final String TEST_URL="https://test.theclassroom.biz/api/";

    public static  Retrofit getRetrofit(){

        if (retrofit == null) {

            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(TEST_URL)
                    .client(okHttpClient)
                    .build();
        }

        return retrofit;

    }

    public static LogInService getLoginService(){

        LogInService loginService = getRetrofit().create(LogInService.class);
        return loginService;
    }

}
