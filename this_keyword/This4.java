class This4
{
 int x=100;
 static void m1(int x)
 {
  System.out.println("Inside m1 method");
  System.out.println(x);
  System.out.println(this.x);//ce
  }
  public static void main(String[]args)

 {
 This4 refvar=new This4();
  refvar.m1(120);
  }
 }