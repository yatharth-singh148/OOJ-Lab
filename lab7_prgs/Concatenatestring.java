//q3 lab7
import java.util.*;
class ConcatString
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
String str3=str.concat(str2);
System.out.println("Concat string: "+str3);
}
}
