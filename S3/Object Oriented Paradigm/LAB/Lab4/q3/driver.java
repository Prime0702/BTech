package LS4.q3;
/*
    Q3. Create a class called Complex for performing arithmetic with complex numbers. Write a driver program to test your class. Complex numbers have the form realPart+ imaginaryPart*I. Use floating‐point variables to represent the private data of the class.

    Provide a constructor method that enables an object of this class to be initialized when declared.
    Provide a no-argument constructor with default values in case no initializers are provided.
    Provide public methods for each of the following:
    Addition of two Complex numbers: The real parts are added together, and the imaginary parts are added together.
    Subtraction of two Complex numbers: The real part of the right operand is subtracted from the real part of the left operand, and the imaginary part of the right operand is subtracted from the imaginary part of the left operand.
 */
public class driver {
    public static void main(String[] args) {
        complex c1 = new complex(5, 6);
        complex c2 = new complex(2, 3);
        complex c3 = new complex();
        c3 = c1.add(c2);
        c3.display();
        c3 = c1.sub(c2);
        c3.display();
    }
}

