package server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJaxWS {

    public static void main(String[] args) {
        String url = "http://0.0.0.0:4440/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service bien déployé sur : "+url);
    }
}
