package ADV05SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p4CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> map = new LinkedHashMap<>();

        for (Double e : input) {
            if (!map.containsKey(e)) {
                map.put(e, 1);
            } else {
                int valueMap = map.get(e);
                map.put(e, ++valueMap);
            }
        }
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
