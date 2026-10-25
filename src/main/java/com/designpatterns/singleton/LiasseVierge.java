package com.designpatterns.singleton;
public class LiasseVierge  extends Liasse {
    private static LiasseVierge instance;
    private LiasseVierge() {
    }

    public static LiasseVierge getInstance() {
        if (instance == null) {
            instance = new LiasseVierge();
        }
        return instance;
    }
    public void ajouterDocument(Document document) {
       this.documents.add(document);
    }

    public void retirerDocument(Document document) {
         this.documents.remove(document);
    }
}