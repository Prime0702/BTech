package LS3.LS3Q4;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.print("Cat A: ");a=in.nextInt();
        System.out.print("Cat B: ");b=in.nextInt();
        System.out.print("Mouse: ");c=in.nextInt();
        animal obj = new animal();
        obj.catAndMouse(a, b, c);
        obj.catMouseDemo();
        in.close();
    }
}
