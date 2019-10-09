package org.courses.part2;


import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ConvertPositiveToNegative {
    private static final Logger LOG = Logger.getLogger(ConvertPositiveToNegative.class);

    public static void main(String[] args) {
        LOG.info("Start application");
        System.out.println(new ConvertPositiveToNegative().convertMethod(-10));


    }

    public int convertMethod(int a) {

        return ~a + 1;
    }


}
