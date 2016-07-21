package org.yyf;
// Import log4j classes.

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MyAppd {

    // Define a static logger variable so that it references the
    // Logger instance named "org.yyf.MyApp".
    private static final Logger logger = LogManager.getLogger(MyAppd.class);

    public static void main(final String... args) {

        // Set up a simple configuration that logs on the console.

        logger.error("Didn't do it.");
        logger.warn("it's warn message !");
        logger.info("it's info message !");
        logger.debug("debug");
        logger.trace("Entering application.");
        logger.trace("Exiting application.");
        int i = 1 / 0;
    }
}