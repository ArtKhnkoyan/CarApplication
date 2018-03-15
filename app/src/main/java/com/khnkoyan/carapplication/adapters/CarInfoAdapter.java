package com.khnkoyan.carapplication.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.khnkoyan.carapplication.R;
import com.khnkoyan.carapplication.activities.CarPagerActivity;
import com.khnkoyan.carapplication.models.Car;
import com.khnkoyan.carapplication.viewHolders.CarInfoHolder;

import java.util.List;

public class CarInfoAdapter extends RecyclerView.Adapter<CarInfoHolder> {
    private Context context;
    private List<Car> carList;

    public CarInfoAdapter(Context context, List<Car> carList) {
        this.context = context;
        this.carList = carList;
    }

    @Override
    public CarInfoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CarInfoHolder(LayoutInflater.from(context).inflate(R.layout.car_item_info, parent, false));
    }

    @Override
    public void onBindViewHolder(CarInfoHolder holder, int position) {
        final Car car = carList.get(position);
        holder.initData(context, car);

        holder.getImgCarInfo().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CarPagerActivity.class);
                intent.putExtra("car", new Gson().toJson(car));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }
}
