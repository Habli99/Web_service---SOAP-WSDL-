package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

// POJO

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt * 11;
    }

    @WebMethod
    public Compte getCompte(int code){
        return new Compte(code, (500 + Math.random()) * 100, new Date());
    }

    @WebMethod
    public List<Compte> listComptes(){
        return Arrays.asList(
                new Compte(1, (500 + Math.random()) * 100, new Date()),
                new Compte(2, (500 + Math.random()) * 100, new Date()),
                new Compte(3, (500 + Math.random()) * 100, new Date())
        );
    }

}
