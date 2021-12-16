package ADV12DefiningClassesExercise.P3SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCar = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carMap = new LinkedHashMap<>();

        while (countCar > 0) {
            String[] dataCar = scanner.nextLine().split("\\s+");
            String model = dataCar[0];
            double fuelAmount = Double.parseDouble(dataCar[1]);
            double consumption = Double.parseDouble(dataCar[2]);
            Car car = new Car(model, fuelAmount, consumption);
            carMap.put(model, car);

            countCar--;
        }
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String carModel = command.split(" ")[1];
            double kilometersTravel = Double.parseDouble(command.split(" ")[2]);
            Car car = carMap.get(carModel); // знаем че модела е уникален
            if (!car.drive(kilometersTravel)) {
                System.out.println("Insufficient fuel for the drive");
            }
            command = scanner.nextLine();
        }
        carMap.values().forEach(System.out::println);
    }
}
