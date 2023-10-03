//create variable within abstract method
abstract class variable2
{
 abstract int a=120;
}
class variable1 extends variable2
{
	int a=1200;
}
class variable3
{
 public static void main(String[]args)
 {
  variable2 v2=new variable1();
  System.out.println(v2.a);
  }
 }
 /*
 variable3.java:4: error: modifier abstract not allowed here
 abstract int a=120;
              ^  
*/