package com.aman.citytour20.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.aman.citytour20.Activity.Destination;
import com.aman.citytour20.Adapter.DestinationAdapter;
import com.aman.citytour20.R;

import java.util.ArrayList;


public class DestinationFragment extends Fragment {
    Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_destination, container, false);

        toolbar = view.findViewById(R.id.toolbar);


        ArrayList<Destination> destinations = new ArrayList<>();

        destinations.add(new Destination(R.drawable.ganga_dolphin, R.string.dolphin_name));
        destinations.add(new Destination(R.drawable.vikramshila_stupa, R.string.vikramshila_name));
        destinations.add(new Destination(R.drawable.mandar_mount, R.string.mandar_name));
        destinations.add(new Destination(R.drawable.lord_vasupujya, R.string.jain_name));
        destinations.add(new Destination(R.drawable.kuppaghat_ashram, R.string.kuppaghat_name));
        destinations.add(new Destination(R.drawable.greater_adjutant, R.string.garur_name));
        destinations.add(new Destination(R.drawable.vikramshila_setu, R.string.setu_name));
        destinations.add(new Destination(R.drawable.ajgaivinath_temple,R.string.ajgaivinath_name));


        DestinationAdapter adapter = new DestinationAdapter(getActivity(), destinations);
        ListView listView = view.findViewById(R.id.destinationList);
        listView.setAdapter(adapter);


        //adding clicklistener to listView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    DescriptionFragment fragment=new DescriptionFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("zero","0");
                    fragment.setArguments(bundle);
                    FragmentManager manager=getFragmentManager();
                    manager.beginTransaction().replace(R.id.frame, fragment)
                            .addToBackStack("Description").commit();
                    //toolbar.setTitle("Vikramshila");

                }
                if (position == 1) {
                    DescriptionFragment fragment=new DescriptionFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("zero","1");
                    fragment.setArguments(bundle);
                    FragmentManager manager=getFragmentManager();
                    manager.beginTransaction().replace(R.id.frame, fragment)
                            .addToBackStack("Description").commit();
                }
                if (position == 2) {
                    DescriptionFragment fragment=new DescriptionFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("zero","2");
                    fragment.setArguments(bundle);
                    FragmentManager manager=getFragmentManager();
                    manager.beginTransaction().replace(R.id.frame, fragment)
                            .addToBackStack("Description").commit();
                }
                if (position == 3) {
                    DescriptionFragment fragment=new DescriptionFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("zero","3");
                    fragment.setArguments(bundle);
                    FragmentManager manager=getFragmentManager();
                    manager.beginTransaction().replace(R.id.frame, fragment)
                            .addToBackStack("Description").commit();
                }
                if (position == 4) {
                    DescriptionFragment fragment=new DescriptionFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("zero","4");
                    fragment.setArguments(bundle);
                    FragmentManager manager=getFragmentManager();
                    manager.beginTransaction().replace(R.id.frame, fragment)
                            .addToBackStack("Description").commit();
                }
                if (position == 5) {
                    DescriptionFragment fragment=new DescriptionFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("zero","5");
                    fragment.setArguments(bundle);
                    FragmentManager manager=getFragmentManager();
                    manager.beginTransaction().replace(R.id.frame, fragment)
                            .addToBackStack("Description").commit();
                }
                if (position == 6) {
                    DescriptionFragment fragment=new DescriptionFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("zero","6");
                    fragment.setArguments(bundle);
                    FragmentManager manager=getFragmentManager();
                    manager.beginTransaction().replace(R.id.frame, fragment)
                            .addToBackStack("Description").commit();
                }
                if (position == 7) {
                    DescriptionFragment fragment=new DescriptionFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("zero","7");
                    fragment.setArguments(bundle);
                    FragmentManager manager=getFragmentManager();
                    manager.beginTransaction().replace(R.id.frame, fragment)
                            .addToBackStack("Description").commit();
                }
            }
        });

        return view;
    }
}