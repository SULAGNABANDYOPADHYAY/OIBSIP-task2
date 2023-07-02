import java.io.*;
import java.util.Random;

import java.util.Scanner;

class GAME_Numberguess {
    public static void main(String args[]) {
        int starting_range = 1;
        int ending_range = 100;
        int attempts_num = 5;
        int score = 0;

        Random ran = new Random();
        int random_num = ran.nextInt(ending_range - starting_range + 1) - starting_range;

        Scanner sc = new Scanner(System.in);
        System.out.println("****************NUMBER GUESSING GAME****************");
        System.out.println("The number is generated from " + starting_range + " to " + ending_range);
        System.out.println("Attempts: " + attempts_num);

        while (attempts_num > 0) {
            System.out.println("Guess the number: ");
            int guess = sc.nextInt();
            if (guess == random_num) {
                System.out.println("HURRAYYY! You guessed the correct number!");
                score = score + (attempts_num * 10);
                break;
            } else if (guess < random_num) {
                System.out.println("Sorry! The number is higher, try again!");
            } else {
                System.out.println("Sorry! The number is lower, try again!");
            }
            attempts_num--;

            if (attempts_num > 0) {
                System.out.println("Remaining attempts: " + attempts_num);
            } else {
                System.out.println("Sorry! You lost! The number was: " + random_num);
            }
        }

        System.out.println("SCORE: " + score);
    }
}