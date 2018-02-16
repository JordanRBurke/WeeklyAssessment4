package com.company.Question_5;
import java.util.Scanner;
public class Main {

    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Main main = new Main();
        main.switchMethod();
         /*
         1. Create a new method in this class.  Make sure to instantiate the main to break out of the static context.
         2. Create a switch statement in this new method that has 4 cases and a default.  This switch should take user input of a string .
         3. Make sure you prompt your user as to what they should enter
         4. Have the default case tell the user to input the correct input you are looking for and use recursion to run the switch again.
         */


    }

    private void switchMethod() {

        System.out.println("Which would you rather have? \n" +
                " 1. A unicorn \n" +
                " 2. Money \n" +
                " 3. A very flexable pet dinosaur \n" +
                " 4. Paper cuts");

        switch(input.nextInt()) {


            case 1:
                System.out.println("I'm also a big fan of unicorns, got my unicorn to level 23 \n What level is yours?");
                int unicornLvl = input.nextInt();
                if (unicornLvl <= 10) {
                    System.out.println("My unicorn has a higher level");
                } else if (unicornLvl > 30) {
                    System.out.println("You are my hero!");
                } else {
                    System.out.println("That's pretty cool");
                }



                break;

            case 2:
                System.out.println("I wish I had money too ;( ");
                break;

            case 3:
                System.out.println("You have strange tastes, but I'm not going to judge \n" +
                        " I'm the one that put that as a option in the first place :)");
                break;

            case 4:
                System.out.println("I can't say I like paper cuts, but I can say \n" +
                        " that I do definitly do not cry when I get one");
                break;

            default:
                System.out.println("I have no idea what you put in, but it was surely incorrect");
                switchMethod();
                break;



        }







    }





}
