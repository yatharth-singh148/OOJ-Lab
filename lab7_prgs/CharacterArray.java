//q1 lab 7
import java.util.*;
public class CharArray
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int l;
String str;
System.out.println("Enter a string: ");
str=sc.nextLine();
l=str.length();
char[] c=new char[l];
c=str.toCharArray();
System.out.println("Length: "+l+"\nCharacter array: ");
for(int i=0;i<l;i++)
{
System.out.println(c[i]);
}
}
}
