class Demo2
{
 Demo2()
 {
  System.out.println("Inside the Demo2 0 arg const");
 }
}
class Demo3 extends Demo2
{
 Demo3()
 {
	 this(100);
	 //super();
  System.out.println("Inside the Demo3 0 arg const");
 }
 Demo3(int a)
 {
  //super();
  System.out.println("Inside Demo3 1 arg const");
 }
}
class Demo12
{
 public static void main(String[]args)
 {
  Demo3 d3=new Demo3();
 }
}