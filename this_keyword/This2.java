class This2
{
 int a= 120;
 float b=150.5f;
 void m1(int a,float b)
 {
  System.out.println("Inside m1 method");
  System.out.println(a+b);
  System.out.println(this.a+this.b);
 }
 public static void main(String[]args)
 {
  This2 refvar=new This2();
  This2 refvar1=new This2();
  refvar.m1(100,150.4f);
  System.out.println("-----------");
  refvar1.m1(160,140.5f);
 }
}
