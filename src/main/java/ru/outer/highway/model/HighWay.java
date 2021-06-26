package ru.outer.highway.model;

import java.util.ArrayList;
import java.util.List;

public class HighWay {
    private Transport transport;
    private String name;
    private Integer distance;
    private List<Transport> transportList;

    public HighWay(Transport transport){
        this.transport = transport;
    }
    public HighWay(){}
    public void moveTransport(){
      //  transportList.forEach((n) -> System.out.println(n.trafficType()));
        System.out.println(transport.trafficType());
    }

    public void setTransport(Transport transport){
        this.transport = transport;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getDistance(){
        return distance;
    }

    public void setDistance(Integer distance){
        this.distance = distance;
    }

    public void setTransportList(List<Transport> transportList){
        this.transportList = transportList;
    }
}
