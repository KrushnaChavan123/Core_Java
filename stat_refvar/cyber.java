class cyber
{
 int a=100;
 static float b=200.5f;
 public static void main(String[]args)
 {
  cyber obj1=new cyber();
  System.out.println("inside main");
  System.out.println(obj1.a+cyber.b);
  cyber.m1 (obj1);
 }
 static void m1(cyber obj2)
 {
  System.out.println("Inside m1 method");
  System.out.println(obj2.a+cyber.b);
 }
}