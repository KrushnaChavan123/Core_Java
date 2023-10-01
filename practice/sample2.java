class sample2
{
 int a=250;
 static float b=300.5f;
 public static void main(String[]args)
 {
  sample2 refvar=new sample2();
  float result=sample2.b+refvar.a;
  System.out.println(result);
  m1(refvar.a,refvar.b);
 }
 static void m1(int a,float b)
 {
  System.out.println("Inside m1 method");
  float result=a+b;
  System.out.println(result);
 }
}