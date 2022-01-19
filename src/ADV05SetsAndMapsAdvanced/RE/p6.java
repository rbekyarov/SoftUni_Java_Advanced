/*
package ADV05SetsAndMapsAdvanced.RE;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String,Map<String,String>> map = new HashMap<>();

        int countLines = Integer.parseInt(scanner.nextLine());

        while (countLines-->0){
            String []input = scanner.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];
            if (!map.containsKey(continent)){
                map.put(continent,new LinkedHashMap<>());
            }
            map.get(continent).get();
        }
    }
}
*/
