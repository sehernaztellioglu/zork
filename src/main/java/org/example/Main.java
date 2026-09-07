package org.example;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



class main {

    public void main(String[] arg){

        System.out.println("you're in a forest in front of a cave there are monsters in the forest.");

        Scanner scanner = new Scanner(System.in);

        LinkedList<String> yorungeler = new LinkedList<String>();
        yorungeler.add("north");
        yorungeler.add("east");
        yorungeler.add("west");
        yorungeler.add("south");



        LinkedList<String> firstInput = new LinkedList<String>();

        String Input = scanner.nextLine();

        firstInput.add(Input);

        if(firstInput.contains(yorungeler)){
            if(yorungeler.contains("north")){
                System.out.println("you went inside the cave but you can't see anything");
            }
            if(yorungeler.contains("east")){
                System.out.println("endless forest you decided the cave is your only option");
            }
            if(yorungeler.contains("west")){
                System.out.println("endless forest you decided the cave is your only option");
            }
            if(yorungeler.contains("south")){
                System.out.println("you saw a troll and decided to go inside the cave to hide");


            }
        }





    }
}