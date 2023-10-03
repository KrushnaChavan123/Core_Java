//Inheritance practice

class cyber
{
 int a=12;
}
class success extends cyber
{
 float b=120.5f;
 public static void main(String[]args)
 {
  System.out.println("Start");
  cyber c1=new cyber(); //parent class object
  System.out.println(c1.a);
  success s1=new success();//child class object
  System.out.println(s1.b);
  System.out.println(s1.a);
 
  System.out.println("Stop");
  }
 }