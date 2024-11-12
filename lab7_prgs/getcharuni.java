//q5 lab7
import java.util.*;
class GetCharUni
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String str;
char c;
System.out.println("Enter String 1: ");
str=sc.nextLine();
int p;
System.out.println("Enter index of string from where to extract character: ");
p=sc.nextInt();
if(p<=str.length()){
c=str.charAt(p);
System.out.println("Character extracted unicode: "+(int)c);
}
else
System.out.println("Index out of bounds.");
}
}
