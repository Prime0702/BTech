package LS3.LE3;

public class Driver {

	public static void main(String[] args) {
		
		Box mybox1 = new Box();
		double vol1,vol2;
		mybox1.setDim(10, 20, 15);
		
		vol1=mybox1.volume();
		System.out.println("Volume is " + vol1);
		
		Box mybox2 = new Box();
		mybox2.setDim(3, 6, 9);
        vol2=mybox2.volume();
		System.out.println("Volume is " + vol2);
	}

}
