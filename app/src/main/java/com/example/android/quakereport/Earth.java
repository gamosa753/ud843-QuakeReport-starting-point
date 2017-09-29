package com.example.android.quakereport;

/**
 * Created by User on 27.09.2017.
 */

public class Earth {
    private String mLocation;
    private int mMag;
    private String mDate;

    public Earth(int Mag,String Location,String Date){
        mMag = Mag;
        mLocation = Location;
        mDate = Date;
    }

    public int  getMag(){ return mMag; }
    public String getLocation(){return mLocation;}
    public String getDate(){return mDate;}
}
