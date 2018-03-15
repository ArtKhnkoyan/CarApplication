package com.khnkoyan.carapplication.viewHolders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.khnkoyan.carapplication.R;
import com.khnkoyan.carapplication.models.Car;
import com.squareup.picasso.Picasso;

public class CarInfoHolder extends RecyclerView.ViewHolder {
    private ImageView imgCarInfo;
    private TextView txtMake;
    private TextView txtYear;
    private TextView txtPrice;

    public CarInfoHolder(View itemView) {
        super(itemView);
        imgCarInfo = itemView.findViewById(R.id.imgCarInfo);
        txtMake = itemView.findViewById(R.id.txtMake);
        txtYear = itemView.findViewById(R.id.txtYear);
        txtPrice = itemView.findViewById(R.id.txtPrice);
    }


    public void initData(Context context, Car car) {
        String imageUrl = car.getImageList().get(0);
        Picasso.with(context).load(imageUrl).into(imgCarInfo);
        String s = car.getMake() + " " + car.getModel();
        txtMake.setText(s);
        txtYear.setText(String.valueOf(car.getYear() + "թ."));
        txtPrice.setText(car.getPrice());
    }

    public ImageView getImgCarInfo() {
        return imgCarInfo;
    }
}
