package org.designer.test;

import lombok.extern.slf4j.Slf4j;
import org.designer.test.statemachine.Api;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: Designer
 * @date : 2021/9/29 10:05
 */
@Slf4j
class JhbApplicationTest {
    //org.springframework.boot.logging.logback/base.xml
    @Autowired
    private Api api;

    @BeforeEach
    void testBefore() {
    }

    @Test
    void test() throws InterruptedException {
        api.审批通过();
    }

    @AfterEach
    void testAfter() throws InterruptedException {
    }

}
