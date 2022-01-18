package ADV05SetsAndMapsAdvanced.RE;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[]realNumber = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<Double,Integer> map = new LinkedHashMap<>();
        for (double number : realNumber) {
            if (map.containsKey(number)){
                int currentCount = map.get(number);
                map.put(number,++currentCount);
            }else {
                map.put(number,1);
            }
        }
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
