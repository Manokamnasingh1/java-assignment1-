import java.util.Scanner;
public class temp {
    public static void main(String args[]) {
        float Fahrenheit, Celsius;
        System.out.println("enter temp in celsius \n");
        Scanner sc = new Scanner(System.in);
        Float Ce  = sc.nextFloat();

        Fahrenheit = ((Ce * 9) / 5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
    }
}
