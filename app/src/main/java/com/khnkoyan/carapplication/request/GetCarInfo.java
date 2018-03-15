package com.khnkoyan.carapplication.request;

import android.widget.Toast;

import com.khnkoyan.carapplication.CarApplication;
import com.khnkoyan.carapplication.activities.CarListActivity;
import com.khnkoyan.carapplication.models.ResponseList;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetCarInfo {
    public static void getInfo(final CarListActivity activity) {
        CarApplication.getCarApi().getCarList().enqueue(new Callback<List<ResponseList>>() {
            @Override
            public void onResponse(Call<List<ResponseList>> call, Response<List<ResponseList>> response) {
                if (response.isSuccessful()) {
                    if (activity != null) {
                        List<ResponseList> carList = response.body();
                        activity.setupAdapter(carList);
                    }
                }
            }

            @Override
            public void onFailure(Call<List<ResponseList>> call, Throwable t) {
                Toast.makeText(activity, "failed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
