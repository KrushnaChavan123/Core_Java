//Multilevel Inheritance

class Demo1
{
 int a=100;
}
class Demo2 extends Demo1
{
 float b=123.5f;
}
class Demo3 extends Demo2
{
 char c='x';
}
class Demo
{
	
  public static void main(String[]args)
 {
	 Demo3 d3=new Demo3();
	 System.out.println(d3.a);
	 System.out.println(d3.b);
	 System.out.println(d3.c);
 }
}