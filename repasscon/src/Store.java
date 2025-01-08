/*
* File: Store.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT
*/

//Itt következik a Store osztály
public class Store {
    
    /* 
    A user adattag 
    */
    String a;
    
    /* 
    A pass adattag 
    */
    String pass;
    
    /* 
    A place adattag 
    */
    String place;
    
    //Konstruktor
    public Store(String a, String pass, String place) {
        //Előkészítjük az adattagokat
        this.a = a;
        this.pass = pass;
        this.place = place;
    }//A konstruktor vége
    
    //Visszaadja a jelszót
    public String retrieval() {
        return pass;
    }//A retrieval vége
    
    //Visszaadja a helyet
    public boolean hollow() {
        if(this.pass == "") {
            return true;
        }else {
            return false;
        }
    }
}
