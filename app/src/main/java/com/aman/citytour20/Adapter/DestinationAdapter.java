package com.aman.citytour20.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.aman.citytour20.Activity.Destination;
import com.aman.citytour20.Fragment.DestinationFragment;
import com.aman.citytour20.R;

import java.util.ArrayList;

public class DestinationAdapter extends ArrayAdapter<Destination> {
    public DestinationAdapter(@NonNull Context context,ArrayList<Destination> destinations) {
        super(context, 0,destinations);
    }



  /*  public DestinationAdapter(DestinationFragment context, ArrayList<Destination> destinations) {
        super(context, 0, destinations);
    }*/

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.destination_single_row, parent, false);
        }

        Destination currentDestination=getItem(position);

        ImageView destinationImage=listItemView.findViewById(R.id.imgDestination);
        destinationImage.setImageResource(currentDestination.getImageResourceId());

        TextView destinationText=listItemView.findViewById(R.id.txtDestinationName);
        destinationText.setText(currentDestination.getPlaceName());

        return listItemView;
    }
}
