//All in One

class Test
{
 static int a;
 float b;

 static
 {
  System.out.println("Inside static block"+a);
  a=10;
 }
 {
  System.out.println("Inside non_static block"+b);
  b=200.5f;
 }
 Test()
 {
  this(200.5f);
  System.out.println("Inside o arg const"+b);
 }
 Test(float b)
 {
  System.out.println("Inside 1 arg const"+b);
  this.b=b;
 }
 static void m1()
 {
  System.out.println("inside static method"+a);
 }
 void m2(float b)
 {
  System.out.println("Inside non-static method"+b);
  this.b=b;
 }
 public static void main(String[]args)
{
 System.out.println("Start");
 Test t1=new Test();
 t1.m2(200.5f);
 System.out.println("Stop");
}
}