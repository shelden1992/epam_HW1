package org.courses.part6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HelloDependenceTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();
    @InjectMocks
    HelloDependence helloDependence;
    @Mock
    HelloIndependence helloIndependence;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnConcatenationStringWhenPassStringNotEmpty() {
        String depend = "Hello Independence";
        when(helloIndependence.sayIndependencyHello(depend)).thenCallRealMethod();
        Assert.assertEquals(helloDependence.sayDependenceHello(depend), "Hello, dependence, I am independence. Hello Independence");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenPassStringEmpty() {
        exception.expect(IllegalArgumentException.class);
        helloDependence.sayDependenceHello("");
    }


}