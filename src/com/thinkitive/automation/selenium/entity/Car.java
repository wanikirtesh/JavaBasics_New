package com.thinkitive.automation.selenium.entity;

public class Car implements CarInterface{
    private final String make;
    private final String model;

    private CarColor color;
    protected boolean isStarted = false;

    protected int speed;

    public Car(String make, String model,CarColor color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed =0;
        this.isStarted = false;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.color = CarColor.WHITE;
        this.speed =0;
        this.isStarted =false;
    }


    public void start(){
        isStarted = true;
    }

    public void stop(){
        isStarted = false;
    }

    @Override
    public void accelerate() {

    }

    public void applyAcceleration(){
        if(isStarted){
            speed+=10;
        }
    }

    public void applyBreak(){
        if(isStarted && speed>=10){
            speed-=10;
        }
    }


    public int getSpeed(){
        return speed;
    }

    public void repaintCar(CarColor color){
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public CarColor getColor() {
        return color;
    }

    public boolean isStarted() {
        return isStarted;
    }
}
