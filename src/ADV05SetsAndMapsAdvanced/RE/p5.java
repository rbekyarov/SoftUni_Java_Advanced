package ADV05SetsAndMapsAdvanced.RE;

import java.util.*;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();

        while (countStudents-->0){
            String[]input = scanner.nextLine().split(" ");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            if(!studentsMap.containsKey(name)){
                studentsMap.put(name, new ArrayList<>());
            }
            studentsMap.get(name).add(grade);
        }
        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            double sum = 0;
            for (double current : entry.getValue()){
                System.out.printf("%.2f ",current);
                sum += current;
            }
            double avg = sum / entry.getValue().size();
            System.out.printf("(avg: %.2f)",avg);
            System.out.println();

        }
    }
}
