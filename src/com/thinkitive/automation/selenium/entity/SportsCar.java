package com.thinkitive.automation.selenium.entity;

public class SportsCar implements CarInterface{
    private final String make;
    private final String model;

    private String color;
    private boolean isStarted = false;

    private int speed;

    public SportsCar(String make, String model,String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed =0;
        this.isStarted = false;
    }

    public SportsCar(String make, String model) {
        this.make = make;
        this.model = model;
        this.color = "White";
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
        if(isStarted){
            speed+=10;
        }
    }

    public void accelerate(int addedSpeed){
        if(isStarted){
            speed+=addedSpeed;
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

    public void repaintCar(String color){
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isStarted() {
        return isStarted;
    }
}
