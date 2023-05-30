package com.rizalprasetia10120183.smallnote10120183.view.fragment;
//10120183
//Rizal Prasetia Supriadi
//IF 5
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rizalprasetia10120183.smallnote10120183.R;

public class InfoFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_info_slide2, container, false);
        return rootView;
    }
}

