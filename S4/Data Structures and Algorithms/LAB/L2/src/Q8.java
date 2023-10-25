import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner sc = new Scanner(System.in);
        phoneBook.insert("Rahul","9778592483");
        phoneBook.insert("Akshai","7736531149");
        phoneBook.insert("Anjali","9778755891");
        phoneBook.insert("Aadithyan", "9562341272");

        while (true){
            System.out.println("1. Insert");
            System.out.println("2. List");
            System.out.println("3. Delete");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter phone: ");
                    String phone = sc.next();
                    phoneBook.insert(name, phone);
                }
                case 2 -> phoneBook.list();
                case 3 -> {
                    System.out.print("Enter name: ");
                    String name1 = sc.next();
                    phoneBook.deleteByValue(name1);
                }
                case 4 -> System.exit(0);
            }
        }
    }
}
