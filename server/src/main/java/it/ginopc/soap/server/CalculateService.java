package it.ginopc.soap.server;


import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

/**
 * @author maurizio.aru
 */
@WebService
public interface CalculateService {

    @WebMethod
    Double getArea(Double raggio);

    @WebMethod
    Double getCirconferenza(Double raggio);
}
