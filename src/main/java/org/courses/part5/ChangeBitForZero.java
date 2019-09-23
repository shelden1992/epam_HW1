package org.courses.part5;

public class ChangeBitForZero {
    public int changeBitForZeroInPosition(int number, int position) {
        String s = Integer.toBinaryString(number);
        if (position + 1 > s.length() || position < 0 || number < 0) {
            System.err.println("Not correct position");
            return 0;
        }
        return (number & ~(1 << position));

    }
}
