package com.hwt.tmall.test;

import org.junit.Test;

import java.io.File;

public class Test1 {

    @Test
    public void run1() {
        File imageFolder= new File("k:/img");
        File file = new File(imageFolder,"1.jpg");
        if(!file.getParentFile().exists())
            file.getParentFile().mkdirs();
    }

    @Test
    public void run2() {
        TestA a = new TestA1();
        a.a();


    }
}
