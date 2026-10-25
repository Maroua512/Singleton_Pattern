package com.designpatterns.singleton;

public class LiasseClient extends Liasse {
    
   
    public LiasseClient(String information) {
        for (Document docModel : LiasseVierge.getInstance().getDocument()) {
            Document docCopie = docModel.duplique() ; 
             docCopie.remplit(information) ;
           this.documents.add(docCopie);
        }
    }
    
   public void afficher(){
      for(Document doc : documents){
        doc.afficher() ;
      }
   }

   public void imprimer(){
      for(Document doc : documents){
        doc.imprimer() ;
      }
   }
}
