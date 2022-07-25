

import java.util.*;
public class ans9
{
    public static void main(String[] args) {
        int i=0;
        float sum=0;
        // input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        //array form

        float arr[] = new float[n];
        System.out.println("Enter " + n + " array elements: ");
        while(i<n) {
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
            i++;
        }
        float average = sum/n;
        System.out.println("Average of number is : "+average);
    }
}
