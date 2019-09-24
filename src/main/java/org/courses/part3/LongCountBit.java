package org.courses.part3;

public class LongCountBit {
    public int countBit(long value) {
        int count = 0;
        while (value > 0) {
            count++;
            value >>= 1;
        }
        return count + 1;
    }
}
