package com.khnkoyan.carapplication.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.khnkoyan.carapplication.ConnectionAlertDialogFragment;
import com.khnkoyan.carapplication.utils.NetworkUtils;
import com.khnkoyan.carapplication.R;
import com.khnkoyan.carapplication.adapters.CarAdapter;
import com.khnkoyan.carapplication.models.ResponseList;
import com.khnkoyan.carapplication.request.GetCarInfo;

import java.util.List;

public class CarListActivity extends AppCompatActivity {
    private RecyclerView recCarList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);
        recCarList = findViewById(R.id.recCarList);
        recCarList.setLayoutManager(new LinearLayoutManager(this));

    }

    public void setupAdapter(List<ResponseList> carList) {
        CarAdapter carAdapter = new CarAdapter(this, carList);
        recCarList.setAdapter(carAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (NetworkUtils.isNetworkAvailable(this, false)) {
            GetCarInfo.getInfo(this);
        } else {
            FragmentManager fragmentManager = getSupportFragmentManager();
            ConnectionAlertDialogFragment myDialog = new ConnectionAlertDialogFragment();
            myDialog.show(fragmentManager, "ConnectionAlertDialogFragment");
        }
    }
}
