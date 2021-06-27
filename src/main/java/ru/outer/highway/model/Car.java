package ru.outer.highway.model;

import org.springframework.stereotype.Component;

@Component
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
