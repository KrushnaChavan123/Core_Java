class Sample2
{
 static float b=200.5f;
 static void test1()
 {
  System.out.println("Inside test2");
 }

class Sample3
{
 public static void main(String[]args)
 {
  System.out.println("Start @Cyber Success");
  m1();

  System.out.println("Stop @ cyber Success");
 }

 static void m1()
 {
 
//class name
   System.out.println(Sample2.a);
    Sample2.test1();
     Sample2.ref3= new Sample2();
    ref3.b();
 
}
