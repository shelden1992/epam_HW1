package org.courses.part1;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.courses.part1.ConverterBinaryToDecimal.conditionExit;
import static org.courses.part1.ConverterBinaryToDecimal.convertMethod;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//import static org.courses.part1.ConverterBinaryToDecimal.convertMethodWithTryCatch;

public class ConverterBinaryToDecimalTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Test
    public void shouldThrowIllegalArgumentExceptionWhenPassNotIntegerToMethod() {
        exception.expect(IllegalArgumentException.class);
        String passString = "s";
        String messageError = String.format("For input string: \"%s\"", passString);
        exception.expectMessage(messageError);
        convertMethod(passString);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenPassNotValidBinaryNumber() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Not valid binary number");
        String binaryString = "123";
        convertMethod(binaryString);
    }

    @Test
    public void shouldReturnTrueIfPassStringEqualsExit() {
        boolean result = conditionExit("Exit");
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfPassStringIsEmpty() {
        boolean result = conditionExit("");
        assertTrue(result);
    }

    @Test
    public void shouldReturnValidValueDecimal() {
        String binaryString = "10";
        int resultDecimal = convertMethod(binaryString);
        int resultNativeMethod = Integer.parseInt(binaryString, 2);
        assertEquals(resultDecimal, resultNativeMethod);
    }
}