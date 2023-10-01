//This operator

class This
{
 int a=120;
 float b=134.5f;
 void m1(int x,float y)
 {
   System.out.println("Inside m1 method");
   System.out.println(a+b);
   System.out.println(x+y);
  }

  public static void main(String[]args)
  {
   This refvar=new This();
   refvar.m1(12,40.5f);
  }
 }



