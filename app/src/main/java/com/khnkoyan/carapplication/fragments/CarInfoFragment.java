package com.khnkoyan.carapplication.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.khnkoyan.carapplication.R;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */
public class CarInfoFragment extends Fragment {
    private static final String CAR_IMAGE_URL = "imageUrl";
    private ImageView imgCarImages;
    private String imgUrl;

    public CarInfoFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance(String imageUrl) {
        Fragment fragment = new CarInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putString(CAR_IMAGE_URL, imageUrl);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(CAR_IMAGE_URL)) {
            imgUrl = getArguments().getString(CAR_IMAGE_URL);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car_info, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imgCarImages = view.findViewById(R.id.imgCarImages);
        Picasso.with(getActivity()).load(imgUrl).into(imgCarImages);
    }
}
