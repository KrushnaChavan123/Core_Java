class Parent
{
 void m1()
 {
  System.out.println("Inside parent method");
 }
}
class child extends parent
{

}
class success
{
 public static void main(String[]args)
 {
  child c1=new child();
  c1.m1();
 }
}