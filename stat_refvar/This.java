//this operator

class This
{
 int a=100;
 float b= 340.5f;
 void m1(int x,float y)
 {
  System.out.println("Inside m1 method");
  System.out.println(a+b);
  System.out.println(x+y);
 }
 public static void main(String[]args)
 {
  This t1=new This();
  t1.m1(12,23.0f);
  }
 }