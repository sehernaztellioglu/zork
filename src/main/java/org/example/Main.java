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
                    System.out.println("you see a house and on top of it it says alchemist you went inside and there is woman with different shaped clothing she is asking you to buy a spell to keep you from dying would you like to buy the spell?");
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

        boolean north4 = false;
        boolean east4 = false;


        if (west1) {
            while (sayac == 2) {
                String Input = scanner.nextLine().toLowerCase();

                if (kelimeVarMi(Input, "north")) {
                    System.out.println("you're in the middle of nowhere you still see the shapes to your left and also see a smoke rising to the sky on your right");

                    sayac++;
                    north4 = true;

                } else if (kelimeVarMi(Input, "east")) {
                    System.out.println("that's where you came from you can't go back until you find your sister");
                    sayac++;
                    east4 = true;

                } else if (kelimeVarMi(Input, "west")) {
                    System.out.println("turns out those big shapes are dozens of trolls  they see you and come after you without being able to do anything they kill you");
                   System.out.println("The end");
                   break;


                } else if (kelimeVarMi(Input, "south")) {
                    System.out.println("thats where you came from there is no going back until you find your sister");


                } else if (envanterGoster(Input)) {
                    System.out.println(envanter);

                } else {
                    System.out.println("i don't understand");
                }
            }
        }

        //3. seçim

        boolean north5 = false;
        boolean east5 = false;
        boolean west5 = false;
        boolean south5 = false;

        if (north1) {
            if (north2) {

                while (sayac == 3) {
                    String Input = scanner.nextLine().toLowerCase();

                    if (kelimeVarMi(Input, "north")) {
                        System.out.println("you've reached somewhere and there are mountains to your right and a river to your left but you can't swim so you decided to follow the river and you saw a bridge heading to north ");
                        sayac++;
                        north5 = true;

                    } else if (kelimeVarMi(Input, "east")) {
                        System.out.println("you've come across another building and this one says alchemist you went inside and she wants you to buy spells but you dont have any space you can drop the axe and take the spell instead. Do you want to?");
                        sayac++;
                        east5 = true;

                    } else if (kelimeVarMi(Input, "west")) {
                        System.out.println("you are in an opening you see big shapes to your left and the ironsmith to your right");
                        sayac++;
                        west5 = true;

                    } else if (kelimeVarMi(Input, "south")) {
                        System.out.println("that's the place you came from you can't go back without your sister");


                    } else if (envanterGoster(Input)) {
                        System.out.println(envanter);

                    } else {
                        System.out.println("i don't understand");
                    }
                }
            }
        }
        while (sayac == 4) {
            String Input = scanner.nextLine().toLowerCase();

            if (Input.equals("yes")) {
                if (east5) {
                    envanter.clear();
                    envanter.add("spell");
                }

            }
            break;
        }
        if(north1) {
            if (east2) {
                while (sayac == 3) {
                    String Input = scanner.nextLine().toLowerCase();

                    if (kelimeVarMi(Input, "north")) {
                        System.out.println("you see mountains you wonder a bit inside the mountains and get lost you die of thirst");
                        System.out.println("the end");
                        break;


                    } else if (kelimeVarMi(Input, "east")) {
                        System.out.println("you've fallen into a really deep pit and died");
                        System.out.println("The End");
                        break;

                    } else if (kelimeVarMi(Input, "west")) {
                        System.out.println("you're at the ironsmith again ");


                    } else if (kelimeVarMi(Input, "south")) {
                        System.out.println("you don't want to go back without your sister");


                    } else if (envanterGoster(Input)) {
                        System.out.println(envanter);

                    } else {
                        System.out.println("i don't understand");
                    }
                }
            }
        }

        boolean north6 = false;

        if(north1) {
            if (west2) {
                while (sayac == 3) {
                    String Input = scanner.nextLine().toLowerCase();

                    if (kelimeVarMi(Input, "north")) {
                        System.out.println("you've come across a rive you can't swim or walk to across so you follow the rive and find a bridge heading towards north");

                        sayac++;
                        north6 = true;

                    } else if (kelimeVarMi(Input, "east")) {
                        System.out.println("that's where you came from head somewhere else you need to find your sister");


                    } else if (kelimeVarMi(Input, "west")) {
                        System.out.println("the big shaped things turned out to be dozens of trolls and they killed you");
                        System.out.println("The End");
                        break;


                    } else if (kelimeVarMi(Input, "south")) {
                        System.out.println("that's there you came from head somewhere else you need to find your sister");


                    } else if (envanterGoster(Input)) {
                        System.out.println(envanter);

                    } else {
                        System.out.println("i don't understand");
                    }
                }
            }
        }


        boolean north8 = false;

       if (north1) {
           if (north2) {
               if (north5) {
                   while (sayac == 4) {
                       String Input = scanner.nextLine().toLowerCase();

                       if (kelimeVarMi(Input, "north")) {
                           System.out.println("you see a cave and a troll guarding it you have to fight the troll to get inside the cave you can fight the troll or go back home without your sister do you want to fight the troll?");

                           sayac++;
                           north8 = true;

                       } else if (kelimeVarMi(Input, "east")) {
                           System.out.println("trollst have surrounded you you have to go through the bridge");


                       } else if (kelimeVarMi(Input, "west")) {
                           System.out.println("trollst have surrounded you you have to go through the bridge");


                       } else if (kelimeVarMi(Input, "south")) {
                           System.out.println("trollst have surrounded you you have to go through the bridge");


                       } else if (envanterGoster(Input)) {
                           System.out.println(envanter);

                       } else {
                           System.out.println("i don't understand");
                       }
                   }
               }
           }
       }
        while (sayac == 5) {
            String Input = scanner.nextLine().toLowerCase();

            if (Input.equals("yes")) {
                if (east5) {

                    System.out.printf("you fought him with your %s and won you went inside the cave and saw your sister inside a cage you broke the cage and took your sister",envanter);
                    System.out.println("the end you won!");
                }

            }else {
                System.out.println("troll saw you and started to attack you you weren't prepared so it killed you from behind");
                System.out.println("The end");
            }
            break;
        }


        if (north1) {
            if (north2) {
                if (east5) {
                    while (sayac == 4) {
                        String Input = scanner.nextLine().toLowerCase();

                        if (kelimeVarMi(Input, "north")) {

                            System.out.println("there are mountains you try to find a path through it but get lost and die of thirst");
                            System.out.println("the end");
                            break;

                        } else if (kelimeVarMi(Input, "east")) {
                            System.out.println("there was a deep pit and you fall into and died");
                            System.out.println("the end");
                            break;


                        } else if (kelimeVarMi(Input, "west")) {
                            System.out.println("that's where you came from you need to find your way");


                        } else if (kelimeVarMi(Input, "south")) {
                            System.out.println("you can't go back without your sister");


                        } else if (envanterGoster(Input)) {
                            System.out.println(envanter);

                        } else {
                            System.out.println("i don't understand");
                        }
                    }
                }
            }
        }

        boolean north7 = false;


        if (north1) {
            if (north2) {
                if (west5) {
                    while (sayac == 4) {
                        String Input = scanner.nextLine().toLowerCase();

                        if (kelimeVarMi(Input, "north")) {

                            System.out.println("you saw a river and decided you can't swim across so you followed it and found a bridge heading to north");
                            north7 = true;

                        } else if (kelimeVarMi(Input, "east")) {
                            System.out.println("that's where you came from you need to find the way to your sister");



                        } else if (kelimeVarMi(Input, "west")) {
                            System.out.println("turns out those big shapes were trolls and they've killed you ");
                            System.out.println("The End");
                            break;


                        } else if (kelimeVarMi(Input, "south")) {
                            System.out.println("you can't go back without your sister");


                        } else if (envanterGoster(Input)) {
                            System.out.println(envanter);

                        } else {
                            System.out.println("i don't understand");
                        }
                    }
                }
            }
        }


        if (north1) {
            if (west2) {
                if (north6) {

                        while (sayac == 4) {
                            String Input = scanner.nextLine().toLowerCase();

                            if (kelimeVarMi(Input, "north")) {

                                System.out.println("you've headed north and found your sister in a cave and rescue her");
                                System.out.printf("the end");
                                break;

                            } else if (kelimeVarMi(Input, "east")) {
                                System.out.println("you can't go back");


                            } else if (kelimeVarMi(Input, "west")) {
                                System.out.println("the trolls kill you");
                                System.out.println("The End");
                                break;


                            } else if (kelimeVarMi(Input, "south")) {
                                System.out.println("you can't go back");


                            } else if (envanterGoster(Input)) {
                                System.out.println(envanter);

                            } else {
                                System.out.println("i don't understand");
                            }
                        }

                }
            }
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