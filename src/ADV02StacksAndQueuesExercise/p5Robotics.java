package ADV02StacksAndQueuesExercise;

import java.util.*;

public class p5Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] robotsArr = input.split(";");
        Map<String, Integer> robotsMap = new LinkedHashMap<>();
        ArrayDeque<String> queueProducts = new ArrayDeque<>();

        for (int i = 0; i < robotsArr.length; i++) {
            String nameRobot = robotsArr[i].split("-")[0];
            int timeRobot = Integer.parseInt(robotsArr[i].split("-")[1]);
            robotsMap.put(nameRobot, timeRobot);
        }
        String time = scanner.nextLine();
        int[] workingTime = new int[robotsMap.size()];

        int hours = Integer.parseInt(time.split(":")[0]);
        int min = Integer.parseInt(time.split(":")[1]);
        int sec = Integer.parseInt(time.split(":")[2]);
        long totalTimeInSek = hours * 3600L + min * 60L + sec;

        String product = scanner.nextLine();

        while (!product.equals("End")) {
            queueProducts.offer(product);
            product = scanner.nextLine();
        }
        while (!queueProducts.isEmpty()) {
            String currentProduct = queueProducts.poll();
            totalTimeInSek++;
            boolean isAssigned = false;
            for (int i = 0; i < workingTime.length; i++) {
                if (workingTime[i] > 0) {
                    --workingTime[i];
                }
            }
            for (int i = 0; i < workingTime.length; i++) {
                if (workingTime[i] == 0) {
                    int count = 0;
                    for (Map.Entry<String, Integer> entry : robotsMap.entrySet()) {
                        if (count == i) {
                            workingTime[i] = entry.getValue();
                            long hoursFinal = totalTimeInSek / 3600;
                            long minFinal = totalTimeInSek % 3600 / 60;
                            long secFinal = totalTimeInSek % 60;
                            System.out.printf("%s - %s [%02d:%02d:%02d]%n", entry.getKey(), currentProduct, hoursFinal, minFinal, secFinal);
                            isAssigned = true;
                            break;
                        }
                        count++;
                    }
                    break;
                }
            }
            if (!isAssigned) {
                queueProducts.offer(currentProduct);
            }
        }
    }
}
