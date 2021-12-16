package ADV12DefiningClassesExercise.P7Google;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Person> personData = new HashMap<>();
        while (!command.equals("End")) {
            String[] currentCommand = command.split("\\s+");
            String name = currentCommand[0];
            if (!personData.containsKey(name)) {
                personData.put(name, new Person());
            }
            String typeData = currentCommand[1];

            switch (typeData) {

                case "company":
                    String companyName = currentCommand[2];
                    String department = currentCommand[3];
                    double salary = Double.parseDouble(currentCommand[4]);
                    Company company = new Company(companyName, department, salary);
                    personData.get(name).setCompany(company);

                    break;
                case "car":
                    String carModel = currentCommand[2];
                    int carSpeed = Integer.parseInt(currentCommand[3]);
                    Car car = new Car(carModel, carSpeed);
                    personData.get(name).setCar(car);
                    break;
                case "pokemon":
                    String pokemonName = currentCommand[2];
                    String pokemonType = currentCommand[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    personData.get(name).getPokemon().add(pokemon);
                    break;
                case "parents":

                    String parentName = currentCommand[2];
                    String parentBirthday = currentCommand[3];
                    Parents parents = new Parents(parentName, parentBirthday);
                    personData.get(name).getParents().add(parents);
                    break;
                case "children":
                    String childName = currentCommand[2];
                    String childBirthday = currentCommand[3];
                    Children children = new Children(childName, childBirthday);
                    personData.get(name).getChildren().add(children);
                    break;
            }


            command = scanner.nextLine();
        }

        String searchPerson = scanner.nextLine();
        System.out.println(searchPerson);

        Person dataPerson = personData.get(searchPerson);

        System.out.println(dataPerson);
    }
}
