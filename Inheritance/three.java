class one
{
 int a=100;
}
final class two extends one
{
 void m1()
 {
  System.out.println("inside m1 method-->"+a);
 }
}
class three
{
 public static void main(String[]args)
 {
  System.out.println("Start");
  two t1=new two();
  t1.m1();
  System.out.println("Stop");
 }
}