package web_service;

import jakarta.xml.ws.Endpoint;
import org.example.BanqueService;

public class ServeurJaxWS {
    public static void main(String[] args) {
        // URL de publication du service web
        String url = "http://localhost:8080/BanqueService";

        // Création de l'instance du service web
        BanqueService banqueService = new BanqueService();

        // Publication du service web
        Endpoint.publish(url, banqueService);

        System.out.println("Service web déployé sur : " + url);
    }
}
