import java.util.*;
import java.util.Scanner;
class TypeCast
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter an integer to convert to byte: ");
a=sc.nextInt();
byte b;
b=(byte)a;
short c;
c=(short)a;
System.out.println("Byte conversion is: "+b);
System.out.println("Short conversion is: "+c);
}
}
