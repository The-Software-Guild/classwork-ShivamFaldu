package IfElse;

import java.util.Locale;
import java.util.Scanner;

public class FieldDay {
    public static void main(String [] args){

        Scanner temp = new Scanner(System.in);
        System.out.println("what is your last name? ");
        String lastname = temp.nextLine().toLowerCase();
        char last_name = lastname.charAt(0);

        if(last_name<'b'){
            System.out.print("Aha, you're on team ");
            System.out.println("Red Dragons");
        }else if(last_name>='b' && last_name<'d'){
            System.out.print("Aha, you're on team ");
            System.out.println("Dark Wizard");
        }else if(last_name>='d' && last_name<'h'){
            System.out.print("Aha, you're on team ");
            System.out.println("Move Castles");
        }else if (last_name>='h' && last_name<'p'){
            System.out.print("Aha, you're on team ");
            System.out.println("Golden Snitches");
        }else if(last_name>='p' && last_name<'v'){
            System.out.print("Aha, you're on team ");
            System.out.println("Night Guard");
        }else if(last_name>='v'){
            System.out.print("Aha, you're on team ");
            System.out.println("Black Holes");
        }
    }
}
