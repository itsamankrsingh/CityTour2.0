package com.aman.citytour20.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aman.citytour20.R;


public class ReachFragment extends Fragment {

    TextView textView;
    ImageView imageView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reach, container, false);

        imageView = view.findViewById(R.id.imgReachFragmentImage);
        imageView.setImageResource(R.drawable.bgp_rly);

        textView = view.findViewById(R.id.txtReachText);
        textView.setText(R.string.how_to_reach_fragment);
        return view;
    }
}