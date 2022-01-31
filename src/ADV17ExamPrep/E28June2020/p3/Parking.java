package ADV17ExamPrep.E28June2020.p3;

import java.util.ArrayList;
import java.util.Collection;

public class Parking {
    private Collection<Car> carCollections;
    private String type;
    private int capacity;

    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.carCollections = new ArrayList<>();
    }

    public void add(Car car) {
        if (carCollections.size() < capacity) {
            carCollections.add(car);
        }

    }

    public boolean remove(String manufacturer, String model) {
        return  carCollections.removeIf(e -> e.getManufacturer().equals(manufacturer) && e.getModel().equals(model));

    }

    public Car getLatestCar() {
        return carCollections.stream().min((p1, p2) -> Integer.compare(p2.getYear(), p1.getYear())).orElse(null);
    }

    public Car getCar(String manufacturer, String model) {
        return this.carCollections.stream().filter(e -> e.getManufacturer().equals(manufacturer) && e.getModel().equals(model))
                .findFirst().orElse(null);
    }

    public int getCount() {
        return this.carCollections.size();
    }

    public String getStatistics() {
        StringBuilder output = new StringBuilder("The cars are parked in ");
        output.append(getType()).append(":").append(System.lineSeparator());
        carCollections.forEach(e -> output.append(e).append(System.lineSeparator()));
        return output.toString();
    }

    public String getType() {
        return type;
    }
}
