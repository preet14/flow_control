import java.util.*;
class Reverse
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n,t,r,sum=0;
    System.out.println("Enter : ");
    n=s.nextInt();
    t=n;
    while(t>0)
    {
      r=t%10;
      sum=sum*10+r;
      t=t/10;
    }
     System.out.println("Reverse of a number is "+sum);
   }
}
