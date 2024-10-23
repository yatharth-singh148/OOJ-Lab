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
return sub;
}
public static void main(String args[])
{
Banking c[]=new Banking[15];
Banking obj=new Banking();
Scanner sc = new Scanner(System.in);
double dep,with;
System.out.println("Enter number of customers:");
int num=sc.nextInt();
int ch,n;
n=0;
ch=0;
System.out.println("Enter "+num+" bank balances of customers respectively: ");
for(int i=0;i<num;i++)
{
c[i]=new Banking();
c[i].balance=sc.nextDouble();
}
while(ch!=4)
{
System.out.println("----------Bank oprations------------");
System.out.println("1 -> Deposit \n2 -> Withdraw \n3 -> Display Balance\n4 -> Exit");
ch=sc.nextInt();
if(ch==1)
{
System.out.println("Enter costumer number for whom to deposit: ");
n=sc.nextInt();
System.out.println("Enter amount to deposit: ");
dep=sc.nextDouble();
if(dep>0)
{
c[n-1].balance= obj.Deposit(dep, c[n-1].balance);
System.out.println("Amount deposited! New balance: INR "+c[n-1].balance);
}
else{
    System.out.println("Enter an amount greater than 0!");
}
}
if(ch==2)
{
System.out.println("Enter costumer number for whom to withdraw: ");
n=sc.nextInt();
System.out.println("Enter amount to withdraw: ");
with=sc.nextDouble();
if(with>c[n-1].balance)
{
System.out.println("Try again and enter a value smaller than the balance INR "+c[n-1].balance);
}
else
{
c[n-1].balance=obj.Withdraw(with, c[n-1].balance);
System.out.println("Amount withdrawn! New balance: INR "+c[n-1].balance);
}
}
if(ch==3)
{
    System.out.println("Enter customer number to view balance of:");
    n=sc.nextInt();
    if(n<=num){
        System.out.println("INR "+c[n-1].balance);
    }
    else{
        System.out.println("Enter a number ID less than "+num+".");
    }
}
System.out.println("Enter 4 to exit, any other number to repeat.\n");
ch=sc.nextInt();
}
}
}
