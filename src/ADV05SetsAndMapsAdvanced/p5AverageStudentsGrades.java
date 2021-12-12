package ADV05SetsAndMapsAdvanced;

import java.util.*;

public class p5AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> nameGrade = new TreeMap<>();
        for (int i = 0; i <n ; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            if (!nameGrade.containsKey(name)) {
                nameGrade.put(name, new ArrayList<>());//за Value - създавме нов лист
            }
            nameGrade.get(name).add(grade);
        }
        nameGrade.entrySet().stream()
                .forEach(entry -> {
                    List<Double> grades = entry.getValue();
                    System.out.printf("%s -> %s%n",entry.getKey(),getListAvgAndValue(entry.getValue()));
                });
    }

    private static String getListAvgAndValue(List<Double> list) {
        StringBuilder out = new StringBuilder();
        for (Double e : list) {
            String eOut = String.format("%.2f ",e);
            out.append(eOut);
        }
        double sum=0;
        for (int i = 0; i <list.size() ; i++) {
            sum+=list.get(i);
        }
        double avg = sum/ list.size();
        String avgs = String.format("(avg: %.2f)",avg);
        return out.toString()+avgs;
    }
}
