package org.courses.part3;

public class СountBit {
    public static void main(String[] args) {

        System.out.println("bit in byte " + countBit(Byte.MAX_VALUE));
        System.out.println("bit in short " + countBit(Short.MAX_VALUE));
        System.out.println("bit in int " + countBit(Integer.MAX_VALUE));
        System.out.println("bit in long " + countBit(Long.MAX_VALUE));
    }

    public static int countBit(long value) {
        int count = 0;
        while (value > 0) {
            count++;
            value >>= 1;
        }
        return count + 1;
    }

    public static int countBit(int value) {
        int count = 0;
        while (value > 0) {
            count++;
            value >>= 1;
        }
        return count + 1;
    }

    public static int countBit(byte value) {
        int count = 0;
        while (value > 0) {
            count++;
            value >>= 1;
        }
        return count + 1;
    }

    public static int countBit(short value) {
        int count = 0;
        while (value > 0) {
            count++;
            value >>= 1;
        }
        return count + 1;
    }

}
