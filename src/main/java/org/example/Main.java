package org.example;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



class main {

    public void main(String[] arg) {

        System.out.println("you're in a forest in front of a cave there are monsters in the forest.");

        Scanner scanner = new Scanner(System.in);
        int sayac = 0;


        LinkedList<String> firstInput = new LinkedList<String>();


        String Input = scanner.nextLine().toLowerCase();
        firstInput.add(Input);
        String[] kelimeler = Input.split("\\s+");

        while (sayac == 0) {

            for (String eleman : kelimeler) {

                if (eleman.equals("north")) {
                    System.out.println("you went inside the cave but you can't see anything");
                    sayac++;

                }
                if (eleman.equals("east")) {
                    System.out.println("endless forest you decided the cave is your only option");
                    sayac++;

                }
                if (eleman.equals("west")) {
                    System.out.println("endless forest you decided the cave is your only option");
                    sayac++;

                }
                if (eleman.equals("south")) {
                    System.out.println("you saw a troll and decided to go inside the cave to hide");
                    sayac++;


                }
            }
        }
    }
}