class one
{
	{
		 System.out.println("Inside the non-static block");
    }
 void m1()
 {
  System.out.println("Inside m1 method");
 }
 one()
 {
  System.out.println("inside the constructer");
 }
  public static void main(String[]args)
  {
   //object name creation
   one n1=new one();
   n1.m1();
   //nameless object creation
   new one().m1();
  }
 }