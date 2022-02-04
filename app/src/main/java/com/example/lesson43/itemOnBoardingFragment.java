package com.example.lesson43;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson43.databinding.FragmentItemOnBoardingBinding;


public class itemOnBoardingFragment extends Fragment {

    private FragmentItemOnBoardingBinding itemOnBoardingBinding;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";

    private String mParam1;
    private String mParam2;
    private Integer mParam3;

    public itemOnBoardingFragment() {

    }


    public static itemOnBoardingFragment newInstance(String param1, String param2, Integer image) {
        itemOnBoardingFragment fragment = new itemOnBoardingFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putInt(ARG_PARAM3, image);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getInt(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        itemOnBoardingBinding = FragmentItemOnBoardingBinding.inflate(inflater);
        itemOnBoardingBinding.txtTitle.setText(mParam1);
        itemOnBoardingBinding.txtDescription.setText(mParam2);
        itemOnBoardingBinding.image.setImageResource(mParam3);
        return itemOnBoardingBinding.getRoot();
    }
}