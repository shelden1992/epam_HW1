package org.courses.part5;

import org.apache.log4j.Logger;

public class ChangeBitForZero {
    Logger LOG = Logger.getLogger(ChangeBitForZero.class);

    public int changeBitForZeroInPosition(int number, int position) {
        LOG.info("Change number = " + number + " bit for ZERO in position = " + position);
        String s = Integer.toBinaryString(number);
        if (position + 1 > s.length() || position < 0 || number < 0) {
            LOG.error("Not correct position. Result = 0");
            return 0;
        }

        int result = number & ~(1 << position);
        LOG.info("Result = " + result);
        return result;

    }
}
