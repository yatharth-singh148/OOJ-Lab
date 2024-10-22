import java.util.*;
import java.util.Scanner;
class Staticvar
{
static int a=5;
static int b;
static void method()
{
System.out.println("a=" + a);
System.out.println("b="+b);
}
static {
Scanner sc=new Scanner(System.in);
System.out.println("Static block is executed first.");
System.out.println("Enter b:");
b=sc.nextInt();
}
public static void main(String args[])
{
Staticvar o=new Staticvar();
o.method();
}
}
