//Multilevel Inheritance

class DemoA
{
 void m1()
 {
  System.out.println("Inside m1 method");
 }
}
class DemoB extends DemoA
{
 void m2()
 {
  System.out.println("Inside m2 method");
 }
}
class DemoC extends DemoB
{
 void m3()
 {
  System.out.println("Inside m3 method");
  }
}
class One
{
 public static void main(String[]args)
 {
  DemoC d3=new DemoC();
  d3.m1();
  d3.m2();
  d3.m3();
 }
}
