package com.example.a12f4567_labexam;
import junit.framework.TestCase;

public class myClassTest extends TestCase {
    myClass mc;

    public void setUp() throws Exception {
        super.setUp();
        mc=new myClass();
    }

    public void tearDown() throws Exception {
    }

    public void testSum() {
        int a=30,b=40;
        int act=mc.sum(a,b);
        int exp=70;
        assertEquals(act,exp);
    }
}