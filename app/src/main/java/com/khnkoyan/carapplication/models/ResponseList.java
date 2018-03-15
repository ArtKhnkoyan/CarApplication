package com.khnkoyan.carapplication.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseList {
    @SerializedName("պատկեր")
    private String iconUrl;
    @SerializedName("ավտոմեքենաներ")
    private List<Car> carList;

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
