package org.yyf;

import org.apache.logging.log4j.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * Created by tobi on 16-7-20.
 */
public class MDC {
    private static Logger LOG = LoggerFactory.getLogger(MDC.class);
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                ThreadContext.put("thredadId", String.valueOf(Thread.currentThread().getId()));
                ThreadContext.put("UUID", UUID.randomUUID().toString());
                LOG.error("Didn't do it.");
                LOG.warn("it's warn message !");
                LOG.info("it's info message !");
                LOG.debug("debug");
                LOG.trace("Entering application.");
                LOG.trace("Exiting application.");
                int j = 1 / 0;
            }).start();
        }


    }
}
