package LS4.q4;
/*
    Q4. Implement a superclass PurchaseProduct which represents a purchased product from a store. The class has
    Two private instance variables - name (String) and unitprice (double)
    One constructor initializes the variable.
    A default constructor to initialize name as "no product" and unitprice as 0.0
    Define a method getPrice that returns the unitprice. Similarly, Setter and Getter methods for each member variable.
    A toString method to return the name of product followed by @symbol, then the unitprice.

    Now, create a subclass Weighedproduct and Counterproduct from PurchaseProduct.
    Weighedproduct has an additional instance variable Weight (double) in kg.
    Counterproduct has an additional variable quantity (int) both private.
    Implement appropriate subclass constructors for each class and use superclass constructor to initialize.
    Override getPrice method that returns the price of the PurchasedProduct based on its unitprice and quantity.
    Override also toString method for each class, using the toString method of the superclass in defining those of the subclasses. toString should represent a receipt or bill.
*/

public class driver{
    public static void main(String[] args) {
        Weighedproduct w=new Weighedproduct(20);
        Counterproduct c=new Counterproduct(20);
        w.setName("Apple");
        w.setUnitprince(10);
        c.setName("Apple");
        c.setUnitprince(10);
        System.out.println(w);
        System.out.println(c);
    }
}
