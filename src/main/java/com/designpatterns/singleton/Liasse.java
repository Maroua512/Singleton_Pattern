package com.designpatterns.singleton;
import java.util.List;
import java.util.ArrayList ;
public abstract class Liasse {
    
    List<Document> documents = new ArrayList<Document>();
    public Liasse() {
       

    }
    public  List<Document> getDocument() {
        return documents;
    }
    public void setDocument(List<Document> documents) {
        this.documents = documents;
    }
}
