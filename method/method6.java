class method6
{
 public static void main(String[] args)
 {
  int a=100;
  method6.m1();
  m1();
 }
 static void m1()
 {
  System.out.println("Inside m1");
  return;
 }
}

class method7
{
   public static void main(String[] args)
	{
		 int a=125;
		 test(a);

	}
	static void test(int aa)
	{
		System.out.println("Inside test"+aa);
		return;

	}
}