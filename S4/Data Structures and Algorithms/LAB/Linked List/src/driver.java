import java.util.Scanner;
public class driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL sll = new SLL();
        sll.insertAtEnd(10);
        sll.insertAtEnd(20);
        sll.insertAtEnd(30);
        sll.insertAtEnd(40);
        sll.insertAtEnd(60);
        System.out.print("Q1: ");
        sll.traverse();
        System.out.print("Q2: ");
        sll.deleteAtIthIndex(5-1);
        sll.deleteAtIthIndex(3-1);
        sll.traverse();
        System.out.print("Q3: ");
        sll.sortedInsert(25);
        sll.traverse();
        System.out.print("Q4: ");
        sll.deleteByValue(10);
        sll.traverse();
        System.out.print("Q5: ");
        if ((sll.isEmpty())) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
        System.out.print("Q6: ");
        System.out.print("Enter element to check: ");
        int element = sc.nextInt();
        if (sll.isLastData(element)){
            System.out.println("Last element is " + element);
        }else {
            System.out.println("Last element is not " + element);
        }
        System.out.print("Q7: ");
        sll.evenPosition();
        System.out.print("Q8: ");
        sll.isPalindrome();
        sc.close();
    }
}