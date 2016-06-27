package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static List<String> historyStorage = new ArrayList();

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("==========================");
        System.out.println("Rock, Paper, Scissors Game");
        System.out.println("==========================");

        while(true) {
            while(true) {
                System.out.println();
                System.out.println("************************************************");
                System.out.println("[Play] the game, view your [History], or [Quit].");
                System.out.println("************************************************");
                Scanner menu0 = new Scanner(System.in);
                String menu = menu0.nextLine().toLowerCase().trim();
                if(menu.equals("play")) {
                    play();
                } else if(menu.equals("history")) {
                    hist();
                } else {
                    if(menu.equals("quit")) {
                        return;
                    }

                    System.out.println("Ohnoes! Please enter play, history, or quit!");
                }
            }
        }
    }

    public static void play() {
        while(true) {
            String winOutcome = "";
            String computerChoice = "";
            Random r = new Random();
            int num = r.nextInt(3);
            System.out.println();
            System.out.println("***************************************************************");
            System.out.println("Choose [Rock], [Paper], [Scissors]; or enter [Menu] to go back.");
            System.out.println("***************************************************************");
            Scanner scanner = new Scanner(System.in);
            String playerChoice = scanner.nextLine().toLowerCase().trim();
            if(playerChoice.equals("menu")) {
                return;
            }

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println();
                System.out.println("Wrong spelling OR Wrong word");
            } else {
                switch(num) {
                    case 0:
                        computerChoice = "rock";
                        System.out.println("System chose Rock");
                        if(playerChoice.matches(computerChoice)) {
                            System.out.println("It\'s a tie!");
                            winOutcome = "Tie";
                        } else if(playerChoice.matches("paper")) {
                            System.out.println("You win!");
                            winOutcome = "Win";
                        } else if(playerChoice.matches("scissors")) {
                            System.out.println("You lose! (btw- history is written by winners)");
                            winOutcome = "Lose";
                        } else {
                            System.out.println();
                            System.out.println("ERROR: Please choose Rock, Paper, Scissors, or History");
                        }
                        break;
                    case 1:
                        computerChoice = "paper";
                        System.out.println("System chose Paper");
                        if(playerChoice.matches(computerChoice)) {
                            System.out.println("It\'s a tie!");
                            winOutcome = "Tie";
                        } else if(playerChoice.matches("scissors")) {
                            System.out.println("You win!");
                            winOutcome = "Win";
                        } else if(playerChoice.matches("rock")) {
                            System.out.println("You lose! (btw- history is written by winners)");
                            winOutcome = "Lose";
                        } else {
                            System.out.println();
                            System.out.println("ERROR: Please choose Rock, Paper, Scissors, or History");
                        }
                        break;
                    case 2:
                        computerChoice = "scissors";
                        System.out.println("System chose Scissors");
                        if(playerChoice.matches(computerChoice)) {
                            System.out.println("It\'s a tie!");
                            winOutcome = "Tie";
                        } else if(playerChoice.matches("rock")) {
                            System.out.println("You win!");
                            winOutcome = "Win";
                        } else if(playerChoice.matches("paper")) {
                            System.out.println("You lose! (btw- history is written by winners)");
                            winOutcome = "Lose";
                        } else {
                            System.out.println();
                            System.out.println("ERROR: Please choose Rock, Paper, Scissors, or History");
                        }
                }

                if(playerChoice.equals("history")) {
                    hist();
                }

                String history = winOutcome + ": You- " + playerChoice + "  Me- " + computerChoice;
                historyStorage.add(history);
            }
        }
    }

    public static void hist() {
        System.out.println();
        System.out.println("********************************");
        System.out.println("[Game History] or [Real History]");
        System.out.println("********************************");
        System.out.println();
        System.out.println("*** Remember you can\'t change history! ***");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String playerChoice = scanner.nextLine().toLowerCase().trim();
        if(playerChoice.equals("game history")) {
            if(historyStorage.isEmpty()) {
                System.out.println();
                System.out.println("No game history  ...yet!");
            } else {
                for(int i = 0; i < historyStorage.size(); ++i) {
                    System.out.println((String)historyStorage.get(i));
                }
            }
        } else if(playerChoice.equals("real history")) {
            realHist();
        } else {
            System.out.println("There\'s always a history. Please try again");
            hist();
        }

    }

    public static void realHist() {
        System.out.println();
        System.out.println("=========================================================================================");
        System.out.println();
        System.out.println(" \'That men do not learn very much from the lessons of history is the most important of all " +
                "the lessons of history\' ");
        System.out.println();
        System.out.println("       - Aldous Huxley");
        System.out.println();
        System.out.println("=========================================================================================");
    }
}
