package it.ginopc.soap.server;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

/**
 * @author maurizio.aru
 */
@WebService
public interface HelloService {

    @WebMethod
    String sayHello(String name);
}
