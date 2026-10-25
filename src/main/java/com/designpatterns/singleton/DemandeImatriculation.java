package com.designpatterns.singleton;

public class DemandeImatriculation  extends Document {
    
    public DemandeImatriculation() {
    }
      @Override 
    public  void  afficher() {
        System.out.println("Affichage de la demande d'immatriculation");
    }
    @Override 
    public void imprimer() {
        System.out.println("Affichage de la demande d'immatriculation");
    }
}