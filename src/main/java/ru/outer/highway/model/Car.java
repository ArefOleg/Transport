package ru.outer.highway.model;

public class Car implements Transport{
    @Override
    public String trafficType(){
        return "Движение по земле";
    }
    public void setInit(){
        System.out.println("Initialization bean");
    }

    public void setDestroy(){
        System.out.println("Destroy");
    }
}
