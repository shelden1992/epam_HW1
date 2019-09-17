package part1;

import java.util.Scanner;

public class ConverterBinaryToDecimal {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter binary number");
            String binaryString = null;
            while (!(binaryString = scanner.nextLine()).equalsIgnoreCase("exit") && !binaryString.isEmpty()) {
                int decimal = 0, step = 0;
                try {
                    int binaryInt = Integer.parseInt(binaryString);
                    while (binaryInt != 0) {
                        String checkCorrectEnterBinary = binaryString.substring(binaryString.length() - 1 - step, binaryString.length() - step);
                        if (Integer.parseInt(checkCorrectEnterBinary) > 1 || binaryInt < 0) {
                            throw new IllegalArgumentException();
                        }
                        decimal += (binaryInt % 10) * Math.pow(2, step);
                        binaryInt = binaryInt / 10;
                        step++;
                    }
                    System.out.printf("Your's binary number %s is %d in decimal \n", binaryString, decimal);
                    System.out.println("************************************ \n");
                    System.out.println("If you whant escape enter \"exit\" or press enter or continue convert");
                } catch (IllegalArgumentException e) {
                    System.out.println("Please try again, you enter wrong binary number");
                }
            }


        }

    }


}
/**
 * or System.out.println(Integer.parseInt(binaryString, 2)), but it's not interesting
 */
