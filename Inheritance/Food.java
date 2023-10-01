//Hierarchical

class zomato
{
 int a=100;
}
class swiggy extends zomato
{
 float b=120.5f;
}
class Domino extends zomato
{
 char c='a';
}
class uber extends zomato
{
 boolean d=true;
}

class Food
{
 public static void main(String[]args)
 {
 zomato z1=new zomato();
 System.out.println(z1.a);
 System.out.println("*****************************");
 swiggy s1=new swiggy();
 System.out.println(s1.a);
 System.out.println(s1.b);
System.out.println("*****************************");
 Domino D1=new Domino();
 System.out.println(D1.a);
 System.out.println(D1.c);
System.out.println("*****************************");
 uber u1=new uber();
 System.out.println(u1.a);
 System.out.println(u1.d);
  System.out.println("Stop @Cyber Success");
 }
}
