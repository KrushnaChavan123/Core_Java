class Demo
{
 void m1()
 {
  System.out.println("Inside m1 method-->0 arg");
 }
 void m1(int a)
 {
  System.out.println("Inside m1 method-->1 arg");
 }
 void m1(int b,float a)
 {
  System.out.println("Inside m1 method-->2Arg");
 }
 public static void main(String[]args)
 {
  System.out.println("Start");
  Demo d1=new Demo();
  d1.m1(12,12.5f);
  System.out.println("Stop");
 }
}