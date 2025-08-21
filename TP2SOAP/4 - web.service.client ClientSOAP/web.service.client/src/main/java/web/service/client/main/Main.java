package web.service.client.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceException;

import web.service.client.HotelServiceWeb1ImplService;
import web.service.client.HotelServiceWeb2ImplService;
import web.service.client.IHotelServiceWeb1;
import web.service.client.IHotelServiceWeb2;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Main {
    public static void main(String[] args) {
        try {
            URL url1 = new URL("http://localhost:8080/ws/serviceWeb1?wsdl");
            URL url2 = new URL("http://localhost:8080/ws/serviceWeb2?wsdl");

            HotelServiceWeb1ImplService serviceImpl1 = new HotelServiceWeb1ImplService(url1);
            HotelServiceWeb2ImplService serviceImpl2 = new HotelServiceWeb2ImplService(url2);

            IHotelServiceWeb1 proxy1 = serviceImpl1.getHotelServiceWeb1ImplPort();
            IHotelServiceWeb2 proxy2 = serviceImpl2.getHotelServiceWeb2ImplPort();

            
           
            System.out.println(proxy1.rechercheDisponibilites("2024-12-15", "2024-12-20", 1, 500.0));
            /*System.out.println(proxy2.effectueReservation
            				/("password123", 101, "Hajar Boumezgane", "hajar@email.com", 
            						"0711757179", dateArriveeDate, dateDepartDate));*/

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}