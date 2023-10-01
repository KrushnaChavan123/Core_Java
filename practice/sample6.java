class sample6
{
 int a=120;
 static float b=120.5f;
 public static void main(String[]args)
 {
  float result=sample7.m1();
   System.out.println(result);
  }
 }
 
 class sample7
 {
  static float m1()
  {
   sample6 refvar= new sample6();
   float result=refvar.a+sample6.b;
   System.out.println(result);
   return result;
  }
 }