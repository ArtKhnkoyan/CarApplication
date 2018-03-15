package com.khnkoyan.carapplication.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.khnkoyan.carapplication.R;
import com.khnkoyan.carapplication.adapters.CarInfoPager;
import com.khnkoyan.carapplication.models.Car;

public class CarPagerActivity extends AppCompatActivity {
    private ViewPager carImagesContainer;
    private TextView txtCarMake;
    private TextView txtCarYear;
    private TextView txtCarSteeringWheel;
    private TextView txtCarModel;
    private TextView txtCarTransmission;
    private TextView txtCarPrice;
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_pager);

        setViewId();

        if (getIntent().hasExtra("car")) {
            car = new Gson().fromJson(getIntent().getStringExtra("car"), Car.class);
        }
        setCarData();
    }

    private void setViewId() {
        carImagesContainer = findViewById(R.id.carImagesContainer);
        txtCarMake = findViewById(R.id.txtCarMake);
        txtCarYear = findViewById(R.id.txtCarYear);
        txtCarSteeringWheel = findViewById(R.id.txtCarSteeringWheel);
        txtCarModel = findViewById(R.id.txtCarModel);
        txtCarTransmission = findViewById(R.id.txtCarTransmission);
        txtCarPrice = findViewById(R.id.txtCarPrice);
    }

    private void setCarData() {
        CarInfoPager carInfoPager = new CarInfoPager(getSupportFragmentManager(), car.getImageList());
        carImagesContainer.setAdapter(carInfoPager);
        txtCarMake.setText((String.valueOf(" Տեսակ " + car.getMake())));
        txtCarYear.setText(String.valueOf(" Տարի " + car.getYear() + "թ."));
        txtCarSteeringWheel.setText(String.valueOf(" Ղեկ " + car.getSteeringWheel()));
        txtCarModel.setText(String.valueOf("Մոդել: " + car.getModel()));
        txtCarTransmission.setText(String.valueOf("Փոխանցման տուփը: " + car.getTransmission()));
        txtCarPrice.setText(String.valueOf("Գինը: " + car.getPrice()));
    }
}
