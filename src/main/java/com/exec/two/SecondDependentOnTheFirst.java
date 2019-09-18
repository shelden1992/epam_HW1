package com.exec.two;

import com.exec.one.FirstIndependentClass;

public class SecondDependentOnTheFirst {
    private static final String SECOND_STRING = "Hello, I am second dependent class";

    public static void main(String[] args) {
        System.out.println(FirstIndependentClass.getiFirstClass() + " " + SECOND_STRING);

    }
}
