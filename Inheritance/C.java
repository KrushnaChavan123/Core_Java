class A
{
 int a=100;
}
class B
{
 int a=200;
}
class C extends A,B
{
 public static void main(String[]args)
 {
  System.out.println("Start @Cyber Success");
  
  C c1=new C();
  System.out.println(c1.a);
  System.out.println(c1.a);
  }
}