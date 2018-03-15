package com.khnkoyan.carapplication.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.khnkoyan.carapplication.fragments.CarInfoFragment;

import java.util.List;

public class CarInfoPager extends FragmentStatePagerAdapter {
    List<String> imagesUrl;

    public CarInfoPager(FragmentManager fm) {
        super(fm);
    }

    public CarInfoPager(FragmentManager fm, List<String> imagesUrl) {
        this(fm);
        this.imagesUrl = imagesUrl;
    }

    @Override
    public Fragment getItem(int position) {
        String imageUrl = imagesUrl.get(position);
        return CarInfoFragment.newInstance(imageUrl);
    }

    @Override
    public int getCount() {
        return imagesUrl.size();
    }
}
