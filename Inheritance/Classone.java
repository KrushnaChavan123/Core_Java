class A
{
 int x=100;
}
class B extends A
{
 void test()
 {
  x=200;
 }
}
class D extends B
{
 void m1()
 {
  test();
  System.out.println("The value of x in m1-->"+x);
 }
}
class C extends A
{
 void test()
 {
  x=300;
 }
}
class E extends C
{
 void m2()
 {
  test();
   System.out.println("The value of x in m2-->"+x);
 }
}
class Classone
{
 public static void main(String[]args)
 {
  System.out.println("Start");
  D d1=new D();
  d1.m1();
  E e1=new E();
  e1.m2();
  System.out.println("Stop");
 }
}