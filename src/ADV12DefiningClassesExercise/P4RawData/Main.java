package ADV12DefiningClassesExercise.P4RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carMap = new LinkedHashMap<>();
        Car car = null;
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");

            String carModel = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double tire1Pressure = Double.parseDouble(input[5]);
            int tire1Age = Integer.parseInt(input[6]);
            double tire2Pressure = Double.parseDouble(input[7]);
            int tire2Age = Integer.parseInt(input[8]);
            double tire3Pressure = Double.parseDouble(input[9]);
            int tire3Age = Integer.parseInt(input[10]);
            double tire4Pressure = Double.parseDouble(input[11]);
            int tire4Age = Integer.parseInt(input[12]);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            car = new Car(carModel, engine, cargo, new ArrayList<>());

            car.getTires().add(new Tires(tire1Pressure, tire1Age));
            car.getTires().add(new Tires(tire2Pressure, tire2Age));
            car.getTires().add(new Tires(tire3Pressure, tire3Age));
            car.getTires().add(new Tires(tire4Pressure, tire4Age));
            carMap.put(carModel, car);
        }
        String command = scanner.nextLine();


        if (command.equals("flamable")){
            carMap.entrySet().stream().filter(e-> e.getValue().getCargo().getCargoType().equals("flamable"))
                    .filter(e-> e.getValue().getEngine().getEnginePower()>250)
                    .forEach(e-> System.out.println(e.getKey()));
        }else {
            carMap.entrySet().stream().filter(e-> e.getValue().getCargo().getCargoType().equals("fragile"))

                    .forEach(e-> System.out.println(e.getKey()));
        }




    }
}

