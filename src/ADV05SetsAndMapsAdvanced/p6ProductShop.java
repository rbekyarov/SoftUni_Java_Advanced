package ADV05SetsAndMapsAdvanced;

import java.util.*;

public class p6ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        Map<String, List<String>> shopsPrice = new TreeMap<>();

        while (!input[0].equals("Revision")) {
            String shopName = input[0];
            String product = input[1];
            String price = input[2];

            shopsPrice.putIfAbsent(shopName, new ArrayList<>());
            shopsPrice.get(shopName).add(product);
            shopsPrice.get(shopName).add(price);

            input = scanner.nextLine().split(", ");
        }
        shopsPrice.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + "->");
                    List<String> products = entry.getValue();
                    for (int i = 0; i < products.size(); i += 2) {
                        String product = products.get(i);
                        double price = Double.parseDouble(products.get(i + 1));
                        System.out.printf("Product: %s, Price: %.1f%n", product, price);
                    }
                });
    }
}
