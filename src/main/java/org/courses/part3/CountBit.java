package org.courses.part3;

public class CountBit {
    ByteCountBit byteCountBit;
    IntegerCountBit integerCountBit;
    LongCountBit longCountBit;
    ShortCountBit shortCountBit;


    public static void main(String[] args) {
        CountBit countBit = new CountBit(new ByteCountBit(), new IntegerCountBit(), new LongCountBit(), new ShortCountBit());
        System.out.println("bit in byte " + countBit.getByteCountBit(Byte.MAX_VALUE));
        System.out.println("bit in short " + countBit.getShortCountBit(Short.MAX_VALUE));
        System.out.println("bit in int " + countBit.getIntegerCountBit(Integer.MAX_VALUE));
        System.out.println("bit in long " + countBit.getLongCountBit(Long.MAX_VALUE));
    }

    public int getIntegerCountBit(int i) {
        return integerCountBit.countBit(i);
    }

    public int getByteCountBit(byte i) {
        return byteCountBit.countBit(i);
    }

    public int getLongCountBit(long i) {
        return longCountBit.countBit(i);

    }

    public CountBit(ByteCountBit byteCountBit, IntegerCountBit integerCountBit, LongCountBit longCountBit, ShortCountBit shortCountBit) {
        this.byteCountBit = byteCountBit;
        this.integerCountBit = integerCountBit;
        this.longCountBit = longCountBit;
        this.shortCountBit = shortCountBit;
    }

    public int getShortCountBit(short i) {
        return shortCountBit.countBit(i);

    }


}
