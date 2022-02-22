package Randomiser;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main (String [] args){

        Scanner temp_scanner = new Scanner(System.in);
        int num1= -100;
        int num2 = 100;
        int higher_or_Lower = (int)(Math.random()*2);
        int my_Guess =0;
        if (higher_or_Lower<=1){
             my_Guess = (int) (Math.random()*-100);
        }else {
             my_Guess = (int) (Math.random()*100);
        }
        System.out.println(my_Guess);
        System.out.println("I have chosen an number between -100 and 100");
        System.out.println("But the question is....can you guess it");
        System.out.println("");
        int user_Guess = Integer.parseInt(temp_scanner.nextLine());
        System.out.println("Your guess " + user_Guess);

        if(user_Guess==my_Guess){
            System.out.println("Wow thats nice! That was it");
        }else if (user_Guess<my_Guess){
            System.out.println("Ha nice try, too Lowww! Try again");
            user_Guess=Integer.parseInt(temp_scanner.nextLine());
            System.out.println("Your guess " + user_Guess);
            if(user_Guess==my_Guess){
                System.out.println("Wow thats nice! That was it");
            }else {
                System.out.println("Aww thats too bad, thank you come back again");
            }
        }else if(user_Guess>my_Guess){
            System.out.println("Ha nice try, too High! try again");
            user_Guess=Integer.parseInt(temp_scanner.nextLine());
            System.out.println("Your guess " + user_Guess);
            if(user_Guess==my_Guess){
                System.out.println("Wow thats nice! That was it");
            }else {
                System.out.println("Aww thats too bad, thank you come back again");
            }

        }
    }
}
