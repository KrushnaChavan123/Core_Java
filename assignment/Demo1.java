//constructer are never part of inheritance as it violets Rule no1


class Demo2
{
 Demo2()
 {
  System.out.println("inside the 0 arg constuctor");
 }
}
class Demo3 extends Demo2
{
 Demo3()
 {
  super();
  System.out.println("Inside Demo3 0 arg constuctor");
 }
}
class Demo1
{
 public static void main(String[]args)
 {
  Demo3 d3=new Demo3();
 }
}