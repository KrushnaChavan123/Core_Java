class parent
{
	
 void m1()
 {
  System.out.println("Inside parent method");
 }
}
class child extends parent
{
 void m1(int b)
 {
  System.out.println("Inside child methood");
 }
}
class cyber
{
 public static void main(String[]args)
 {
  System.out.println("Start");
  child c1=new child();
  c1.m1(100);
  System.out.println("Stop");
 }
}
  