package com.example.lesson43;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.lesson43.databinding.FragmentThirdBinding;


public class ThirdFragment extends Fragment {
    private FragmentThirdBinding b;

    public ThirdFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        b=FragmentThirdBinding.inflate(inflater);
        if (getArguments()!=null){
            b.txtVal.setText(requireArguments().getString("val"));
        }
        return b.getRoot();
    }
}