package com.ait.microservice.springhelloworld;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloServiceTest {
    HelloService helloService;
    @Before
    public void setUp() throws Exception {
        helloService = new HelloService();

    }

    @Test
    public void test() {
        assertEquals("Hello World 2022...", helloService.index());
    }

}
