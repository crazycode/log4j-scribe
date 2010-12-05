package com.magfa.sms.scribe_log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author <a href="mailto:tangliqun@snda.com">唐力群</a>
 */
public class ScribeMain {
    Logger log = LoggerFactory.getLogger(ScribeMain.class);

    public void testLogger(long i) {
        log.debug("测试一下中文");
        log.warn("收到" + i + "条信息");
    }

    public static void main(String[] args) {
        ScribeMain m = new ScribeMain();
        long l1 = System.currentTimeMillis();
        for (long l = 0; l < 100; l++) {
            m.testLogger(l);
        }
        long l2 = System.currentTimeMillis();
        System.out.println("时长：" + (l2 - l1) + "ms");
    }
}

