/*
* File: App.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT

* Reafactored by: Mihelik Tamás, II/1/N
*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        header();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Felhasználónév: ");
        String user = scanner.nextLine();
        System.out.print("Jelszó: ");
        String password = scanner.nextLine();
        System.out.print("Hely: ");
        String place = scanner.nextLine();
        scanner.close();

        boolean success = false;
        try {
            StoreUser storeUser = new StoreUser(user, password, place);
            FileWriter file = new FileWriter("pass.txt");
            PrintWriter pwr = new PrintWriter(file);
            pwr.println(storeUser.user);

            if(!storeUser.isHollow()) {
                pwr.println(storeUser.retrievePassword());
            }
            pwr.println(storeUser.place);
            pwr.close();
            success = true;
        } catch (IOException e) {
            System.err.println("Hiba! A fájlbaírás sikertelen. Keresse meg a fejlesztőt.");
        }
        isSuccess(success);
    }

    public static void header() {
        System.out.println("Nagy János\nJelszavak\nVerzió: 0.0.1\n");
    }

    public static void isSuccess(boolean success) {
        if(success) {
            System.out.println("Ok. A kiírás sikeres.");
        }else {
            System.out.println("Hiba! A kiírás sikertelen");
        }
    }
}
