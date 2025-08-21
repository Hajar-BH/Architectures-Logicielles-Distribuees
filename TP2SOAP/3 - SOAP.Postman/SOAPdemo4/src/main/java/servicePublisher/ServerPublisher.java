package servicePublisher;

import service.HotelServiceWeb1Impl;
import service.HotelServiceWeb2Impl;
import util.HotelDataInitializer;
import javax.xml.ws.Endpoint;
 
public class ServerPublisher {
    public static void main(String[] args) {
        var hotels = HotelDataInitializer.initialiserHotels();
    
        Endpoint.publish("http://localhost:8080/ws/serviceWeb1", new HotelServiceWeb1Impl(hotels));
        Endpoint.publish("http://localhost:8080/ws/serviceWeb2", new HotelServiceWeb2Impl(hotels));

        System.out.println("Server Web 1 is ready at: http://localhost:8080/ws/serviceWeb1");
        System.out.println("Server Web 2 is ready at: http://localhost:8080/ws/serviceWeb2");
    }
}