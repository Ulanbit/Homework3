package com.example.lesson43;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<OnBoardModel>  list = new ArrayList<>();
    public ViewPagerAdapter(@NonNull FragmentManager fm, List<OnBoardModel> list) {
        super(fm);
        this.list=list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return itemOnBoardingFragment.newInstance(list.get(position).getTitle(),list.get(position).getDescription(),list.get(position).getImageView());
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
