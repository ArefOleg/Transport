package ru.outer.highway.model;

import org.springframework.stereotype.Component;

@Component("someAirplane")
public class Airplane implements Transport{

    @Override
    public String trafficType() {
        return "flying";
    }
}
