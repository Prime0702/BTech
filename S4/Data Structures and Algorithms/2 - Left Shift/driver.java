import java.util.*;
public class driver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");	
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        System.out.print("Array before left shifting: ");
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.print("Enter number of elements to be left shifted: ");
        int d = sc.nextInt();
        int temp = 0;
        for(int i = 0; i < d; i++){
            temp = arr.get(0);
            arr.remove(0);
            arr.add(temp);
        }
        System.out.print("Array after left shifting: ");
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        sc.close();
    }
}