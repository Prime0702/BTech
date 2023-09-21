package LS4.q1;

/*  Q1.1. Create a class Person with name (String) and age(int) as private member variables
          Create a sub class Employee which inherits Person with private members – emId (int) and hourlyPay (double)
          Create a constructor in the Employee class and initialize base class members as well.
          In Employee class write getters and setters for both variables: getId, getHourlyPay, setId,
    Q1.2. Create a getRaise method in Employee class. This method raises the user, increasing their total hourly pay by 15%. This method also updates the hourly pay class variable you made as well. Finally return the value of the employee’s new hourlyPay.
    Q1.3. Create a method payday in class Employee. This method calculates how much the employee earned for the week. First calculate their pay, if the employee worked more than 40 hours, then any hour OVER 40 is worth 1.5 times their normal pay, this is considered overtime pay, otherwise their pay is normal. Return their total pay for the week.
    For example: if I worked 45 hours this week, I would get 5 hours of overtime pay and 40 hours of normal pay.
    Q1.4. In Employee class, override the toString method. For the toString method, you will use the same basic output from Person toString method but add two new lines. Using Person toString method as a starting point, the first two lines of our new toString method will look like:
    Name: your name
    Age: your age
    You will now also add the lines:
    They make $hourly_pay
    They have the employee ID id_number
    Each line should be followed by a new line, including the last character. The hourly pay should also be formatted with two digits after the decimal place. (Remember String.format()?)
    HINT will a call to super help?
 */
public class driver {
    public static void main(String[] args) {
        Employee E = new Employee("Aadithyan",19,1, 500.0);
        System.out.println(E.getId());
        System.out.println(E.getPay());
        System.out.println(E.getRaise());
        System.out.println(E.payday(24));
        System.out.println(E.toString());
    }
}
