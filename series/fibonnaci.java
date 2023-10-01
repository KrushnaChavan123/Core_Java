//fibonnaci series

class fibonnaci
{
 public static void main(String[] args)
 {
  int a=0,b=1,sum;
  for(int i=0;i<=10;i++)
  {
   System.out.print(a +" ");
   sum=a+b;
   a=b;
   b=sum;
  }
 }
}