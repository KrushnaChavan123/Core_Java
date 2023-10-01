class This2
{
 int a=100;
 float b=120.5f;
 void m1(int a,float b)
 {
  System.out.println("Inside m1 Method");
  System.out.println(a+b);
  System.out.println(this.a+this.b);
 }
 public static void main(String[]args)
 {
  This2 t1=new This2();
  t1.m1(190,270.5f);
  }
 }