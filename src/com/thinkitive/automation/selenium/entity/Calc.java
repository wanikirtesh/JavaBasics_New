package com.thinkitive.automation.selenium.entity;

public class Calc {
    private static int memory;
    public Calc(){
        memory=0;
    }
    public static int add(int num1, int num2) {
        //memory++;
        return num1+num2;
    }

    public void memPlus(int value){
        memory+=value;
    }

    public void memMinus(int value){
        memory-=value;
    }
    public int getMemory(){
        return memory;
    }
}
