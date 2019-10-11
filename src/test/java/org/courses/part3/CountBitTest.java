package org.courses.part3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CountBitTest {
    @Mock
    ByteCountBit byteCountBitMock;
    @Mock
    IntegerCountBit integerCountBitNock;
    @Mock
    LongCountBit longCountBitMock;
    @Mock
    ShortCountBit shortCountBitMock;
    @InjectMocks
    CountBit countBit;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void shouldReturnEightBitWhenPassMaxByte() {
        byte number = Byte.MAX_VALUE;
        when(byteCountBitMock.countBit(number)).thenCallRealMethod();
        int result = countBit.getByteCountBit(number);
        Assert.assertEquals(result, 8);
    }

    @Test
    public void shouldReturnThirtyTwoBitWhenPassMaxInt() {
        int number = Integer.MAX_VALUE;
        when(integerCountBitNock.countBit(number)).thenCallRealMethod();
        int result = countBit.getIntegerCountBit(number);
        Assert.assertEquals(result, 32);
    }

    @Test
    public void shouldReturnSixtyFourBitWhenPassMaxLong() {
        long number = Long.MAX_VALUE;
        when(longCountBitMock.countBit(number)).thenCallRealMethod();
        int result = countBit.getLongCountBit(number);
        Assert.assertEquals(result, 64);
    }

    @Test
    public void shouldReturnSixteenBitWhenPassMaxShort() {
        short number = Short.MAX_VALUE;
        when(shortCountBitMock.countBit(number)).thenCallRealMethod();
        int result = countBit.getShortCountBit(number);
        Assert.assertEquals(result, 16);
    }
}