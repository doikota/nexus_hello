package com.doikota.nexus_hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void testHello() {
    	Main main = new Main();
        assertEquals("Hello world!!!", main.hello());
    }
    
    @Test
    public void testMain() {
    	Main.main(new String[]{});
        assertTrue(true);
    }
}
