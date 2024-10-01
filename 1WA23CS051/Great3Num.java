import java.util.Scanner;
import java.io.*;
public class Great3Num
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greatest: "+a);}}
		if(b>c)
		{
			if(b>a){
			System.out.println("B is greatest: "+b);}}
		if(c>a){
if(c>b){
System.out.println("C is greatest: "+c);}}
	}
}
