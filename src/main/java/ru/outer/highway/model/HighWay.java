package ru.outer.highway.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class HighWay {
    private Transport transport;
    private String name;
    private Integer distance;
    private List<Transport> transportList;
    //@Autowired
    public HighWay(Transport transport){
        this.transport = transport;
    }
    public HighWay(){}
    public void moveTransport(){
      //  transportList.forEach((n) -> System.out.println(n.trafficType()));
        System.out.println(transport.trafficType());
    }
    public String moveStringTransport(){
        return transport.trafficType();
    }
    @Autowired
    @Qualifier("car")
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
