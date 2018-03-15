package com.khnkoyan.carapplication.activities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.khnkoyan.carapplication.R;
import com.khnkoyan.carapplication.adapters.CarInfoAdapter;
import com.khnkoyan.carapplication.models.Car;

import java.util.List;

public class CarInfoActivity extends AppCompatActivity {
    private RecyclerView recCarInfo;
    private List<Car> carList;
    private String json;
    private GridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_info);
        recCarInfo = findViewById(R.id.recCarInfo);

        manager = new GridLayoutManager(this, 2);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            recCarInfo.setLayoutManager(manager);
        } else {
            manager.setSpanCount(4);
            recCarInfo.setLayoutManager(manager);
        }
        if (getIntent().hasExtra("carList")) {
            json = getIntent().getStringExtra("carList");
            carList = new Gson().fromJson(json, new TypeToken<List<Car>>() {
            }.getType());
            CarInfoAdapter carInfoAdapter = new CarInfoAdapter(this, carList);
            recCarInfo.setAdapter(carInfoAdapter);
        }
    }
}
