package StateCapitals;

import java.util.HashMap;
import java.util.Map;

public class statesAndCapitald {
    Map<String, String> checkValid;

    public statesAndCapitald (){
        checkValid = new HashMap<>();
        fillMap();
    }

    private void fillMap (){
        checkValid.put("Alabama","Montgomery");
        checkValid.put("Alaska","Juneau");
        checkValid.put("Arizona","Phoenix");
        checkValid.put("Arkansas","Little Rock");
    }

    public void listStates (){
        System.out.println("The State:");
        for (String a : checkValid.keySet()){
            System.out.println(a);

        }
        System.out.println("..");
        System.out.println("..");
    }

    public void listCapitals (){
        System.out.println("The capitals of each State");
        for (String a : checkValid.keySet()){
            System.out.println(checkValid.get(a));
        }
        System.out.println("..");
        System.out.println("..");
    }

    public void listStatesAndCapitals (){
        System.out.println("ALl the States and their Capitals");
        for (String a : checkValid.keySet()){
            System.out.print(a);
            System.out.print(" : ");
            System.out.println(checkValid.get(a));
        }
        System.out.println("..");
        System.out.println("..");
    }
}
