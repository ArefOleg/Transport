package ru.outer.highway;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.outer.highway.model.*;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //  Transport transport = context.getBean("transportBean", Transport.class);
        //  HighWay highWay = new HighWay(transport);
        //Второй способ
     /*   HighWay highWay = context.getBean("highWayBean", HighWay.class);
        highWay.moveTransport();
        System.out.println(highWay.getDistance());
        System.out.println(highWay.getName());*/

        //Тестирование инициализаций
       /* Boat boat = context.getBean("boatBean", Boat.class);

        System.out.println(boat.trafficType());*/
        //Использование аннотаций
        /*Transport transport = context.getBean("someAirplane", Airplane.class);
        HighWay highWay = new HighWay(transport);
        highWay.moveTransport();*/

        /*HighWay highWay = context.getBean("highWay", HighWay.class);
        highWay.moveTransport();*/

        TransportSystem transportSystem = context.getBean("transportSystem", TransportSystem.class);
        System.out.println(transportSystem.toString());
        context.close();
    }
}
