package Hewitt.Jalisa.GuessingGame;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by jalisahewitt on 9/9/16.
 */
public class GuessingGame {


    public static void main(String[] args){
        Random rand = new Random();
        int secretNumber = rand.nextInt(100)+1;
        int userNumber = -1;
        int current=0;
        int count= 0;

        while (userNumber != secretNumber) {
            System.out.println("Guess a number between 1 and 100!");
            Scanner input = new Scanner(System.in);
            userNumber = input.nextInt();




            if (userNumber != current) {
                count += count;
                if (userNumber > secretNumber) {
                    System.out.println("Too big! Try again");
                } else {
                    System.out.println("Too small! Try again");
                }
                current = userNumber;

            } else {

                System.out.println("Pick a different number, its the same as the last.");

            }
        }
        System.out.println("Correct! You tried "+ count + " times.");
    }





}

