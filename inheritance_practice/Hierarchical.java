//Hierarchical Inheritance

class A
{
 int a=120;
}
class B extends A
{
 float b=120.5f;
}
class C extends A
{
 char c='a';
}
class D extends A
{
 boolean d=true;
}

class Hierarchical
{
public static void main(String[]args)
{
 System.out.println("Start");
 B b1=new B();
 System.out.println(b1.a); System.out.println(b1.b);
 System.out.println("*******************");
 C c1=new C();
 System.out.println(c1.c);System.out.println(c1.a);
 System.out.println("*******************");
 D d1=new D();
 System.out.println(d1.d);System.out.println(d1.a);
}
}