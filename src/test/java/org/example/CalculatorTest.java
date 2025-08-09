package org.example;

import org.junit.*;

public class CalculatorTest {
    private static Calculator calculator;

    @BeforeClass
    public static void beforeClassRun (){
        System.out.println("Run truoc moi Class");
        calculator = new Calculator(); //đưa lên đây để chỉ cần new obj 1 lần
    }

    @Before
    public void beforeTestRun (){
        System.out.println("Run truoc moi Test");
        //calculator = new Calculator();
    }

    @After
    public void afterTestRun (){
        System.out.println("Run sau moi Test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Run sau moi Class");
    }


    @Test
    public void addTest (){
        double actual = calculator.add(20, 30);
        Assert.assertEquals(50, actual,0.001);
    }

    @Test
    public void minusTest (){
        double actual = calculator.minus(20, 30);
        Assert.assertEquals(-10, actual, 0.001);
    }

    @Test
    @Ignore //skip qua khong chay test nay
    //@Ignore ("reason: abc") thêm lí do
    public void multipleTest (){
        double actual =  calculator.multiple(20, 30);
        Assert.assertEquals(600, actual, 0.001);
    }

    @Test (timeout = 3000)
    public void slowMethodTest (){
        double actual = calculator.slowMethod(20,30);
        Assert.assertEquals(50, actual, 0.001);
    }

    @Test(expected = RuntimeException.class)
    public void multipleMaxValueTest (){
        double actual =  calculator.multiple(Double.MAX_VALUE, Double.MAX_VALUE);
        //case nay throw ra Exception la ok
    }

}
