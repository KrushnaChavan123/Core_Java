//inheritance
//single

class demo2
{
 void m1()
 {
  System.out.println("Inside m1 method");
 }
}
class demo1 extends demo2
{
 void m2()
 {
  System.out.println("Inside m2 method");
 }
 public static void main(String[]args)
 {
  System.out.println("Start @Cyber Success");
  demo1 d1=new demo1();
  d1.m1();
  d1.m2();
  System.out.println("Stop @Cyber Success");
 }
}