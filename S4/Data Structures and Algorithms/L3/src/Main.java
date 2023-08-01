public class Main {
    public static void main(String[] args) {
        // Question 1
        CLL cll1 = new CLL();
        cll1.insertAtHead(2);
        System.out.println("Q1. a");
        System.out.print("Elements: "); cll1.traverse();
        cll1.insertAtTail(10);
        System.out.println("Q1. b");
        System.out.print("Elements: "); cll1.traverse();
        cll1.insertAfter(5,2);
        System.out.println("Q1. c");
        System.out.print("Elements: "); cll1.traverse();
        System.out.println("Q1. d");
        System.out.println("Inserting 11 at end");
        cll1.insertAtTail(11);
        System.out.print("Elements: "); cll1.traverse();
        cll1.deleteValue(11);
        System.out.println("Deleting 11 by value");
        System.out.print("Elements: "); cll1.traverse();
        System.out.println("Q1. e");
        System.out.println("Initial list");
        System.out.print("Elements: "); cll1.traverse();
        System.out.println("Deleting element at position 2");
        cll1.deletePosition(2);
        System.out.print("Elements: "); cll1.traverse();
        System.out.println("Q1. f");
        System.out.println("Initial list");
        System.out.print("Elements: "); cll1.traverse();
        System.out.println("Searching for 10");
        cll1.search(10);
        // Question 2
        DLL dll1 = new DLL();
        System.out.println("Q2. a");
        System.out.println("Inserting 2 at position 0");
        dll1.insertAtPosition(2,0);
        System.out.print("Elements: "); dll1.traverse();
        System.out.println("Q2. b");
        System.out.println("Inserting 10 at position 1");
        dll1.insertAtPosition(10,1);
        System.out.print("Elements: "); dll1.traverse();
        System.out.println("Deleting 10 by value");
        dll1.deleteValue(10);
        System.out.print("Elements: "); dll1.traverse();
        System.out.println("Q2. c");
        System.out.println("Initial list");
        dll1.insertAtPosition(3,0);
        dll1.insertAtPosition(5,1);
        dll1.insertAtPosition(7,0);
        dll1.insertAtPosition(9,0);
        System.out.print("Elements: "); dll1.traverse();
        dll1.sort();
        System.out.println("Sorted list");
        System.out.print("Elements: "); dll1.traverse();
        System.out.println("Q2. d");
        System.out.println("Initial list");
        System.out.print("Elements: "); dll1.traverse();
        System.out.println("Reversing first 3 elements");
        dll1.reverseFirstKNodes(3);
        System.out.print("Elements: "); dll1.traverse();
        // Question 3
        System.out.println("Q3.");
        System.out.println("Initial list");
        cll1.insertAfter(5,2);
        cll1.insertAfter(8,5);
        System.out.print("Elements: "); cll1.traverse();
        System.out.println("Sorted insert of 7");
        cll1.sortedInsert(7);
        System.out.print("Elements: "); cll1.traverse();
        // Question 4
        System.out.println("Q4.");
        System.out.println("Initial list1");
        dll1.sort();
        System.out.print("Elements: "); dll1.traverse();
        System.out.println("Initial list2");
        DLL dll2 = new DLL();
        dll2.insertAtPosition(3,0);
        dll2.insertAtPosition(6,1);
        dll2.insertAtPosition(10,2);
        System.out.print("Elements: "); dll2.traverse();
        System.out.println("Merging list1 and list2");
        DLL dll3 = dll1.mergeSort(dll2);
        System.out.print("Elements: "); dll3.traverse();
        // Question 5
        System.out.println("Q5.");
        System.out.println("Initial list");
        dll1.clear();
        dll1.insertAtPosition(1,0);
        dll1.insertAtPosition(3,1);
        dll1.insertAtPosition(4,2);
        dll1.insertAtPosition(5,3);
        dll1.insertAtPosition(7,4);
        dll1.insertAtPosition(8,5);
        dll1.insertAtPosition(9,6);
        System.out.print("Elements: "); dll1.traverse();
        System.out.println("Element pair with sum 8");
        dll1.sumOfPair(8);





    }
}