import java.util.*;
import java.util.Scanner;
class Box
{
int h;
int w;
int d;
}
class SampleTest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Box boxobj=new Box();
System.out.println("Enter values of height, width, depth of the box: ");
boxobj.h=sc.nextInt();
boxobj.w=sc.nextInt();
boxobj.d=sc.nextInt();
System.out.println("Values are: "+boxobj.h+" "+boxobj.d+" "+boxobj.w);
int vol;
vol=boxobj.h*boxobj.w*boxobj.d;
System.out.println("Volume is: "+vol);
}
}
