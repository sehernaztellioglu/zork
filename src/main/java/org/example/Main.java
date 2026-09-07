package org.example;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class main {
    static String[] answer1 = new String[10];
    static Scanner scanner = new Scanner(System.in);
    static int sayac = 0;

    static String kuzey = new String("north");
    static String guney = new String("south");
    static String dogu = new String("east");
    static String bati = new String("west");
    static String cevap = new String();

    static LinkedList<String> cumledekiKelimeler = new LinkedList<String>();



    static void directions (String direction, String print){


        cumledekiKelimeler.add(cevap);

           if(cumledekiKelimeler.contains(direction)){
               System.out.printf(print);
               sayac++;
           }else{
               System.out.println("i don't understand");

               }
           }





    static void main(String[] args) {


   System.out.println("you woke up in a forest in front of a cave, there are monsters in the forest\n");


        ArrayList<String> envanter = new ArrayList<>();

         String answer1 = scanner.nextLine();

         String cevap = answer1;





        while(sayac == 0) {

            if(cumledekiKelimeler.contains("north")){
            directions("north", "you came across a cave you can't see inside it's too dark\n");}
            if(cumledekiKelimeler.contains("north")){
            directions("east", "endless forest\n");}
            if(cumledekiKelimeler.contains("west")){
            directions("west", "endless forest\n");}
            if(cumledekiKelimeler.contains("south")){
            directions("south", "you saw a big troll and went to the cave to hide\n");}
            break;
        }
        while(sayac == 1){
            directions("north", "you entered the cave but can't see anything\n");
            directions("east", "rock, can't go through rock decided to go to north instead\n");
            directions("west", "rock, can't go through rock decided to go to north instead\n");
            directions("south", "you were too scared to go outside of the cave so went to north instead\n");
            break;
        }
        while(sayac == 2){
            directions("north", "there is a light up ahead\n");
            directions("east", "rock, can't go through rock so you decided to go to north instead and saw a light\n");
            directions("west", "rock, can't go through rock so you decided to go to north instead and saw a light\n");
            directions("south", "there is a light up ahead\n");
            break;
        }
    }
}
