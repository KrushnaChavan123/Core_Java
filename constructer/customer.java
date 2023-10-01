class HDFC
{
 float balance;
 String custName;

HDFC(String custName,float balance)
{
 System.out.println("hi"+custName+"creating your account and setting up your balance");
 this.balance=balance;
 this.custName=custName;
}

void getBalance()
{
 System.out.println("Hi"+custName+"your balance is"+balance);
}
}
class customer
{
 public static void main(String[]args)
 {
  HDFC h1=new HDFC("Rahul",5000);
  h1.getBalance();


  HDFC h2=new HDFC("Shree",1200);
  h2.getBalance();
 }
}
