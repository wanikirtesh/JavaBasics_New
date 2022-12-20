package com.thinkitive.automation.selenium.entity;

public class ExtendedSportsCar extends Car{
    public ExtendedSportsCar(String make, String model, CarColor color) {
        super(make, model, color);
    }

    public ExtendedSportsCar(String make, String model) {
        super(make, model);
    }

    // compile time polymorphism
    public void applyAcceleration(int addedSpeed){
        if(isStarted){
            speed+=addedSpeed;
        }
    }

    //Run time polymorphism
    @Override
    public void applyAcceleration(){
        if(isStarted){
            speed+=20;
        }
    }
}
