class sample3
{
 float x= 120.5f;
 }
 class sample4
 {
  int y=190;
  public static void main(String[]args)
  {
    sample3 obj1 = new sample3();
    sample4 obj2 = new sample4();
    float result = obj1.x+ obj2.y;
    System.out.println(result);
  }
 }
   