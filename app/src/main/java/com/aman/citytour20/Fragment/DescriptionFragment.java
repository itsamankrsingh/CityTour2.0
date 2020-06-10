package com.aman.citytour20.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aman.citytour20.R;


public class DescriptionFragment extends Fragment {

    ImageView imageView;
    TextView textView;
    Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_description, container, false);
        imageView = view.findViewById(R.id.imgDescriptionImage);
        textView = view.findViewById(R.id.txtDescriptionText);
        toolbar = view.findViewById(R.id.toolbar);


        //receiving data from destination fragment using bundle
        Bundle bundle = getArguments();


        if (bundle != null) {
            String myInt = getArguments().getString("zero");

            if (myInt == "0") {
                imageView.setImageResource(R.drawable.ganga_dolphin);
                textView.setText(R.string.dolphin);
//          toolbar.setTitle("");
            }
            if (myInt == "1") {
                imageView.setImageResource(R.drawable.vikramshila_stupa);
                textView.setText(R.string.vikramshila);
//          toolbar.setTitle("");
            }
            if (myInt == "2") {
                imageView.setImageResource(R.drawable.mandar_mount);
                textView.setText(R.string.mandar);
//          toolbar.setTitle("");
            }
            if (myInt == "3") {
                imageView.setImageResource(R.drawable.jain_mandir);
                textView.setText(R.string.jain);
//          toolbar.setTitle("");
            }
            if (myInt == "4") {
                imageView.setImageResource(R.drawable.kuppaghat_ashram);
                textView.setText(R.string.kuppaghat);
//          toolbar.setTitle("");
            }
            if (myInt == "5") {
                imageView.setImageResource(R.drawable.greater_adjutant);
                textView.setText(R.string.garur);
//          toolbar.setTitle("");
            }
            if (myInt == "6") {
                imageView.setImageResource(R.drawable.vikramshila_setu);
                textView.setText(R.string.setu);
//          toolbar.setTitle("");
            }

            if (myInt == "7") {
                imageView.setImageResource(R.drawable.ajgaivinath_temple);
                textView.setText(R.string.ajgaivnath);
//          toolbar.setTitle("");
            }
        }


        /**/

        return view;
    }


}