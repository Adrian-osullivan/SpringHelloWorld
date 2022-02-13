package com.ait.microservice.springhelloworld;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;
@SpringBootTest
public class HelloServiceTest {
    HelloService helloService;
    @Before
    public void setUp() throws Exception {
        helloService = new HelloService();
        System.out.println("HelloServiceTest.before");
    }

    @Test
    public void test() {
        assertEquals("Hello World 2022...", helloService.index());
        System.out.println("HelloServiceTest.test");
    }

}
