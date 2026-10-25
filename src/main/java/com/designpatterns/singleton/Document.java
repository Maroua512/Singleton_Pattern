package com.designpatterns.singleton;

public abstract class  Document  implements Cloneable {
    
    String contenu = new String();
    public Document() {
    }

    public abstract void afficher();
    public abstract void imprimer();

    public void remplit(String contenu ) {
       this.contenu = contenu;
    }

    public Document duplique() {
         try {
            return (Document) this.clone();   // copie exacte de l'objet
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
