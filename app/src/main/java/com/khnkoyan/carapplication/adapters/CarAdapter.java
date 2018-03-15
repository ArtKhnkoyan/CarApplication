package com.khnkoyan.carapplication.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.khnkoyan.carapplication.R;
import com.khnkoyan.carapplication.activities.CarInfoActivity;
import com.khnkoyan.carapplication.models.Car;
import com.khnkoyan.carapplication.models.ResponseList;
import com.khnkoyan.carapplication.viewHolders.CarHolder;

import java.util.ArrayList;
import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarHolder> {
    private Context context;
    private List<ResponseList> carList;

    public CarAdapter(Context context, List<ResponseList> carList) {
        this.context = context;
        this.carList = carList;
    }

    @Override
    public CarHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CarHolder(LayoutInflater.from(context).inflate(R.layout.car_item, parent, false));
    }

    @Override
    public void onBindViewHolder(CarHolder holder, int position) {
        final ResponseList list = carList.get(position);
        holder.initData(context, list);

        holder.getTxtMakeName().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Car> carList = list.getCarList();
                Intent intent = new Intent(context, CarInfoActivity.class);
                intent.putExtra("carList", new Gson().toJson(carList));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (carList == null) {
            carList = new ArrayList<>();
        }
        return carList.size();
    }
}
