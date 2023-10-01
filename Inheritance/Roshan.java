//multilevel

class Dagu 
{
 void m1()
 {
  System.out.println("Inside m1 method");
 }
}
 class Vijay extends Dagu
 {
  void m2()
  {
   System.out.println("inside m2 method");
  }
 }
 class Roshan extends Vijay
 {
  void m3()
  {
   System.out.println("Inside m3 method");
  }
public static void main(String[]args)
{
   System.out.println("Start @Cyber Success");
  Roshan R1=new Roshan();
  R1.m1();
  R1.m2();
  R1.m3();
  System.out.println("Stop @Cyber SUccess");
 }
}


