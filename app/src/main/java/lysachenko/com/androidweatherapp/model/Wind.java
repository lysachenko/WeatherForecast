package lysachenko.com.androidweatherapp.model;

public class Wind {

    private double speed;
    private double deg;

    public Wind() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "Speed: " + this.speed + " m/s, " + " deg: " + this.deg + "°";
    }
}
