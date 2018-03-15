package com.khnkoyan.carapplication.net;

import com.khnkoyan.carapplication.models.ResponseList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CarApi {
    @GET("5aa8da9f320000da1d16591c")
    Call<List<ResponseList>> getCarList();
}
