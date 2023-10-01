class sample
{
 static int a;
static 
{
 System.out.println("Inside the static block"+a);
 a=100;
}
static void m1()
{
 System.out.println("Inside m1 method"+a);
 a=1000;
}
public static void main(String[]args)
{
 System.out.println("Start");
 sample.m1();
 System.out.println("Inside main method"+a);
 System.out.println("Stop");
}
}