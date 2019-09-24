package org.courses.part3;

public class ShortCountBit {
    public int countBit(short value) {
        int count = 0;
        while (value > 0) {
            count++;
            value >>= 1;
        }
        return count + 1;
    }
}
