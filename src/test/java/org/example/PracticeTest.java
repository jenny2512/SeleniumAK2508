package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PracticeTest {
    private static Practice practice;

    @BeforeClass
    public static void beforeClassRun (){
        practice = new Practice();
    }

    @Test
    public void kiemTraSoNTest1 (){
        String rs = practice.kiemTraSoN(-3);
        Assert.assertEquals("so am", rs);
    }

    @Test
    public void kiemTraSoNTest2 (){
        String rs = practice.kiemTraSoN(3);
        Assert.assertEquals("so duong", rs);
    }

    @Test
    public void kiemTraSoNTest3 (){
        String rs = practice.kiemTraSoN(0);
        Assert.assertEquals("so db", rs);
    }

}
