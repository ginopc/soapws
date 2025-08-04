package it.ginopc.soap.client;

import it.ginopc.soap.ws.CalculateService;
import it.ginopc.soap.ws.CalculateServiceImplService;

import javax.xml.soap.*;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class Client {
    public static final String CALCULATE_URL = "http://localhost:8080/calculate";
    public static final String HELLO_URL = "http://localhost:8080/hello";
    public static final CalculateServiceImplService service = new CalculateServiceImplService();


    public static void main(String[] args) {
        System.out.println("SOAP Demo - Cliente (avvio)");

        Double raggio = 2.0;
        Client client = new Client();

        Double area = client.getCalculatedArea(raggio);
        System.out.println(String.format("L'area del cerchio con raggio %f è : %f", raggio, area));

        Double circonferenza = client.getCalculatedPerimeter(raggio);
        System.out.println(String.format("La circonferenza del cerchio con raggio %f è: %f", raggio, circonferenza));

        System.out.println("SOAP Demo - Cliente (avvio)");
    }

    private Double getCalculatedPerimeter(Double raggio) {
        try {
            CalculateService port = service.getCalculateServiceImplPort();
            return port.getCirconferenza(raggio);
        }
        catch(Exception ex){
            System.err.println("Errore: "+ ex.getMessage());
            return 0.0;
        }
    }

    public Double getCalculatedArea(Double raggio){
        try {
            CalculateService port = service.getCalculateServiceImplPort();
            Double area = port.getArea(2.0);
            return area;
        }
        catch(Exception ex){
            System.err.println("Errore : "+ ex.getMessage());
            return 0.0;
        }
    }
}
