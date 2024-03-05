import java.util.Scanner;
public class area
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter a number for radius");
double radius=input.nextDouble();
double area=radius*radius*3.14;
System.out.println("The area for the circle="+area);
}
}
