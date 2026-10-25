package com.designpatterns.singleton;

public class BonDeCommande  extends Document {
    
    public BonDeCommande() {
    }
      @Override 
    public  void  afficher() {
        System.out.println("Affichage du bon de commande"+super.contenu);
    }
    @Override 
    public void imprimer() {
        System.out.println("Impression du bon de commande"+super.contenu);
    }
}
