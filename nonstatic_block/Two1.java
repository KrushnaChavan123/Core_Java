
//Assignemnt 2
class one
{
 static int a=120;
 float b=120.5f;
 static
 {
  System.out.println("Inside the static block");
 }
 {
 System.out.println("inside the non static block");
 }
} 
class Two
{
	{
		 System.out.println("Inside non-static block of two class");
		 one s1=new one();
		 System.out.println(one.a);
		 System.out.println(s1.b);
	}
public static void main(String[]args)
{
 Two t2=new Two();
}
}

