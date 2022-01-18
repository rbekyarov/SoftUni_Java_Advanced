package ADV05SetsAndMapsAdvanced.RE;

import java.util.*;
import java.util.stream.Collectors;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputCards1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> inputCards2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Set<Integer> playDeque1 = new LinkedHashSet<Integer>(inputCards1);
        Set<Integer> playDeque2 = new LinkedHashSet<Integer>(inputCards2);

        for (int i = 0; i < 50; i++) {
            int cardPlayer1 = playDeque1.iterator().next();
            int cardPlayer2 = playDeque2.iterator().next();
            playDeque1.remove(cardPlayer1);
            playDeque2.remove(cardPlayer2);
            if(cardPlayer1>cardPlayer2){
                playDeque1.add(cardPlayer1);
                playDeque1.add(cardPlayer2);
            }else if (cardPlayer1<cardPlayer2){
                playDeque2.add(cardPlayer1);
                playDeque2.add(cardPlayer2);
            }else {
                playDeque1.add(cardPlayer1);
                playDeque2.add(cardPlayer2);
            }
            if(playDeque1.isEmpty()||playDeque2.isEmpty()){
                break;
            }
        }
       if(playDeque1.size()>playDeque2.size()){
           System.out.println("First player win!");
       }else {
           System.out.println("Second player win!");
       }

    }
}
