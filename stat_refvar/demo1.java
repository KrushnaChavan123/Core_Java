//assignment 29/08

class demo1
{
 static sample refvar;
 public static void main(String[]args)
 { 
   System.out.println("inside main");
  refvar=new sample();
 refvar.m1();
 }
}
 class sample{
  static int a=100;
  float b=200.5f;
  void m1()
  {
	   System.out.println("Inside m1");
   sample obj=new sample();
   System.out.println(a+obj.b);
  }
 }
