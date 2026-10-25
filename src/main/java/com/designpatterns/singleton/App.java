package com.designpatterns.singleton;

public final class App {

    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Projet Singleton Pattern configure avec Maven.");
  
        BonDeCommande bonDeCommande = new BonDeCommande();
        CertaficatSession cs = new CertaficatSession() ;
        DemandeImatriculation di = new DemandeImatriculation();
        LiasseVierge liasseVierge = LiasseVierge.getInstance();
        
        liasseVierge.ajouterDocument(bonDeCommande);
        liasseVierge.ajouterDocument(cs);
        liasseVierge.ajouterDocument(di);

        LiasseClient lc1 = new LiasseClient("Informations du client 1");
        lc1.afficher();
        LiasseClient lc2 = new LiasseClient("Informations du client2");
        lc2.afficher();


    }
}
