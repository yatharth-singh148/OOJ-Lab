//SOLVE QUADRATIC EQUATION
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
class Quadratic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a, b and c of equation ax^2+bx+c:");
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
double sol1,sol2;
double sol;
sol=(b*b)-(4*a*c);
if(sol<0)
{
System.out.println("There are no real solutions.");
}
else
{
sol1=(-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
sol2=(-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
System.out.println("Solutions are "+sol1+" and "+sol2);
}
}
}
