class Cap
{
 int a=120;
 static
 {
  System.out.println("inside the static block");
  Cap c1=new Cap();
  System.out.println(c1.a);
 }
 public static void main(String[]args)
 {
  System.out.println("Start");
  
  System.out.println("Stop");
 }
}