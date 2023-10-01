class stat2
{
 static float b=120.5f;
 static void test()
 {
  System.out.println("Inside method test");
  }
}
class stat1
{
public static void main(String[]args)
{
  //classname
  System.out.println(stat2.b);
  stat2.test();
  //object access
  stat2 obj1=new stat2();
  System.out.println(obj1.b);
  obj1.test();
 }
}
