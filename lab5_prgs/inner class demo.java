import java.util.*;
class innerDemo
{
int o=10;
class innerone
{
int a=5;
}
public static void main(String args[])
{
innerDemo obj=new innerDemo();
innerone ob=obj.new innerone();
System.out.println(obj.o);
System.out.println(ob.a);
}
}
