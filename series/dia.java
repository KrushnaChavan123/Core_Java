class dia
{
 public static void main(String[]args)
 {
  int i,j;
  for(i=5;i>=1;i--)
 {
    for(int k=4;k>=i;k--)
	{
	 System.out.print(" ");
	 }
   for(j=1;j<=i;j++)
   {
    System.out.print("* ");
   }
   System.out.println(" ");
  }
}
}