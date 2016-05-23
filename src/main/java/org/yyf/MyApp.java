package org.yyf;
// Import log4j classes.

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MyApp {

    // Define a static logger variable so that it references the
    // Logger instance named "org.yyf.MyApp".
    private static final Logger logger = LogManager.getLogger(MyApp.class);

    public static void main(final String... args) {

        // Set up a simple configuration that logs on the console.

        logger.trace("Entering application.");
        logger.error("Didn't do it.");
        logger.trace("Exiting application.");
    }
}