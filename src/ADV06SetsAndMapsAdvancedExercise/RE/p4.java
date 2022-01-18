package ADV06SetsAndMapsAdvancedExercise.RE;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();

        Map<Character,Integer> map = new TreeMap<>();

        for (int i = 0; i <input.length() ; i++) {
            char current = input.charAt(i);
            if(!map.containsKey(current)){
                map.put(current,1);
            }else {
                int currentValue = map.get(current);
                map.put(current,currentValue+1);
            }


        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.printf("%c: %d time/s%n",entry.getKey(),entry.getValue());
        }

    }
}
