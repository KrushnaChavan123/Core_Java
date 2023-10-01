class This1
{
 //char x= 'a';
 float y=123.4f;
 int x=123;
 void m1(int a,float b)
 {
  System.out.println("Inside method m1");
  System.out.println(y+x);
  System.out.println(a+b);
 }
 public static void main(String[]args)
 {
 
  This1 t1=new This1();
  t1.m1(12,45.6f);
  }
 }
 