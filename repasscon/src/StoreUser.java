/*
* File: Store.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT
*/

public class StoreUser {
    String user;
    String password;
    String place;
    
    public StoreUser(String user, String password, String place) {
        this.user = user;
        this.password = password;
        this.place = place;
    }
    
    public String retrievePassword() {
        return password;
    }

    public boolean isHollow() {
        if(this.password == "") {
            return true;
        }else {
            return false;
        }
    }
}
