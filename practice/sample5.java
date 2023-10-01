class Sample3
{
 static char a= 'x';
 static void m1()
 {
    System.out.println(a);
    System.out.println(Sample3.a);
    Sample3 ref = new Sample3();
    System.out.println(ref.a);

  }
 }
 class sample5
 {
  public static void main(String[]args)
  {
   Sample3.m1();
   Sample3 ref1 = new Sample3();
   ref1.m1();
  }
 
 }