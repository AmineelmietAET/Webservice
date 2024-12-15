package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.example.Compte;

import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {

    @WebMethod
    public double conversion(double montantEuro) {
        // Implémentez votre logique ici, par exemple, une conversion EUR -> autre devise.
        return montantEuro * 1.1; // Exemple : conversion fictive avec un taux de 1.1.
    }

    @WebMethod
    public Compte getCompte(int code) {
        // Crée et retourne un compte avec un solde aléatoire.
        return new Compte(code, (1000 + Math.random() * 900), new Date());
    }

    public BanqueService() {
        // Constructeur par défaut.
    }

    @WebMethod
    public List<Compte> getComptes() {
        // Retourne une liste de comptes avec des codes et soldes aléatoires.
        return List.of(
                new Compte(1, (1000 + Math.random() * 900), new Date()),
                new Compte(2, (1000 + Math.random() * 900), new Date()),
                new Compte(3, (1000 + Math.random() * 900), new Date())
        );
    }
}
