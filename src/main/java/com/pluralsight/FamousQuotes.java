package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes = {
                "May the Force be with you.",
                "Here's looking at you, kid.",
                "I'll be back.",
                "You can't handle the truth!",
                "Houston, we have a problem.",
                "There's no place like home.",
                "Keep your friends close, but your enemies closer.",
                "Why so serious?",
                "To infinity and beyond!",
                "Life is like a box of chocolates. You never know what you're gonna get."
        };

        while (true) {
            try {
                Scanner myScanner = new Scanner(System.in);
                System.out.println("\nChoose a number between 1 and 10 to get a quote");
                System.out.println("Or press R to get a random one!");
                String userInput = myScanner.nextLine();

                // Try if the user input a number, catch if they wrote a string
                try {
                    int index = Integer.parseInt(userInput);
                    System.out.println("\nYour quote is: " + quotes[index]);
                } catch (Exception e) {
                    if (userInput.equalsIgnoreCase("R")){
                        Random random = new Random();
                        int randomIndex = random.nextInt(quotes.length);
                        System.out.println("\nYour random quote is: " + quotes[randomIndex]);

                        // If string input is invalid
                    } else {
                        System.out.println("\nInvalid input, try again!");
                        continue;
                    }

                }

                // Loop for the user to keep asking for quotes
                while (true){
                    System.out.println("\nWould you like to see another? (Y/N): ");
                    String response = myScanner.nextLine();
                    if (response.equalsIgnoreCase("N")){
                        return;
                    } else if (response.equalsIgnoreCase("Y")) {
                        break;
                    } else {
                        System.out.println("\nInvalid input, try again!");
                    }
                }

                //If int input is invalid
            } catch (Exception e) {
                System.out.println("\nInvalid input, try again!");
            }
        }
    }
}
