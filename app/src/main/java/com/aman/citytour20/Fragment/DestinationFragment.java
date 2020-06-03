package com.aman.citytour20.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.aman.citytour20.Activity.Destination;
import com.aman.citytour20.Adapter.DestinationAdapter;
import com.aman.citytour20.R;

import java.util.ArrayList;


public class DestinationFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_destination, container, false);

        ArrayList<Destination> destinations = new ArrayList<>();

        destinations.add(new Destination(R.drawable.ganga_dolphin, R.string.dolphin_name));
        destinations.add(new Destination(R.drawable.vikramshila_stupa, R.string.vikramshila_name));
        destinations.add(new Destination(R.drawable.mandar_mount, R.string.mandar_name));
        destinations.add(new Destination(R.drawable.lord_vasupujya, R.string.jain_name));
        destinations.add(new Destination(R.drawable.kuppaghat_ashram, R.string.kuppaghat_name));
        destinations.add(new Destination(R.drawable.greater_adjutant, R.string.garur_name));
        destinations.add(new Destination(R.drawable.vikramshila_setu, R.string.setu_name));


        DestinationAdapter adapter = new DestinationAdapter(getActivity(), destinations);
        ListView listView = view.findViewById(R.id.destinationList);
        listView.setAdapter(adapter);

        return view;
    }
}