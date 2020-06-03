package com.aman.citytour20.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aman.citytour20.R;


public class DemographyFragment extends Fragment {
TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_demography, container, false);

        textView=view.findViewById(R.id.txtDemographyText);
        textView.setText(R.string.demography_fragment);

        return view;
    }
}