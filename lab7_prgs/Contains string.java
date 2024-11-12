//q2 lab7
import java.util.*;
class CheckContains
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String str;
String str2;
System.out.println("Enter String 1: ");
str=sc.nextLine();
System.out.println("Enter String 2: ");
str2=sc.nextLine();
if(str.contains(str2))
{
System.out.println("String 1 contains String 2.");
}
else
System.out.println("String 1 does not contain String 2.");
}
}
