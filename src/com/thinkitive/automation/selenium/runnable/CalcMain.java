package com.thinkitive.automation.selenium.runnable;

import com.thinkitive.automation.selenium.entity.Calc;

public class CalcMain {
    public static void main(String[] args) {
        CalcMain m = new CalcMain();
        m.doSomething();
        Calc c1 = new Calc();
        Calc c2 = new Calc();

        c1.memPlus(10);
        c1.memPlus(35);
        c1.memPlus(7);
        System.out.println(c1.getMemory());

        c2.memPlus(1);
        c2.memPlus(3);
        c2.memPlus(7);
        System.out.println(c2.getMemory());


    }

    public void doSomething(){

    }
}
