class sample11
{
 static boolean x=true;
 public static void main(String[]args)
 {
  m1();
 // sample1.m1();
 // sample1 ref2=new sample1()
 // ref2.m1();
 }
 static void m1()
 {
  System.out.println(x);
  System.out.println(sample11.x);
  sample11 obj = new sample11();
  System.out.println(obj.x);
 }
}