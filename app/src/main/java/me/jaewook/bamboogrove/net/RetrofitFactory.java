package me.jaewook.bamboogrove.net;

import java.util.logging.Level;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Jaewook on 2016-07-22.
 */
public class RetrofitFactory {


    private static final String ENDPOINT = "http://fbgrove.kr";

    private static RetrofitFactory instance;

    private Retrofit retrofit;

    public static RetrofitFactory getInstance() {
        return instance != null ? instance : new RetrofitFactory();
    }

    public RetrofitFactory() {
        instance = this;

        HttpLoggingInterceptor logger = new HttpLoggingInterceptor();
        logger.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logger)
                .build();
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ENDPOINT)
                .client(client)
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}

