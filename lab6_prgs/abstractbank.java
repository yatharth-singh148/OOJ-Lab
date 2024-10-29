//INCOMPLETE
abstract class Bank
{
abstract void deposit();
abstract void withdraw();
abstract void display();
}
class Account extends Bank
{
String name;
long accno;
int acctype; //1-> savings | 2-> current
double bal;
}
class curacc extends Account
{
@Override
int check(double amt)
{
double min=15000.0;
amt=bal;
if(bal>=min){
return 1; }
else{
return 0; }
}
void deposit(double d)
{
bal=bal+d;
System.out.println("Deposit of INR"+d+" successful. New balance: INR"+bal);
}
void withdraw(double w)
{
if(w<d)
{
bal=bal-w;
System.out.println("Withdrawal of INR"+w+" successful. New balance: INR"+bal);
}
else
System.out.println("Insufficient balance! Your current balance is: INR"+bal);
}
}
class savacc extends Account
{
@Override
void deposit(double d)
{
bal=bal+d;
System.out.println("Deposit of INR"+d+" successful. New balance: INR"+bal);
}
void withdraw(double w)
{
if(w<d)
{
bal=bal-w;
System.out.println("Withdrawal of INR"+w+" successful. New balance: INR"+bal);
}
else
System.out.println("Insufficient balance! Your current balance is: INR"+bal);
}
void compInt() //compound interest
{

}
}
