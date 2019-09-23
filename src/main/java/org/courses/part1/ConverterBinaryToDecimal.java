package org.courses.part1;

import java.util.Scanner;

public class ConverterBinaryToDecimal {
//    private static String  = null;

    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter binary number");

            String binaryString;
            while ((binaryString = scanner.nextLine()) != null) {
                if (conditionExit(binaryString)) {
                    break;
                }
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

    static public boolean conditionExit(String strScanner) {

        return strScanner.equalsIgnoreCase("exit") || strScanner.isEmpty();

    }

    public static int convertMethod(String binaryString) {
        int decimal = 0, step = 0;
        int binaryInt = Integer.parseInt(binaryString);
        while (binaryInt != 0) {
            String checkCorrectEnterBinary = binaryString.substring(binaryString.length() - 1 - step, binaryString.length() - step);
            if (Integer.parseInt(checkCorrectEnterBinary) > 1 || binaryInt < 0) {
                throw new IllegalArgumentException("Not valid binary number");
            }
            decimal += (binaryInt % 10) * Math.pow(2, step);
            binaryInt = binaryInt / 10;
            step++;
        }
        return decimal;
    }
}
