package LS3.LE4;

public class Driver {

	public static void main(String[] args) {
		
		
		double vol1,vol2;
		Box mybox1 = new Box();// Object Creation by invoking dafault constructor
		
		vol1=mybox1.volume();
		System.out.println("Volume is " + vol1);
		
		Box mybox2 = new Box(10, 20, 15);// Object Creation by invoking parameterized constructor
		
        vol2=mybox2.volume();
		System.out.println("Volume is " + vol2);
		
		
	}

}
