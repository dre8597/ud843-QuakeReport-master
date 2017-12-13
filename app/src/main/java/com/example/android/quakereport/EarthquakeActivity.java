package com.example.android.quakereport;

public class EarthquakeActivity {

    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private double mMagnitude;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mLocation;

    private String mUrl;
    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;

    /*
    * Create a new AndroidFlavor object.
    *
    * @param vMagnitude is the name of the Android version (e.g. Gingerbread)
    * @param vLocation is the corresponding Android version number (e.g. 2.3-2.7)
    * @param image is drawable reference ID that corresponds to the Android version
    * */
    public EarthquakeActivity(double vMagnitude, String vLocation, long timeInMilliseconds, String url) {
        mMagnitude = vMagnitude;
        mLocation = vLocation;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Get the name of the Android version
     */
    public double getManitude() {
        return mMagnitude;
    }

    /**
     * Get the Android version number
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }


}
