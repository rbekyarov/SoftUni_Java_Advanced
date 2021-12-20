package ADV12DefiningClassesExercise.P4RawData;

import java.util.List;

public class Car {
    private String carModel;
    private Engine engine;
    private Cargo cargo;
    private List<Tires> tires;

    public Car(String carModel, Engine engine, Cargo cargo, List<Tires> tires) {
        this.carModel = carModel;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Tires> getTires() {
        return tires;
    }

    public void setTires(List<Tires> tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", engine=" + engine +
                ", cargo=" + cargo +
                ", tires=" + tires +
                '}';
    }
}
