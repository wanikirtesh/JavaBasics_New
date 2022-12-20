package com.thinkitive.automation.selenium.runnable;

import com.thinkitive.automation.selenium.entity.Car;
import com.thinkitive.automation.selenium.entity.CarColor;
import com.thinkitive.automation.selenium.entity.ExtendedSportsCar;
import com.thinkitive.automation.selenium.entity.SportsCar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Hyundai","i20", CarColor.RED);
        myCar.start();
        myCar.applyAcceleration();
        myCar.applyAcceleration();
        System.out.println(myCar.getSpeed());

        myCar.applyBreak();



        Car myCar2 = new Car("Hyundai","i10", CarColor.BLACK);
        myCar2.start();
        myCar2.applyAcceleration();





        System.out.println(myCar.getSpeed());
        System.out.println(myCar.getColor());

        SportsCar spCar = new SportsCar("TATA","Harier");

        spCar.start();
        spCar.accelerate(50);


        ExtendedSportsCar esp = new ExtendedSportsCar("TATA","Harier",CarColor.BLACK);
        esp.start();
        esp.applyAcceleration();
        System.out.println(esp.getSpeed());
    }
}