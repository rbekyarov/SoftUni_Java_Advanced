package ADV13Generics.Jar;


public class Main {
    public static void main(String[] args) {
        Jar<Integer> jar = new Jar();
         jar.add(2);
         jar.add(3);
         jar.add(4);
         jar.remove();
       // System.out.println();
        Jar<String> jarStr = new Jar<>();
        jarStr.add("Pesho");
        jarStr.add("Gosho");
        jarStr.add("Misho");
        jarStr.remove();
        //System.out.println();
    }
}
