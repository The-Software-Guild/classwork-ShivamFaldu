package Randomiser;

import java.util.ArrayList;
import java.util.List;

public class FortuneCookie {
    public static void main (String [] args){
        List<String> fortunes = new ArrayList<>();
        fortunes.add("Those arent the droids you are looking for");
        fortunes.add("Never go against a Sicilian when death is on the line");
        fortunes.add("Goonies ever say die");
        fortunes.add("With great power there must also come great responsibility");
        fortunes.add("Never argue with the data");
        fortunes.add("Try not. Do,or do not.There is not try");
        fortunes.add("You are a leaf on the wind, watch how you soar");
        fortunes.add("Do absolutely nothing, and it will be everything that you thought it could be");
        fortunes.add("Kneel before Zod");
        fortunes.add("Make it so");

        int fortune_Size = (int)(Math.random()*(fortunes.size()-1));
        System.out.println(fortunes.get(fortune_Size));



    }
}
