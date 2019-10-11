package org.courses.part5;

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
public class ChangeBitInPositionTest {
    @InjectMocks
    ChangeBitInPosition changeBitInPosition;

    @Mock
    ChangeBitForOne changeBitForOneMock;
    @Mock
    ChangeBitForZero changeBitForZeroMock;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnSameNumberWhenPassNumberMultipleOfTwoAndPositionZero() {
        int number = 2;
        when(changeBitForZeroMock.changeBitForZeroInPosition(number, 0)).thenCallRealMethod();
        int result = changeBitInPosition.getNumberChangeOneToZero(number, 0);
        Assert.assertEquals(result, number);
    }

    @Test
    public void shouldReturnOneMoreNumberWhenPassNumberMultipleOfTwoAndPositionZero() {
        int number = 8;
        when(changeBitForOneMock.changeBitForOneInPosition(number, 0)).thenCallRealMethod();
        int result = changeBitInPosition.getNumberChangeZeroToOne(number, 0);
        Assert.assertEquals(result, number + 1);
    }

    @Test
    public void shouldReturnOneLessNumberWhenPassOddNumberAndPositionZero() {
        int number = 15;
        when(changeBitForZeroMock.changeBitForZeroInPosition(number, 0)).thenCallRealMethod();
        int result = changeBitInPosition.getNumberChangeOneToZero(number, 0);
        Assert.assertEquals(result, number - 1);
    }

    @Test
    public void shouldReturnSameNumberWhenPassOddNumberAndPositionZero() {
        int number = 9;
        when(changeBitForOneMock.changeBitForOneInPosition(number, 0)).thenCallRealMethod();
        int result = changeBitInPosition.getNumberChangeZeroToOne(number, 0);
        Assert.assertEquals(result, number);
    }
}