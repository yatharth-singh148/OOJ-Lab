import java.util.*;
class OverloadDemo
{
int sum(int a, int b, int c)
{
int s=a+b+c;
return s;
}
int sum(int a, int b)
{
int s=a+b;
return s;
}
public static void main(String args[])
{
OverloadDemo obj=new OverloadDemo();
int n1,n2,n3;
int su;
n1=5;
n2=n1+1;
n3=n2+1;
System.out.println("variables taken: "+n1+"\t"+n2+"\t"+n3);
su=obj.sum(n1,n2);
System.out.println("Sum 1: "+su);
su=obj.sum(n1,n2,n3);
System.out.println("Sum 2: "+su);
}
}
