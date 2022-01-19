package ADV06SetsAndMapsAdvancedExercise.RE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String,Integer> map = new LinkedHashMap<>();
        int count =0;
        String name = "";

        while (!input.equals("stop")) {
            int quantity =0;
            if (count%2==0){
               name = input;
            } else {
                 quantity = Integer.parseInt(input);
            }
            if(!map.containsKey(name)){
                map.put(name,quantity);
            }else {
                int currentQuantity =map.get(name);
                map.put(name,quantity+currentQuantity);
            }
            count++;
            input = scanner.nextLine();

        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
