package com.aman.citytour20.Activity;

public class Destination {
    private int mImageResourceId;
    //private int mPlaceDescriptionId;
    private int mPlaceNameId;

    public Destination(int imageResourceId, int placeName) {
        this.mImageResourceId = imageResourceId;
        //this.mPlaceDescriptionId = placeDescription;
        this.mPlaceNameId = placeName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

   /* public int getPlaceDescription() {
        return mPlaceDescriptionId;
    }*/

    public int getPlaceName() {
        return mPlaceNameId;
    }
}
