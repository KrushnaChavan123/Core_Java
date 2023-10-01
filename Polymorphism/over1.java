//constucter overloading

class over
{
 over(float b)
 {
  System.out.println("Inside 0 arg const");
 }
 over(int a)
 {
  System.out.println("Inside 1 arg const");
 }
 public static void main(String[]args)
 {
  new over(12);
 }
}