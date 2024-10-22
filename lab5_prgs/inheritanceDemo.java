import java.util.*;
import java.util.Scanner;
class SuperC
{
int y=7;
int x=9;
}
class SubC extends SuperC {
int a=5;
int b=6;
public static void main(String args[])
{
SuperC oa=new SubC();
System.out.println(oa.x);
System.out.println(oa.y);
/* below will not execute due to inheritance property, but if we make object of full SubC it will.
System.out.println(oa.a);
System.out.println(oa.b); */
}
}
