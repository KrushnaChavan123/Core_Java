class sample11
{
 int a=100;
}
class sample12 extends sample11
{
 void m1()
 { 
	 super();
  System.out.println("Inside the m1"+a);
 }
}
class sample13
{
 public static void main(String[]args)
 {
  sample12 s12=new sample12();
  s12.m1();
 }
}