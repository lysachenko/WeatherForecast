package lysachenko.com.androidweatherapp.model;

import android.support.annotation.NonNull;

public class Coord {
    private double lon;
    private double lat;

    public Coord() {
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @NonNull
    @Override
    public String toString() {
        return "[" + this.lat + ", " + this.lon + ']';
    }
}
