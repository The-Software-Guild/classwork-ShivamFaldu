package Scanner;

import java.util.Scanner;

public class DoItBetter {
    public static void main (String [] args){
        Scanner the_Scanner = new Scanner(System.in);

        System.out.println("How many miles can you run? ");
        int num_Of_Miles = Integer.parseInt(the_Scanner.nextLine());

        System.out.println("How many hot dogs can you eat? ");
        int num_Of_Hot_Dogs = Integer.parseInt(the_Scanner.nextLine());

        System.out.println("How many languages can you speak? ");
        int num_Of_Languages = Integer.parseInt(the_Scanner.nextLine());
        

    }
}
