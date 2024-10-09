//CLASSES AND FUNCTIONS USING OBJECTS
import java.util.*;
import java.util.Scanner;
class Functions
{
void displaySum(int n1, int n2)
{
int sum;
sum=n1+n2;
System.out.println("Sum is "+sum);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Functions ob=new Functions();
int a,b;
System.out.println("Enter 2 integers: ");
a=sc.nextInt();
b=sc.nextInt();
ob.displaySum(a,b);
}
}
