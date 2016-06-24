package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /*

    instructions/main menu

    player's choice- rock, paper, scissors
    make sure rock, paper, or scissors (all spelling options, case options)

    computer choice- randomized, figure out how to make the number into a choice in the game

    conditions- compare the two choices, and tell player if they won or lost

     */
    public static void main(String args[]){

        String choice, choice1;
        int num;
        Random r = new Random();
        num = r.nextInt(3);

        System.out.println("Choose: Rock, Paper or Scissors.");
        Scanner userChoice = new Scanner(System.in);
        choice1 = userChoice.next();
        choice = choice1.toLowerCase();



        switch (num){
            case 0:
                String num1 = "rock";
                System.out.println("System chose Rock");
                if (choice.matches(num1)){
                    System.out.println("Its a tie!");

                }
                else if (choice.matches("paper")){
                    System.out.println("You win!");

                }
                else if (choice.matches("scissors")){
                    System.out.println("You lose!");
                }
                else {
                    System.out.println();
                    System.out.println("ERROR: Please choose Rock, Paper or Scissors");
                }
                break;
            case 1:
                String num2 = "paper";
                System.out.println("System chose Paper");
                if (choice.matches(num2)){
                    System.out.println("Its a tie!");

                }
                else if (choice.matches("scissors")){
                    System.out.println("You win!");

                }
                else if (choice.matches("rock")){
                    System.out.println("You lose!");
                }
                else {
                    System.out.println();
                    System.out.println("ERROR: Please choose Rock, Paper or Scissors");
                }
                break;
            case 2:
                String num3 = "scissors";
                System.out.println("System chose Scissors");
                if (choice.matches(num3)){
                    System.out.println("Its a tie!");

                }
                else if (choice.matches("rock")){
                    System.out.println("You win!");

                }
                else if (choice.matches("paper")){
                    System.out.println("You lose!");
                }
                else {
                    System.out.println();
                    System.out.println("ERROR: Please choose Rock, Paper or Scissors");
                }
                break;


        }

    }
}
