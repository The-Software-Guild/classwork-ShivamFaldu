package Business;

import java.util.*;

public class Customer {
    Long customerId;
    String customerName;
    Products [] all_Products = new Products[3];
    List<Products> cart = new ArrayList<>();
    Map <String, Products> getProdcutOject = new HashMap<>();

    public Customer(Long id, String name){
        this.customerId=id;
        this.customerName = name;
        fillProductArray();
    }

    public void shopping (){
        Boolean isShopping = true;
        Scanner scanner = new Scanner(System.in);
        Set<String> checkResponse = new HashSet<>();
        Set<String> checkProducts = new HashSet<>();
        checkProducts.add("MacBook Pro");
        checkProducts.add("Ear Buds");
        checkProducts.add("Call of duty");
        checkResponse.add("y");
        checkResponse.add("n");



        while (isShopping){
            System.out.println("What would you like to buy?");
            String currentChoice = scanner.nextLine();

            while (!checkProducts.contains(currentChoice)){
                System.out.println("Sorry that product doesnt exits, try again ");
                System.out.println("What would you like to buy?");
                currentChoice = scanner.nextLine();
            }

            cart.add(getProdcutOject.get(currentChoice));
            System.out.println("would you like to keep shopping.....Y/N");
            String answer = scanner.nextLine().toLowerCase();
            while (!checkResponse.contains(answer)){
                System.out.println("Sorry that was not a vaild input....try again");
                answer = scanner.nextLine().toLowerCase();
            }
            if(answer.equals("n")){
                isShopping=false;
            }

        }
    }

    //Final message to list all the products along with final price
    public void finalMessage (){
        System.out.println("The products in your cart are: ");
        int finalPrice = 0;
        for (Products p : cart){
            System.out.print(p.getProductName());
            System.out.println(" , Price: "+ p.getProductPrice() + " ");
            finalPrice+=p.getProductPrice();
        }
        System.out.println("");
        System.out.println("Your final price is "+ finalPrice);
    }

    //fill product array and hashmap
    public void fillProductArray (){
        Products prod1 = new Products(1L,"MacBook pro",115);
        Products prod2 = new Products(2L,"Ear Buds",10);
        Products prod3 = new Products(3L,"Call of Duty",90);
        all_Products[0]= prod1;
        all_Products[1] = prod2;
        all_Products[2]= prod3;

        getProdcutOject.put("MacBook pro", prod1);
        getProdcutOject.put("Ear Buds", prod2);
        getProdcutOject.put("Call of duty", prod3);
    }

    public void listAllProducts(){
        int t = 1;
        for (int i = 0; i <all_Products.length ; i++) {
            System.out.print(t+": "+ all_Products[i].productName);
            System.out.println(", Price = "+ all_Products[i].productPrice);
            t++;
        }
    }


}
