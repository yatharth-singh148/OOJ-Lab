import java.util.Scanner;
import java.io.*;
public class PrimeNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
int f=0;
int flag=0;
System.out.println("Enter a number: ");
a=sc.nextInt();
while(f!=1)
{
if(a<=2)
{System.out.println("Enter a number greater than 2, please: ");
a=sc.nextInt();
}
else
{
f=1;}
}
for(int i=2;i<a;i++)
{
if(a%i==0)
{
flag=1;
}
}
if(flag==1)
{System.out.println("Number is not prime.");}
else
{
System.out.println("Number is prime.");
}}}