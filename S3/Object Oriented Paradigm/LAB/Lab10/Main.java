import java.sql.*;
import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/ebookshop";
        String username = "postgres";
        String passwd = "";//Enter password within the quotes.
        Connection conn;
        Statement stmt;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, username, passwd);
            stmt = conn.createStatement();
            int ch;
            ResultSet result;
            while(true)
            {
                System.out.println( "1. Display the rows in the table" );
                System.out.println( "2. Update the price of a given id");
                System.out.println( "3. Search for the books having a price range between min and max range where the range is taken as input from the user");
                System.out.println( "4. Delete the details of a book where the id is taken as an input");
                System.out.println( "5. Insert a new book detail");
                System.out.println( "6. Exit");
                System.out.print( "Enter Choice: ");
                ch=scan.nextInt();
                System.out.println();
                if(ch==1){
                    String q="select * from books";
                    result=stmt.executeQuery(q);
                    while(result.next()) {
                        int id = result.getInt(1);
                        String title = result.getString(2);
                        String author = result.getString(3);
                        float price = result.getFloat(4);
                        int qty = result.getInt(5);
                        System.out.println("ID     = " + id);
                        System.out.println("TITLE  = " + title);
                        System.out.println("AUTHOR = " + author);
                        System.out.println("PRICE  = " + price);
                        System.out.println("QTY    = " + qty);
                        System.out.println();
                    }
                }
                else if(ch==2) {
                    System.out.print("Enter the id         : ");String x=scan.next();
                    System.out.print("Enter the new price  : ");String y=scan.next();
                    String q="update books set price ="+y+"where id="+x;
                    stmt.execute(q);
                }
                else if(ch==3) {
                    String min,max;
                    System.out.print("Enter the min value : ");min=scan.next();
                    System.out.print("Enter the max value : ");max=scan.next();
                    String q="select * from books where price between "+min+" and "+max+" ;";
                    result = stmt.executeQuery(q);
                    while(result.next())
                    {
                        int id = result.getInt(1);
                        String  title = result.getString(2);
                        String  author  = result.getString(3);
                        float  price = result.getFloat(4);
                        int qty = result.getInt(5);
                        System.out.println( "ID     = " + id );
                        System.out.println( "TITLE  = " + title );
                        System.out.println( "AUTHOR = " + author );
                        System.out.println( "PRICE  = " + price );
                        System.out.println( "QTY    = " + qty );
                        System.out.println();
                    }
                }
                else if(ch==4) {
                    System.out.print("Enter ID to be deleted: ");String a=scan.next();
                    String q="delete from books where id="+a+";";
                    stmt.execute(q);
                }
                else if(ch==5) {
                    System.out.print("Enter ID      : ");String a=scan.next();scan.nextLine();
                    System.out.print("Enter Title   : ");String b=scan.nextLine();
                    System.out.print("Enter Author  : ");String c=scan.nextLine();
                    System.out.print("Enter Price   : ");String d=scan.next();
                    System.out.print("Enter Quantity: ");String e=scan.next();
                    String q = "INSERT INTO books VALUES ("+a+",'"+b+"','"+c+"',"+d+","+e+");";
                    stmt.execute(q);
                }
                else if(ch==6)break;
                else System.out.println("Enter Valid Choice!");
            }
            stmt.close();
            conn.close();
            scan.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}