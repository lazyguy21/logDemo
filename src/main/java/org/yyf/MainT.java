package org.yyf;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by tobi on 16-5-12.
 */
public class MainT {
    private static final String TAG = "MainT";
    private static Logger LOG = LoggerFactory.getLogger(TAG);
    private static org.apache.logging.log4j.Logger log4j2logger = LogManager.getLogger();
    public static void main(String[] args) {
        LOG.info("hhhaaa");
        System.out.println("haha");
    }
}
