class HDFC
{
 float balance;
 String custName;
 {
  System.out.println("logics to connect to verify the adhaar,pan,and address");
 }
 HDFC(String custName,float balance)
 {
  System.out.println( " hi "+  custName +"creating your account and setting up your balance");
  this.balance=balance;
  this.custName=custName;
 }
 void getBalance()
 {
  System.out.println(" Hi "+custName+"your balance is"+balance);
 }
}
class customer
{
 public static void main(String[]args)
{
 HDFC acc1=new HDFC(" RK ",1000);
 acc1.getBalance();
 HDFC acc2=new HDFC(" RJ ",2000);
 acc2.getBalance();
}
}
 
nn