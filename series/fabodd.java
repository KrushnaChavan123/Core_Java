//Write a code to print only odd fibonnaci series

class fabodd
{
 public static void main(String[]args)
 {
  int a=0,b=1,sum;
  for(int i=1;i<=15;i++)
  {
   if(a%2!=0)
   {
    System.out.print(a+" ");
   }
   sum=a+b;
   a=b;
   b=sum;
  }
 }
}