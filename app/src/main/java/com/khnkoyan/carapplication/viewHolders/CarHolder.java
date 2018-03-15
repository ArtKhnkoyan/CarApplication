package com.khnkoyan.carapplication.viewHolders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.khnkoyan.carapplication.R;
import com.khnkoyan.carapplication.models.Car;
import com.khnkoyan.carapplication.models.ResponseList;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CarHolder extends RecyclerView.ViewHolder {
    private ImageView imgCarIcon;
    private TextView txtMakeName;

    public CarHolder(View itemView) {
        super(itemView);
        imgCarIcon = itemView.findViewById(R.id.imgCarIcon);
        txtMakeName = itemView.findViewById(R.id.txtMakeName);
    }

    public void initData(Context context, ResponseList list) {
        Picasso.with(context).load(list.getIconUrl()).into(imgCarIcon);
        List<Car> carList = list.getCarList();
        for (int i = 0; i < carList.size(); i++) {
            txtMakeName.setText(carList.get(i).getMake());
        }
    }

    public TextView getTxtMakeName() {
        return txtMakeName;
    }
}
