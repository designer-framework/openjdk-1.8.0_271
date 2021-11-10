package org.designer.test.thread;

import lombok.extern.slf4j.Slf4j;
import org.designer.test.JhbApplication;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.concurrent.locks.LockSupport;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/8 17:19
 */
@Slf4j
@SpringBootTest(classes = JhbApplication.class)
class LockSupportTest {

    static Thread thread = Thread.currentThread();
    @LocalServerPort
    private Object obj;

    public static void main(String[] args) {
    }

    @BeforeEach
    void testBefore() {
        //线程休眠
        LockSupport.park(thread);
    }

    @Test
    void test() throws InterruptedException {
        LockSupport.park();
        LockSupport.unpark(thread);
    }

    @AfterEach
    void testAfter() throws InterruptedException {
    }

}
