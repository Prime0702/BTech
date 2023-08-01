import java.util.*;
import java.io.*;
public class driver {
    public static ArrayList<PhoneBook> importArray(String f){
        ArrayList<PhoneBook> arr = new ArrayList<PhoneBook>();
        try{
            File file = new File(f);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] arrLine = line.split(" ");
                arr.add(new PhoneBook(arrLine[0], arrLine[1]));
            }
            sc.close();
        } catch (Exception e) {System.out.println("Error: " + e.getMessage());}
        return arr;
    }
    public static void saveArray(ArrayList<PhoneBook> arr,String f){
        try{
            FileWriter fw = new FileWriter(f);
            for (int i = 0; i < arr.size(); i++){fw.write(arr.get(i).name + " " + arr.get(i).number + "");}
            fw.close();
        } catch (Exception e) {System.out.println("Error: " + e.getMessage());}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PhoneBook> arr = new ArrayList<PhoneBook>();
        try{
            arr = importArray("file.txt");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        while (true){
            System.out.print("=============\n=    Menu   =\n=============\n= 1. Search =\n= 2. Add    =\n= 3. Delete =\n= 4. List   =\n= 5. Edit   =\n= 6. Quit   =\n=============\nEnter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1){
                int flag = 0;
                System.out.print("Enter name: ");
                String name = sc.next();
                for (int i = 0; i < arr.size(); i++)if (arr.get(i).name.equals(name)){
                        System.out.println("Number: "+arr.get(i).number);flag = 1;break;
                }
                if (flag == 0){System.out.println("Not found");}
            } else if (choice == 2){
                System.out.print("Enter name: ");String name = sc.next();
                System.out.print("Enter number: ");String number = sc.next();
                arr.add(new PhoneBook(name, number));
            } else if (choice == 3){
                int flag = 0;
                System.out.print("Enter name: ");
                String name = sc.next();
                for (int i = 0; i < arr.size(); i++)if (arr.get(i).name.equals(name)){
                        arr.remove(i);flag = 1;break;
                    }
                if (flag == 0){System.out.println("Not found");}
            }else if (choice ==4){
                for (int i = 0; i < arr.size(); i++){System.out.println(arr.get(i).name + " " + arr.get(i).number);}
            }else if (choice == 5){
                int flag = 0;
                System.out.print("Enter name: ");
                String name = sc.next();
                for (int i = 0; i < arr.size(); i++)if (arr.get(i).name.equals(name)){
                        System.out.print("Enter new number: ");
                        String number = sc.next();
                        arr.get(i).number = number;
                        flag = 1;
                        break;
                    }
                if (flag == 0){System.out.println("Not found");} 
            }else if (choice == 6){
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        try{
            saveArray(arr, "file.txt");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }    
}
