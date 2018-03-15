package com.khnkoyan.carapplication;

import android.app.Application;

import com.khnkoyan.carapplication.net.CarApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CarApplication extends Application{
    private static CarApi carApi;

    public static CarApi getCarApi() {
        return carApi;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        carApi = retrofit.create(CarApi.class);
    }
}
