package org.courses.part3;

public class ByteCountBit {
    public int countBit(byte value) {
        int count = 0;
        while (value > 0) {
            count++;
            value >>= 1;
        }
        return count + 1;
    }
}
