package LS5.Q2;
/*
 * Q2. Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
 * It is inherited by two other classes, 'A' and 'B' each having a method with the same name, which returns the percentage of the students. 
 * The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
 * Create an object for each of the two classes and print the percentage of marks for both students.
 * [Note: Calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B.]
 */
public class driver {
    public static void main(String[] args) {
        A st1 = new A(90, 91, 92);
        B st2 = new B(50, 60, 70, 80);
        System.out.println("Percentage of Student A: "+st1.getPercentage());
        System.out.println("Percentage of Student B: "+st2.getPercentage());    
    }
}
