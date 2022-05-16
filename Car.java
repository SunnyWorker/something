package com.company;

public class Car implements CarAbilities {
    String mark;
    String model;
    public boolean isRunning = false;
    public int maxSpeed;
    public int wheelRadius;
    public double accCapacity;
    private double weight;
    private boolean isAutopilot;


    public Car(String mark, String model, int maxSpeed, int wheelRadius, double accCapacity, double weight) {
        this.mark = mark;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.wheelRadius = wheelRadius;
        this.accCapacity = accCapacity;
        this.weight = weight;
        this.isAutopilot = false;
    }

    public Car(String mark, String model, int maxSpeed, int wheelRadius, double accCapacity, double weight, boolean isAutopilot) {
        this(mark,model,maxSpeed,wheelRadius,accCapacity,weight);
        this.isAutopilot = isAutopilot;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAutopilot() {
        return isAutopilot;
    }

    public void setAutopilot(boolean autopilot) {
        isAutopilot = autopilot;
    }

    @Override
    public void start() {
        if(isRunning==false) {
            System.out.println("Car " + mark + " " + model + " has been started!");
            isRunning = true;
        }
        else {
            System.out.println("Car " + mark + " " + model + " is already running!");
        }
    }

    @Override
    public void run() {
        if(isRunning==false) {
            System.out.println("Car " + mark + " " + model + " is not running!");
        }
        else {
            System.out.println("Car " + mark + " " + model + " is running!");
        }
    }

    @Override
    public void move() {
        System.out.println("Car " + mark + " " + model + " can ride "+maxSpeed+" km per hour!");
    }

    @Override
    public void stop() {
        if(isRunning==true) {
            System.out.println("Car " + mark + " " + model + " has been stopped!");
            isRunning = false;
        }
        else {
            System.out.println("Car " + mark + " " + model + " is already stopped!");
        }
    }

    @Override
    public String toString() {
        return "Car " + mark + " " + model + ", maximum speed "+maxSpeed+" km per hour.\n"+
                "Wheel Radius "+ wheelRadius+" inchs, accumulator capacity is "+String.format("%.2f",accCapacity)+" A per hour!\n"+
                "Weight is "+String.format("%.2f",weight)+" tons, has autopilot - "+isAutopilot;
    }

}
