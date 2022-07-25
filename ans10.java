




   import java.util.*;
    public class ans10 {
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
            System.out.println("reverse:");
            for (int i = size-1 ; i >= 0 ; i--) {
                System.out.println( a[i]);
            }
        }
    }