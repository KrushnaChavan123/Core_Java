 class sampleThree
{
 int a=100;
}
final class sampleTwo extends sampleThree
{
  void m1()
  {
   System.out.println("Inside m1 method"+a);
  }
}
class 
{
 public static void main(String[]args)
 {
  System.out.println("Start");
  sampleTwo s1=new sampleTwo();
  s1.m1();
  System.out.println("Stop");
 }
}