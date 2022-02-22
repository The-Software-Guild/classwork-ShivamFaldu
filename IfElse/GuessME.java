package IfElse;

import java.util.Scanner;

public class GuessME {
    public static void main (String [] args){
        int integer_Of_Choice= 5;

        Scanner temp = new Scanner(System.in);
        System.out.println("Pick a number: ");
        int user_Num = Integer.parseInt(temp.nextLine());

        System.out.println("Your number = " + user_Num);

        if(user_Num==integer_Of_Choice){
            System.out.println("Wow nice guess, that was it");
        }else if(user_Num<integer_Of_Choice){
            System.out.println("Ha, Nice try, i chose..too low "+ integer_Of_Choice);
        }else {
            System.out.println("Too bad, the guess was way to high...I chose"+ integer_Of_Choice);
        }
    }
}
