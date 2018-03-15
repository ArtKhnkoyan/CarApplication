package com.khnkoyan.carapplication.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Car {
    @SerializedName("պատկերներ")
    private List<String> imageList;
    @SerializedName("տեսակ")
    private String make;
    @SerializedName("տարի")
    private int year;
    @SerializedName("ղեկ")
    private String steeringWheel;
    @SerializedName("գինը")
    private String price;
    @SerializedName("մոդել")
    private String model;
    @SerializedName("փոխանցման տուփը")
    private String transmission;

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
