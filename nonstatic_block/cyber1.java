//non static blocks are primary used for two purpose 1-initialized the non-static members during the run time

class cyber1
{
 int a=10;
 {
  System.out.println("Inside the non static blocks");
  System.out.println("Inside the variables"+a);
  a=10;
 }
cyber1()
{
 System.out.println("Inside the constructer");
 System.out.println("Inside the variable" +a);
 a=100;
}
void m1()
{
 System.out.println("Inside the m1 method");
}
public static void main(String[]args)
{
	System.out.println("Start");
 cyber1 c1=new cyber1();
 c1.m1();
 System.out.println("Stop");
}
}