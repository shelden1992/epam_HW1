package org.courses.part1;

import java.util.Scanner;

public class ConverterBinaryToDecimal {
    private static String binaryString = null;

    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter binary number");
            while (conditionExit(scanner)) {
                try {
                    int decimal = convertMethod(binaryString);
                    System.out.printf("Your's binary number %s is %d in decimal \n", binaryString, decimal);
                    System.out.println("************************************ \n");
                    System.out.println("If you whant escape enter \"exit\" or press enter or continue convert");
                } catch (IllegalArgumentException e) {
                    System.out.println("Please try again, you enter wrong binary number");
                }
            }
        }
    }

    static private boolean conditionExit(Scanner scanner) {

        return !(binaryString = scanner.nextLine()).equalsIgnoreCase("exit") && !binaryString.isEmpty();

    }

    static private int convertMethod(String binaryString) {
        int binaryInt = Integer.parseInt(binaryString);
        int decimal = 0, step = 0;
        while (binaryInt != 0) {
            String checkCorrectEnterBinary = binaryString.substring(binaryString.length() - 1 - step, binaryString.length() - step);
            if (Integer.parseInt(checkCorrectEnterBinary) > 1 || binaryInt < 0) {
                throw new IllegalArgumentException();
            }
            decimal += (binaryInt % 10) * Math.pow(2, step);
            binaryInt = binaryInt / 10;
            step++;
        }
        return decimal;


    }
}
