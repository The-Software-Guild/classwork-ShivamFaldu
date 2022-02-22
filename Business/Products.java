package Business;

public class Products {
    Long productID;
    String productName;
    double productPrice;

    public Products(Long pID, String pN, double pP){
        this.productID = pID;
        this.productName= pN;
        this.productPrice = pP;
    }

    public Long getProdId (){
        return productID;
    }

    public String getProductName(){
        return productName;

    }

    public double getProductPrice(){
        return productPrice;
    }

    public void setProductID (Long a){
        this.productID= a;
    }

    public void setProductName(String a){
        productName=a;

    }

}
