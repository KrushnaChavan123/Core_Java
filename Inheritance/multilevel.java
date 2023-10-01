//multilevel hierarchical

class A
{
 int a=120;
}
class B extends A
{
 float b=120.5f;
}
class C extends B
{
 char x='a';
}
class multilevel
{
 public static void main(String[]args)
 {
  System.out.println("Start @Cyber Succcess");
  
   C c1=new C();
  
 System.out.println(c1.a);
 System.out.println(c1.b);
  System.out.println(c1.x);
 }
}