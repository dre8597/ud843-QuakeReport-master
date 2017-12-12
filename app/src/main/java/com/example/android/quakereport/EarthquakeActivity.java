package com.example.android.quakereport;


public class EarthquakeActivity {

    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mMagnitude;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mLocation;

    // Drawable resource ID
    private String mDate;

    /*
    * Create a new AndroidFlavor object.
    *
    * @param vMagnitude is the name of the Android version (e.g. Gingerbread)
    * @param vLocation is the corresponding Android version number (e.g. 2.3-2.7)
    * @param image is drawable reference ID that corresponds to the Android version
    * */
    public EarthquakeActivity(String vMagnitude, String vLocation, String vDate)
    {
        mMagnitude = vMagnitude;
        mLocation = vLocation;
        mDate = vDate;
    }

    /**
     * Get the name of the Android version
     */
    public String getManitude() {
        return mMagnitude;
    }

    /**
     * Get the Android version number
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the image resource ID
     */
    public String getDate() {
        return mDate;
    }


}
