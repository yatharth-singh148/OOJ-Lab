import java.util.*;
import java.util.Scanner;
import java.lang.Math;
class Banking
{
double balance;

double Deposit(double dep, double am)
{
double sum=am+dep;
return sum;
}
double Withdraw(double with, double am)
{
double sub = am-with;
}
public static void main(String args[])
{
Banking c[]=new Banking[15];
Banking obj=new Banking();
Scanner sc = new Scanner(System.in);
double dep,with;
int ch,n;
System.out.println("Enter 15 bank balances of customers: ");
for(int i=0;i<=14;i++)
{
c[i].balance=sc.nextDouble();
}
/*System.out.println("----------Bank oprations------------");
System.out.println("1 -> Deposit \n2 -> Withdraw \n3 -> Display Balance\n");
ch=sc.nextInt();
if(ch==1)
{
System.out.println("Enter costumer number for whom to deposit: ");
n=sc.nextInt();
System.out.println("Enter amount to deposit: ");
dep=sc.nextDouble();
c[n-1].balance= obj.Deposit(dep, c[n-1].balance);
}
if(ch==2)
{
System.out.println("Enter amount to withdraw: ");
with=sc.nextDouble();
if(with>c[n-1].balance)
{
System.out.println("Try again and enter a value smaller than the balance INR "+c[n-1].balance);
}
else
{
c[n-1].balance=obj.Withdraw(with, c[n-1].balance);
//complete the prg
