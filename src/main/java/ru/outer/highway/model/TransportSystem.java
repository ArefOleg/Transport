package ru.outer.highway.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransportSystem {
    private int id;
    private HighWay highWay;
    @Autowired
    public TransportSystem(HighWay highWay){
        this.id = 1;
        this.highWay = highWay;
    }
    @Override
    public String toString(){
        return "Transport System " + id + " " + highWay.moveStringTransport();
    }
}
