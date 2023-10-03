//Single inheritance

class single1
{
 void m1()
 {
  System.out.println("Inside m1 method");
 }
}
class single extends single1
{
 void m2()
 {
  System.out.println("Inside m2 method");
 }
 public static void main(String[]args)
 {
  System.out.println("Start");
 // single1 s1=new single1();
  //s1.m1();
  System.out.println("*****************");
  single s=new single();
  s.m1();
  s.m2();
  System.out.println("Stop");
 }
}
  