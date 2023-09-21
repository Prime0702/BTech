package LS3.LE5;

public class Driver {

	public static void main(String[] args) {
		
		
		double vol1;
		Box mybox1 = new Box();// Object Creation by invoking default constructor
		mybox1.depth=10; // This is correct.We can access public data members in another class 
		mybox1.height=20; // This is correct. By default data members access specifier is public
		//mybox1.width=30; // This is not correct. We cannot access private members outside a class
		mybox1.getwidth(30);
		vol1=mybox1.volume();
		System.out.println("Volume is " + vol1);
		
		
		
	}

}