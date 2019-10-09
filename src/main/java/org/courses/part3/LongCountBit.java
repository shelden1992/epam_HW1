package org.courses.part3;

import org.apache.log4j.Logger;

public class LongCountBit {
    private static Logger LOG = Logger.getLogger(IntegerCountBit.class);

    public int countBit(long value) {
        LOG.info("Enter value = " + value);
        int count = 0;
        while (value > 0) {
            count++;
            value >>= 1;
        }
        LOG.info("Return value = " + count + 1);
        return count + 1;
    }
}
