
import java.util.*;
public class ans8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("enter element of an array");
        //input

        for (int i = 0; i < size; i++) {

            a[i] = sc.nextInt();
        }
        System.out.println("enter element to be find ");
        int x = sc.nextInt();
        for (int i = 0  ; i< size ; i++) {
            if(a[i] == x){
                System.out.println("x is found at index: " + i);
            }
            }

        }
    }
