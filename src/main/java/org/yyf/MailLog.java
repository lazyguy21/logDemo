package org.yyf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by tobi on 16-7-28.
 */
public class MailLog {
    private static final Logger mailLogger = LoggerFactory.getLogger("mailLogger");
    public static void main(String[] args) {
        RuntimeException e = new RuntimeException("aasdfa");
        mailLogger.debug("afasdfasd",e);
        mailLogger.debug("send email complete,no matter if it really succeed {} {} {}","asdf","asdf",e.getStackTrace());
    }
}
