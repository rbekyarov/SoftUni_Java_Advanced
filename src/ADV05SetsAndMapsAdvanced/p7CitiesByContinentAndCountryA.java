package ADV05SetsAndMapsAdvanced;


import java.util.*;

public class p7CitiesByContinentAndCountryA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, List<String>>> destinations = new LinkedHashMap<>();

        int cities = Integer.parseInt(scanner.nextLine());
        for (int city = 0; city < cities; city++) {
            String[] data = scanner.nextLine().split("\\s+");
            String continent = data[0];
            String countries = data[1];
            String town = data[2];

            destinations.putIfAbsent(continent, new LinkedHashMap<>());
            destinations.get(continent).putIfAbsent(countries, new ArrayList<>());
            destinations.get(continent).get(countries).add(town);
        }
        destinations.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((k, v) ->
                    System.out.printf("%s -> %s%n", k, String.join(", ", v)));
        });
    }
}