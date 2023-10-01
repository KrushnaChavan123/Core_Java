class english
{
 static int a= 123;
 static void m1()
 {
  System.out.println("Inside m1 method");
 }
}
class english1
{
 public static void main(String[]args)
 {
  System.out.println("Start @CYber SUccess");
  english1 refvar1=new english1();
  refvar1.m2();
  
  
  System.out.println("Stop @Cyber Success");
 }
 void m2()
 {
  System.out.println(english.a);
  english refvar=new english();
  refvar.m1();
 }
}
 
 