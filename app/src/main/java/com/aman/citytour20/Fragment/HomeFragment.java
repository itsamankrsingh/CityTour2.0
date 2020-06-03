package com.aman.citytour20.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aman.citytour20.R;


public class HomeFragment extends Fragment {

    ImageView imageView;
    TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        imageView=view.findViewById(R.id.imgHomeImage);
        imageView.setImageResource(R.drawable.bhagalpur_tourist_map);

        textView=view.findViewById(R.id.txtHomeText);
        textView.setText(R.string.about_bhagalpur);

        return view;

    }
}