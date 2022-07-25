import java.util.Scanner;

public class ans12 {
    public static void main(String[] args){
        int max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element");
        int n =sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elemnet of an array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        max=a[0];
        min=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>a[0]){
                max=a[i];
            }
        }
        for(int i=0;i<n;i++) {
            if (a[i] < a[0]) {
                min = a[i];
            }
        }
        System.out.println("maximum element is  ="+max);
        System.out.println("minimum element is ="+min);
        System.out.println("maximum Diff is="+(max-min));
    }
}
