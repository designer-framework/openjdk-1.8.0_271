package org.designer.test.aqs;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: Designer
 * @date : 2021/9/29 10:05
 */

@Slf4j
class AqsTest {

    static ReentrantLock lock = new ReentrantLock(true);

    static CountDownLatch countDownLatch = new CountDownLatch(1);

    @BeforeEach
    void lockBefore() {
        lock.lock();
        log.error("1");
        run(() -> {
            log.error("2");
            lock.lock();
            countDownLatch.countDown();
            log.error("???");
        });
    }

    void run(Runnable runnable) {
        new Thread(runnable, "After Thread").start();
    }

    @Test
    void lock() throws InterruptedException {
        log.error("3");
        System.out.println(lock.isLocked());
        lock.unlock();
        log.error("解除锁定");
        countDownLatch.await();
    }

    @AfterEach
    void lockAfter() throws InterruptedException {
        log.error("4");
    }

}
