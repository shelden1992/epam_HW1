package org.courses.part3;

import org.junit.Test;

import static org.courses.part3.СountBit.countBit;
import static org.junit.Assert.assertEquals;

public class СountBitTest {
    @Test
    public void shouldReturnEightBitWhenPassMaxByte() {
        int bit = countBit(Byte.MAX_VALUE);
        assertEquals(bit, 8);
    }

    @Test
    public void shouldReturnThirtyTwoBitWhenPassMaxInt() {
        int bit = countBit(Integer.MAX_VALUE);
        assertEquals(bit, 32);
    }

    @Test
    public void shouldReturnSixtyFourBitWhenPassMaxLong() {
        int bit = countBit(Long.MAX_VALUE);
        assertEquals(bit, 64);
    }

    @Test
    public void shouldReturnSixteenBitWhenPassMaxShort() {
        int bit = countBit(Short.MAX_VALUE);
        assertEquals(bit, 16);
    }
}