package Business;

import java.util.*;

public class webSite {
    List<Products> allProducts = new ArrayList<>();

    public static void main (String [] args){

        Scanner ca = new Scanner(System.in);
        System.out.println("What is your name");
        String name = ca.nextLine();
        System.out.println("What is your ID");
        Long id = Long.parseLong(ca.nextLine());


        Customer cus1 = new Customer(id,name);
        cus1.listAllProducts();
        cus1.shopping();
        cus1.finalMessage();

    }


}
