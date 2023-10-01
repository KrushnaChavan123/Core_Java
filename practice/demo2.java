class demo2
{
 static int a=120;
 public static void main(String[]args)
 {
  System.out.println("Start @Cyber Success");
  //System.out.println(a);
  //m1();
  demo2 obj2=new demo2();
  obj2.m2();
  
  
  System.out.println("Stop @Cyber Success");
 }
 static void m1()
 {
  System.out.println("Inside m1 method");
 }
 void m2()
 {
	 System.out.println("Inside m2 method");
	 //Direct access
	 System.out.println(a);m1();
	 //class name access
	 System.out.println(demo2.a); demo2.m1();
	 //object access
	 demo2 obj1=new demo2();
	 System.out.println(obj1.a);
	 obj1.m1();

}
}