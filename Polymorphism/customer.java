//server

class flipcart
{
 void payment()
 {
  System.out.println("Pay by cash");
 }
 void payment(int debitNum)
 {
  System.out.println("Pay by debit card");
 }
 void payment(String upi)
 {
  System.out.println("pay by UPI");
 }
 void payment(float wallet)
 {
  System.out.println("pay by online Wallet");
 }
}
//laptop,mobile

class customer
{
 public static void main(String[]args)
 {
  System.out.println("Customer wants to buy and an item from flipcart.com");
   flipcart custAcc1=new flipcart();
   custAcc1.payment("krish@icci");
 }
}