package org.example;

import java.util.LinkedList;
import java.util.Scanner;



class main {

    static LinkedList<String> envanter = new LinkedList<String>();

    public void main(String[] arg) {

        System.out.println("you're in a forest you're searching for your lost sister. There are rumors that trolls are kidnapping people so your best option is to go to their territory and search for your sister.  ");

        Scanner scanner = new Scanner(System.in);
        int sayac = 0;
        boolean north1 = false;
        boolean east1 = false;
        boolean west1 = false;
        boolean south1 = false;


        //ilk seçim


        while (sayac == 0) {
            String Input = scanner.nextLine().toLowerCase();
            if (kelimeVarMi(Input, "north")) {
                System.out.println("you walked a bit to the north and now you see a smoke rising to the sky");
                sayac++;
                north1 = true;
            } else if (kelimeVarMi(Input, "west")) {
                System.out.println("you see bunch of big shaped things could be giant human or something more dangerous");
                sayac++;
                west1 = true;
            } else if (kelimeVarMi(Input, "east")) {
                System.out.println("you see a troll in the distance and someone in a cage");
                sayac++;
                east1 = true;
            } else if (kelimeVarMi(Input, "south")) {
                System.out.println("that's the road you came from it leads to your house but you haven't found your sister");

            } else if (envanterGoster(Input)) {
                System.out.println(envanter);
            } else {
                System.out.println("i don't understand");
            }
        }


        //ikinci seçim
        boolean north2 = false;
        boolean east2 = false;
        boolean west2 = false;
        boolean south2 = false;

        if (north1) {
            while (sayac == 1) {
                String Input = scanner.nextLine().toLowerCase();
                if (kelimeVarMi(Input, "north")) {
                    System.out.println("you see a house and on top of it it says ironsmith you went inside and there is a man asking you buy one of his axe's he says it's the best weapon against trolls would you like to buy the axe?");
                    sayac++;
                    north2 = true;


                } else if (kelimeVarMi(Input, "east")) {
                    System.out.println("you see another house and on top of it it says alchemist you went inside and there is woman with different shaped clothing she is asking you to buy a spell to keep you from dying would you like to buy the spell?");
                    sayac++;
                    east2 = true;

                } else if (kelimeVarMi(Input, "west")) {
                    System.out.println("you see big shaped things in the distant could be humans or something more dangerous");
                    sayac++;
                    west2 = true;
                } else if (kelimeVarMi(Input, "south")) {
                    System.out.println("there is no going back until you find your sister");

                } else if (envanterGoster(Input)) {
                    System.out.println(envanter);

                } else {
                    System.out.println("i don't understand");
                }
            }
        }
        while (sayac == 2) {
            String Input = scanner.nextLine().toLowerCase();

            if (Input.equals("yes")) {
                if (north2) {
                    envanter.add("axe");
                }
                if (east2) {
                    envanter.add("Spell");
                }
            }
            break;
        }

        boolean north3 = false;
        boolean east3 = false;
        boolean west3 = false;
        boolean south3 = false;


        if (east1) {
            while (sayac == 2) {
                String Input = scanner.nextLine().toLowerCase();

                if (kelimeVarMi(Input, "north")) {
                    System.out.println("you see a house and on top of it it says alchemist you went inside and there is woman with different shaped clothing she is asking you to buy a spell to keep you from dying would you like to buy the spell?");
                    sayac++;
                    north3 = true;

                } else if (kelimeVarMi(Input, "east")) {
                    System.out.println("you see a troll guarding the caged person you don't know who she is would you like to fight him?");
                    sayac++;
                    east3 = true;

                } else if (kelimeVarMi(Input, "west")) {
                    System.out.println("thats where you came from there is no going back until you find your sister");


                } else if (kelimeVarMi(Input, "south")) {
                    System.out.println("thats where you came from there is no going back until you find your sister");


                } else if (envanterGoster(Input)) {
                    System.out.println(envanter);

                } else {
                    System.out.println("i don't understand");
                }
            }
        }


        while (sayac == 3) {
            String Input = scanner.nextLine().toLowerCase();

            if (Input.equals("yes")) {
                if (north2) {
                    envanter.add("spell");
                }
                if (east2) {
                    System.out.println("you can't fight a troll when you have nothing but you tried anyway and the person in the cage turns out she was a witch and she saves you and gives you a sword made out of sun");
                envanter.add("sword");
                }
            }
            break;
        }































    }


    public static boolean envanterGoster(String Input) {
        if (Input.equals("show inventory")) {
            System.out.println("showing inventory");
            return true;
        }
        return false;
    }


    public static boolean kelimeVarMi(String Input, String expected) {


        String[] kelimeler = Input.split("\\s+");
        for (String eleman : kelimeler) {
            if (eleman.equals(expected)) {

                return true;
            }
        }
        return false;
    }

}