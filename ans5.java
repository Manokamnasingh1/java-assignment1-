import java.util.Scanner;

public class ans5 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if(num%5==0){
            System.out.println("num is multiple of 5");
        }else{
            System.out.println("num is not multiple of 5");
        }
    }
}
