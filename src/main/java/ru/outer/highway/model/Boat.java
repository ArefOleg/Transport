package ru.outer.highway.model;

public class Boat implements Transport{
    @Override
    public String trafficType() {
        return "Движение по воде";
    }

    private Boat(){} // Нельзя создать класс

    public static Boat getBoat(){
        return new Boat();
    }

}
