package ADV12DefiningClassesExercise.P3SpeedRacing;

public class Car {

    //Model, fuel amount, fuel cost for 1 kilometer and distance traveled
    private String model;
    private double fuelAmount;
    private double consumption;
    private double distance;

    public Car(String model, double fuelAmount, double consumption) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumption = consumption;
        this.distance = 0;
    }

    public boolean drive(double kilometersTravel) {
        double needFuel = kilometersTravel * this.consumption;
        if (needFuel < this.fuelAmount) {
            this.distance += kilometersTravel;
            this.fuelAmount -= needFuel;
            return true;
        } else {
            return false;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.0f", this.model, this.fuelAmount, this.distance);
    }
}
