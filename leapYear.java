import java.util.*;
class leapYear
{
 public static void main(String args[])
 {
   int yr;
   Scanner s = new Scanner(System.in);
   System.out.print("enter : ");
   yr = s.nextInt();
   if(yr%4==0 && yr%100!=0 || yr%400==0)
   {
     System.out.println("Leap Year");
   }  
   else
    { System.out.println("Not Leap Year");}
 }
}