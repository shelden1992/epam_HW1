package org.courses.part1;

//import org.apache.log4j.Logger;




import org.apache.log4j.Logger;

import java.io.PrintStream;
import java.util.Scanner;

public class ConverterBinaryToDecimal {
    private static final Logger LOG = Logger.getLogger(ConverterBinaryToDecimal.class);

    public static void main(String[] args) {
        LOG.info("Start application");


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter binary number");

            String binaryString;
            while ((binaryString = scanner.nextLine()) != null) {
                if (conditionExit(binaryString)) {
                    break;
                }
                try {
                    int decimal = convertMethod(binaryString);
                    String format = String.format("Your's binary number %s is %d in decimal \n", binaryString, decimal);
                    LOG.info(format);
                    System.out.println("************************************ \n");
                    System.out.println("If you whant escape enter \"exit\" or press enter or continue convert");
                } catch (IllegalArgumentException e) {
//                    System.out.println("Please try again, you enter wrong binary number");
                    LOG.error("Please try again, you enter wrong binary number", e);
                }
            }
        }
    }

    static public boolean conditionExit(String strScanner) {

        boolean exit = strScanner.equalsIgnoreCase("exit") || strScanner.isEmpty();
        if (exit) LOG.info("Exit application");
        return exit;

    }

    public static int convertMethod(String binaryString) {
        int decimal = 0, step = 0;
        int binaryInt = Integer.parseInt(binaryString);
        while (binaryInt != 0) {
            String checkCorrectEnterBinary = binaryString.substring(binaryString.length() - 1 - step, binaryString.length() - step);
            if (Integer.parseInt(checkCorrectEnterBinary) > 1 || binaryInt < 0) {
                IllegalArgumentException not_valid_binary_number = new IllegalArgumentException("Not valid binary number");
                LOG.error(not_valid_binary_number.getMessage(), not_valid_binary_number);
                throw not_valid_binary_number;
            }
            decimal += (binaryInt % 10) * Math.pow(2, step);
            binaryInt = binaryInt / 10;
            step++;
        }
        return decimal;
    }
}
