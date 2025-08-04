package it.ginopc.soap.server;


import jakarta.jws.WebService;

import java.util.logging.Logger;

/**
 * @author maurizio.aru
 */
@WebService(endpointInterface = "it.ginopc.soap.server.CalculateService")
public class CalculateServiceImpl implements CalculateService {

    private static final Logger log = Logger.getLogger(CalculateServiceImpl.class.getName());

    @Override
    public Double getArea(Double raggio) {
        log.info("Chiamata al service "+ this.getClass().getName() + ".getArea("+ raggio + ")");
        return Math.pow(raggio, 2.0) * Math.PI;
    }

    @Override
    public Double getCirconferenza(Double raggio) {
        log.info("Chiamata al service "+ this.getClass().getName() + ".getCirconferenza("+ raggio + ")");
        return 2 * Math.PI * raggio;
    }
}
