class Demo
{ 
 void test()
 {
  System.out.println("Inside test method-->0 arg");
 }
 void test(int a)
 {
  System.out.println("Inside test method-->1 arg");
 }
 void test(int a,float b)
 {
  System.out.println("inside test method-->2arg");
 }
}
class Demo1
{
 public static void main(String[]args)
 {
  System.out.println("Start");
  Demo d1=new Demo();
  d1.test(12,13.5f);
 System.out.println("Stop");
 }
}