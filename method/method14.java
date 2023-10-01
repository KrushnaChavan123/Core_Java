class method14
{
 public static void main(String[]args)
 {
  int a=125,b=150;
  int result1=m1(a,b);
  System.out.println(result1);
  float x=125.0f,y=150.5f;
  float result2=m2(x,y);
  System.out.println(result2);
 }
 static int m1(int aa,int bb)
 {
  System.out.println("inside m1 method");
  int result=aa+bb;
  return result;
 }
 static float m2(float xx,float yy)
 {
  System.out.println("Inside m2 method");
  float result = xx+yy;
  return result;
 }
}
