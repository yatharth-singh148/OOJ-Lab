//q8 lab7
import java.util.*;
class JoinString
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int ch;
String hi="Hi, ";
String mom="mom.";
String a;
System.out.println("Which method? 1 -> Without built in function\n2 -> With .concat()");
ch=sc.nextInt();
switch(ch)
{
case 1: a=hi+mom; System.out.println(a); break;
case 2: a=hi.concat(mom); System.out.println(a); break;
default: System.out.println("Enter correct option.");
}
}
}
