import java.util.Scanner;

public class area
{
    public static void main (String args[])
    {
        // area of triangle
        System.out.println("enter base and height of triangle\n");
        Scanner sc = new Scanner(System.in);
        Float b  = sc.nextFloat();
        Float h  = sc.nextFloat();
        float area ;
        area = ( b*h) / 2 ;
        System.out.println("Area of Triangle is: "+area);

        //area of circle
        System.out.println("enter redius");
        float r = sc.nextFloat();
        area=22*r*r/7;
        System.out.println("area of circle : " +area );


    }
}
