class demo1
{
 int a=128;
 public static void main(String[]args)
 {
  System.out.println("Start @Cyber Success");
  demo1 obj1=new demo1();
  System.out.println(obj1.a);
  //demo1.obj2=new demo1();
  obj1.m1();
  demo1 obj2=new demo1();
  System.out.println(obj1.x);
  
  
  System.out.println("Stop @cyber Success");
 }
 void m1()
 {
 System.out.println("Inside m1 method");
 int x=100;
 }
}