class demo4
{
  char x='a';
 void m1()
 {
  System.out.println("Inside m1 method");
 }
}
class demo6
{
 public static void main(String[]args)
 {
  System.out.println("Start @Cyber Success");
  demo6 obj2=new demo6();
  obj2.m2();
  
  
  System.out.println("Stop @Cyber Success");
 }
 void m2()
 {
  System.out.println("Inside m2 method");
  //classname
  //System.out.println(demo4.a);
  //demo4.m1();
  //object
  demo4 obj1=new demo4();
  System.out.println(obj1.x);
  obj1.m1();
 }
}
  