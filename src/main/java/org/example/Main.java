package org.example;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



class main {

    public static boolean kelimeVarMi (String Input, String expected){


        String[] kelimeler = Input.split("\\s+");
        for(String eleman : kelimeler){
            if(eleman.equals(expected)){

                return true;
            }
        }
        return false;
    }
    public static boolean envanterGoster(String Input){
        if(Input.equals("show inventory")){
            System.out.println("showing inventory");
            return true;
        }
        return false;
    }

    public void main(String[] arg) {

        System.out.println("you're in a forest in front of a cave there are monsters in the forest.");

        Scanner scanner = new Scanner(System.in);
        int sayac = 0;



        LinkedList<String> envanter = new LinkedList<String>();

        

        while (sayac == 0) {
            String Input = scanner.nextLine().toLowerCase();
            if(kelimeVarMi(Input,"north")){
                System.out.println("you moved further into the cave still can't see anything");
            }else if(kelimeVarMi(Input,"east")){
                System.out.println("you moved further into the cave still can't see anything");
            }else if (kelimeVarMi(Input,"west")){
                System.out.println("you moved further into the cave still can't see anything");
            }else if (kelimeVarMi(Input,"south")){
                System.out.println("you moved further into the cave still can't see anything");
            }else if(envanterGoster(Input)){

            }else{
                System.out.println("i don't understand");
            }
        }
    }
}