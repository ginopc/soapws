package it.ginopc.soap.server;

import jakarta.jws.WebService;

import java.util.logging.Logger;

/**
 * @author maurizio.aru
 */
@WebService(endpointInterface = "it.ginopc.soap.server.HelloService")
public class HelloServiceImpl implements HelloService {

    private static final Logger log = Logger.getLogger(HelloServiceImpl.class.getName());

    @Override
    public String sayHello(String name) {
        log.info("Chiamata a sayHello con parametro : ''"+ name);
        return String.format("Hello, %s", name);
    }
}
