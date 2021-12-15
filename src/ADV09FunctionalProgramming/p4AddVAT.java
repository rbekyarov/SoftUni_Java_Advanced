package ADV09FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class p4AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnaryOperator<Double> addVat = e -> e * 1.2;

        List<Double> inputValues = Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble).map(e -> addVat.apply(e)).collect(Collectors.toList());

        System.out.println("Prices with VAT:");
        inputValues.stream().forEach(e -> System.out.printf("%.2f%n", e));
    }
}
