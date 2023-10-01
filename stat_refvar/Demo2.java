//Assignment 29/08

class Demo2
{
 public static void main(String[]args)
 { 
  sample3.refvar2=new sample2();
  sample3.refvar2.m1();
  sample3.refvar1=new sample1();
  System.out.println(sample3.refvar1.b);
  
 }
}
 class sample1
 {
  float b= 100.5f;
 }
 class sample2
 {
  void m1()
  {
   System.out.println("inside m1 method");
  }
 }
 class sample3
 { 
  static sample1 refvar1;
  static sample2 refvar2;
 }
  