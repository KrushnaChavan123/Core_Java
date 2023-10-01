class demo2
{
 int a;
 {
  System.out.println("Instance block ");
  a=10;
 }
 demo2()
 {
  System.out.println("inside  the 0 arg constructer");
  System.out.println(a);
  a=100;
 }
 demo2(int x)
 {
  System.out.println("inside the 1 arg constructer");
  System.out.println(a);
  a=200;
 }
 void m1()
 {
  System.out.println("Inside the m1 method");
 }
 public static void main(String[]args)
 {
  System.out.println("Start");
  demo2 d1=new demo2();
  d1.m1();
  demo2 d2 =new demo2();
  d2.m1();
  System.out.println("Stop");
 }
}