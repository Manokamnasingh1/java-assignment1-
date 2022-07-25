
import java.util.*;
public class ans11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int evencount=0;
        int zcount=0;
        int ncount=0;
        int pcount=0;
        int oddcount=0;
        int size = sc.nextInt();
        int a[]= new int[size];
        System.out.println("enter element of an array");
        //input
        for(int i=0;i<size;i++){

            a[i] = sc.nextInt();
        }
//output
        //positive number
        for(int i=0;i<size;i++) {
            if (a[i] >= 0) {
                pcount=pcount+1;
            }
        }
        System.out.println("no of + num: " +pcount);

        //negative number

        for(int i=0;i<size;i++) {
            if (a[i] < 0) {
                ncount=ncount+1;
            }
        }
        System.out.println("no of -ve num: " +ncount);

        //odd number

        for(int i=0;i<size;i++){
            if(a[i]%2!=0){
                oddcount=oddcount+1;
            }
        }
        System.out.println("no of odd num: " +oddcount);

        //even

        for(int i=0;i<size;i++){
            if(a[i]%2==0){
                evencount=evencount+1;

            }
        }
        System.out.println("no of even number: " +evencount);

        //no of zero

        for(int i=0;i<size;i++) {
            if (a[i] <= 0) {
                zcount=zcount+1;
            }
        }
        System.out.println("no of  0s: " +zcount);
    }
}