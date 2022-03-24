package com.example.lesson43;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.viewpager.widget.ViewPager;

import android.hardware.lights.LightsManager;
import android.os.Bundle;
import android.view.View;

import com.example.lesson43.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    private ActivityMainBinding binding;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();
    }

    private void initViews() {binding.viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            if(binding.viewPager.getCurrentItem() == 0)
            {
                binding.txtSkip.setVisibility(View.VISIBLE);
                binding.finish.setVisibility(View.INVISIBLE);
            }
            if(binding.viewPager.getCurrentItem() == 1)
            {
                binding.txtSkip.setVisibility(View.VISIBLE);
                binding.finish.setVisibility(View.INVISIBLE);
            }
            if(binding.viewPager.getCurrentItem() == 2)
            {
                binding.txtSkip.setVisibility(View.INVISIBLE);
                binding.finish.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    });
        List<OnBoardModel> list = new ArrayList<>();
        list.add(new OnBoardModel("Welcome to surf","I provide essential stuff for your\n" +
                "ui designs every tuesday!",R.drawable.ic_ill));
        list.add(new OnBoardModel("Design Template uploads\n" +
                "Every Tuesday!","Make sure to take a look my uplab\n" +
                "profile every tuesday",R.drawable.ic_ill2));
        list.add(new OnBoardModel("Download now!","You can follow me if you wantand comment\n" +
                "on any to get some freebies",R.drawable.ic_ill3));
        adapter=new ViewPagerAdapter(getSupportFragmentManager(),list);


        binding.tabLayout.setupWithViewPager(binding.viewPager,true);
        binding.finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
     getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_home,new Home()).addToBackStack(null).commit();
            }
        });
        binding.txtSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.viewPager.setCurrentItem(binding.viewPager.getCurrentItem()+2);
            }
        });
        binding.viewPager.setAdapter(adapter);


    } }