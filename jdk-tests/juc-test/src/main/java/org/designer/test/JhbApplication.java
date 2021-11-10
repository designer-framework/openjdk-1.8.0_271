package org.designer.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: Designer
 * @date : 2021/9/29 10:05
 */
@SpringBootApplication(scanBasePackages = {"com.jhb"})
public class JhbApplication {

    public static void main(String[] args) {
        SpringApplication.run(JhbApplication.class, args);
    }

}
