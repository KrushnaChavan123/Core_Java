class swap3
{
 public static void main(String[]args)
 {
   int a= 50,b=30,temp;
   System.out.println("Before Swapping");
   System.out.println("The value of a is" +a);
   System.out.println("The value of b is"  +b);

   a=a*b;
   b=a/b;
   a=a/b;

   System.out.println("After swapping");
   System.out.println("The value of a is" +a);
   System.out.println("The value of b is" +b);
 }
}

