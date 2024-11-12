//q9 lab 7
import java.util.*;
class InitialSplit
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String str;
String ini;
System.out.println("Enter name: ");
str=sc.nextLine();
char[] c=new char[str.length()];
c=str.toCharArray();
ini=""+Character.toString(c[0]);
System.out.print(c[0]);
int i=1;
for(i=1;i<str.length();i++)
{
//ini=ini+"."+Character.toString(c[i+1]);
System.out.print(c[i+1]);
}
}
}
