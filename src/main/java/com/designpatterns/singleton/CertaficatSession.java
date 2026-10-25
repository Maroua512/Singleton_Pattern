package com.designpatterns.singleton;

public class CertaficatSession  extends Document {
    
    public CertaficatSession() {
    }

      @Override
    public  void  afficher() {
        System.out.println("Affichage du certificat de session"+this.contenu);

    }
    @Override 
    public void imprimer(){
        System.out.println("Impression du certificat de session"+this.contenu);
    }
}
