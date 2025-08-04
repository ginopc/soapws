package it.ginopc.soap.server;

import jakarta.xml.ws.Endpoint;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class Server {

    private static final String BASE_WS_URI = "http://localhost:8080/ws";
    private Map<String, String> services = new HashMap<>();

    public static void main( String[] args ) {
        final String HELLO_SERVICE_URI = BASE_WS_URI + "/hello";
        Endpoint.publish(HELLO_SERVICE_URI, new HelloServiceImpl());
        System.out.println("*** Service runner at "+ HELLO_SERVICE_URI + "?wsdl");

        final String CALCULATE_SERVICE_URI = BASE_WS_URI + "/calculate";
        Endpoint.publish(CALCULATE_SERVICE_URI, new CalculateServiceImpl());
        System.out.println("*** Service runner at "+ CALCULATE_SERVICE_URI + "?wsdl");
    }
}
