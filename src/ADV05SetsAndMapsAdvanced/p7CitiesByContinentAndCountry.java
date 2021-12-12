package ADV05SetsAndMapsAdvanced;

import java.util.*;

public class p7CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, LinkedHashMap<String, List<String>>> dataMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String continents = input[0];
            String countries = input[1];
            String cities = input[2];

            dataMap.putIfAbsent(continents, new LinkedHashMap<>());
            LinkedHashMap<String, List<String>> innerMap = dataMap.get(continents);
            innerMap.putIfAbsent(countries, new ArrayList<>());
            innerMap.get(countries).add(cities);
        }
        dataMap.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((k, v) ->
                    System.out.printf("  %s -> %s%n", k, String.join(", ", v)));
        });
    }
}




