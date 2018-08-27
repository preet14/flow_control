import java.util.*;
class Palindrome
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
     if(sum==n)
     {
       System.out.println("Palindrome number");
     }
     else
     {
       System.out.println("Not a Palindrome number");
     }
  } 
}