package ADV17ExamPrep.E20February2021.dealership;

import java.util.ArrayList;
import java.util.Collection;

public class Dealership {
    private String name;
    private int capacity;
    Collection<Car> data;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (this.capacity > data.size()) {
            data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {
        return data.removeIf(e -> e.getManufacturer().equals(manufacturer) && e.getModel().equals(model));
    }

    public Car getLatestCar() {
        return this.data.stream().min((p1, p2) -> Integer.compare(p2.getYear(), p1.getYear())).orElse(null);
    }

    public Car getCar(String manufacturer, String model) {
        return data.stream().filter(e -> e.getManufacturer().equals(manufacturer) && e.getModel().equals(model)).findFirst().orElse(null);
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("The cars are in a car dealership %s:",this.name));
        output.append(System.lineSeparator());
        this.data.forEach(e -> output.append(e).append(System.lineSeparator()));

        return output.toString();

    }
}
