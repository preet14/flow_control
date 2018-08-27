import java.util.*;
class Largest
{
 public static void main(String args[])
 {
   int a,b,c;
   Scanner s= new Scanner(System.in);
   System.out.println("Enter :");
   a=s.nextInt();
   b=s.nextInt(); 
   c=s.nextInt();
   if(a>b && a>c)
            System.out.println(a+" is the largest number");
        else if(b>a && b>c)
             System.out.println(b+" is the largest number");
        else
             System.out.println(c+" is the largest number");
  
 }
}