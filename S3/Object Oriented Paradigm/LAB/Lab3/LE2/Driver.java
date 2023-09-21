package LS3.LE2;
public class Driver {

	public static void main(String[] args) {
		
		Box mybox1 = new Box();
		double vol1,vol2;
		mybox1.width=10;
		mybox1.height=20;
		mybox1.depth=30;
		vol1=mybox1.volume();
		System.out.println("Volume is " + vol1);
		
		Box mybox2 = new Box();
		mybox2.width=100;
		mybox2.height=200;
		mybox2.depth=300;
          vol2=mybox2.volume();
		System.out.println("Volume is " + vol2);
	}

}
