package ADV01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p1BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if(input.equals("back")){
                if(stack.size()<=1){
                    System.out.println("no previous URLs");
                }else {
                    stack.pop();
                    System.out.println(stack.peek());
                }
            }else {
                stack.push(input);
                System.out.println(input);
            }
            input = scanner.nextLine();
        }


    }
}
