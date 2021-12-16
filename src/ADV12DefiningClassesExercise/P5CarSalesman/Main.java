package ADV12DefiningClassesExercise.P5CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int engineCount = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engines = new HashMap<>();
        Engine engine = null;
        Car car = null;
        while (engineCount > 0) {
            String[] input = scanner.nextLine().split(" ");
            String model = input[0];
            int power = Integer.parseInt(input[1]);
            engine = new Engine(model, power);
            if (input.length == 4) {
                int displacements = Integer.parseInt(input[2]);
                String efficiency = input[3];
                engine = new Engine(model, power, displacements, efficiency);
            } else if (input.length == 3) {
                try {
                    int displacements = Integer.parseInt(input[2]);
                    engine = new Engine(model, power, displacements);
                } catch (NumberFormatException e) {
                    String efficiency = input[2];
                    engine = new Engine(model, power, efficiency);
                }
            }
            engines.put(model, engine);

            engineCount--;
        }
        int carCount = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        while (carCount > 0) {
            String[] dataCar = scanner.nextLine().split(" ");

            String model = dataCar[0];
            String engineModel = dataCar[1];
            Engine carEngine = engines.get(engineModel);
            car = new Car(model, carEngine);
            if (dataCar.length == 4) {
                int weight = Integer.parseInt(dataCar[2]);
                String color = dataCar[3];
                car = new Car(model, carEngine, weight, color);
            } else if (dataCar.length == 3) {
                try {
                    int weight = Integer.parseInt(dataCar[2]);
                    car = new Car(model, carEngine, weight);
                } catch (NumberFormatException e) {
                    String color = dataCar[2];
                    car = new Car(model, carEngine, color);
                }
            }
            cars.add(car);
            carCount--;
        }
        cars.stream().forEach(System.out::println);
    }
}
