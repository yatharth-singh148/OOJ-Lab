import java.util.Scanner;
import java.io.*;
public class Factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter a number:");
a=sc.nextInt();
int fact=1;
for(int i=a;i>=1;i--)
{
fact=fact*i;
}
System.out.println("Factorial is: "+fact);
}}