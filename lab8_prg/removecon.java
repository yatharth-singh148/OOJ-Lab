//prg3 lab8
import java.util.Scanner;
class RemoveConDupli
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter String: ");
String str=sc.next();
char[] c=new char[str.length()];
c=str.toCharArray();
for(int i=0;i<=str.length()-1;i++)
{
if(i==0) {
System.out.print(c[i]); }
else if(c[i]!=c[i-1]) {
System.out.print(c[i]); }
}
}
}
