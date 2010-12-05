package com.magfa.sms.scribe_log4j;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * User: amin
 * Date: Jun 1, 2009
 * Time: 3:42:45 PM
 */
public class ScribeAppenderTest {

    @Test
    public void test1() {
        Logger log = Logger.getLogger("scribe");
        log.info("test 1");
    }

    @Test
    public void test2() {
        Logger log = Logger.getLogger("scribe");

        for (int i = 0; i < 100; i++)
            log.info("test 2: " + i);
    }

    @SuppressWarnings({"ThrowableInstanceNeverThrown"})
    @Test
    public void testLogException() {
        Logger log = Logger.getLogger("scribe");

        log.info("This is an exception", new RuntimeException("Should Print this one too!"));
    }

    public void testLogger(long i) {
        Logger log = Logger.getLogger("scribe");
        log.debug("测试一下中文");
        log.warn("收到" + i + "条信息");
    }

    @Test
    public void testSpeed() {
        long l1 = System.currentTimeMillis();
        for (long l = 0; l < 100; l++) {
            testLogger(l);
        }
        long l2 = System.currentTimeMillis();
        System.out.println("时长：" + (l2 - l1) + "ms");
    }

}
