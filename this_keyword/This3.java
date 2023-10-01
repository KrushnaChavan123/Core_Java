class This3
{
 int a;//0
 void m1(int a)//100
 {
  System.out.println("Inside m1 method");
  System.out.println(this.a);//0
  this.a=a;
  System.out.println(this.a);//100
  }
  public static void main(String[]args)
  {
   This3 refvar=new This3();
   refvar.m1(100);
  }
 }