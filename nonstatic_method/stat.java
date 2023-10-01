class stat
{
 static int a= 100;
 public static void main(String[]args)
 {
  System.out.println("Start @Cyber Success");
  //Direct
  System.out.println("Direct access"  +a );
  m1();
  //className
  System.out.println("CLassName access"  +stat.a );
  stat.m1();
  //object 
  stat obj1= new stat();
  System.out.println ("Object access"  +obj1.a );
  obj1.m1();
  System.out.println("Start @Cyber Success");
 }
 static void m1()
 {
   System.out.println("Inside m1 method");
 }
}

