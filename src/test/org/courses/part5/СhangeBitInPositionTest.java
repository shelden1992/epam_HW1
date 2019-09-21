package org.courses.part5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class СhangeBitInPositionTest {


    @Test
    public void shoutReturnZeroWhenPositionLargeNumberFirstMethod() {
        int number = 0;
        int position = 1;
        int result = СhangeBitInPosition.changeBitForOneInPosition(number, position);
        assertEquals(0, result);
    }

    @Test
    public void shoutReturnZeroWhenPositionLargeNumberSecondMethod() {
        int number = 0;
        int position = 1;
        int result = СhangeBitInPosition.changeBitForZeroInPosition(number, position);
        assertEquals(0, result);
    }


}