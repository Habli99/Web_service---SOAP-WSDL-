package client;

import Proxy_4440.BanqueService;
import Proxy_4440.BanqueWS;
import Proxy_4440.Compte;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort(); // STUB

        System.out.println("\n**********************\n");

        // invoke ConversionEuroToDH()
        double montantCon = 200;
        double conversionToDH = proxy.conversionEuroToDH(montantCon);
        System.out.println("Conversion Euro To DH \n"+montantCon+ " € = "+conversionToDH+" DH");

        System.out.println("\n**********************\n");

        // invoke getCompte()
        int code = 1;
        Compte compte = proxy.getCompte(code);
        System.out.println("- Compte avec le code = "+code);
        System.out.println("code : "+compte.getCode());
        System.out.println("solde : "+compte.getSolde());
        System.out.println("date création : "+compte.getDateCreation());

        System.out.println("\n**********************\n");

        // invoke listComptes()
        System.out.println("- Liste des comptes : ");
        List<Compte> comptes = proxy.listComptes();
        comptes.forEach(c -> {
            System.out.println("\ncode : "+c.getCode());
            System.out.println("solde : "+c.getSolde());
            System.out.println("date création : "+c.getDateCreation()+"\n");
        });
    }
}
