package org.courses.part2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertPositiveToNegativeTest {
    private ConvertPositiveToNegative instance;

    @Before
    public void setUp() {
        instance = new ConvertPositiveToNegative();
    }

    @Test
    public void shouldReturnNegativeNumberWhenPassToMethodPositiveValue() {
        int result = instance.convertMethod(1);
        assertTrue(result < 0);

    }

    @Test
    public void shouldReturnPositiveNumberWhenPassToMethodNegativeValue() {
        int result = instance.convertMethod(-1);
        assertTrue(result > 0);
    }

    @Test
    public void shouldReturnSameModuleNumberWhenPassToMethodPositiveValue() {
        int passNumber = 10;
        int result = instance.convertMethod(passNumber);
        assertEquals(passNumber, Math.abs(result));
    }

    @Test
    public void shouldReturnSameNumberWhenPassToMethodNegativeModuleValue() {
        int passNumber = -10;
        int result = instance.convertMethod(passNumber);
        assertEquals(Math.abs(passNumber), result);
    }
}