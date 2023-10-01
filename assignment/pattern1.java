class pattern
{
 public static void main(String[]args)
 {
   int num=87;
   String str=(num%7==0 && num%10==7) ? "Buzz":"Not Buzz";
   System.out.println(str);
 }
}