//Assignment 7/9/23
class HDFC
{
 float balance;
 String custName;
 
 static
 {
  System.out.println("Logics to verify Adhaar,Pan -format and address");
 }
 {
  System.out.println("Connect to Adhaar server and generate OTP to verify");
 }
 HDFC(String custName,float balance)
 {
  System.out.println(" hi " +custName + "creating your account and setting your balance  " );
  this.balance=balance;
  this.custName=custName;
 }
 void getBalance()
 {
  System.out.println("Hi"+custName+"your balance is"+balance);
 }
 void setBalance(float debit)
 {
	 balance=balance-debit;
     System.out.println("After debited your balance is "+balance);
 }
	 
}
class customer
{
 public static void main(String[]args)
 {
  System.out.println("Start");
  HDFC cust1=new HDFC("Rohan",5000);
  cust1.getBalance();
  cust1.setBalance(2000);
  HDFC cust2=new HDFC("Ram",15000);
  cust2.getBalance();
  cust2.setBalance(7500);
  System.out.println("Stop");
 }
}
  