package org.courses.part5;

import org.apache.log4j.Logger;

public class ChangeBitInPosition {
    private static final Logger LOG = Logger.getLogger(ChangeBitInPosition.class);
    private static ChangeBitForZero changeBitForZero;
    private static ChangeBitForOne changeBitForOne;


    public ChangeBitInPosition(ChangeBitForZero changeBitForZero, ChangeBitForOne changeBitForOne) {
        this.changeBitForZero = changeBitForZero;
        this.changeBitForOne = changeBitForOne;
    }


    public static void main(String[] args) {

        LOG.info("Start run method");
        System.out.println(getNumberChangeOneToZero(4, 0));
        System.out.println(getNumberChangeZeroToOne(9, 0));
        LOG.info("Finish run method");

    }


    public static int getNumberChangeZeroToOne(int number, int position) {
        return changeBitForOne.changeBitForOneInPosition(number, position);

    }

    public static int getNumberChangeOneToZero(int number, int position) {
        return changeBitForZero.changeBitForZeroInPosition(number, position);
    }


}
