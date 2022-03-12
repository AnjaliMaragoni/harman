/*Q1. Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:

The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5 */




package assignment1;
import java.util.*;
public class Fibonacci
{
   static int n1=1,n2=1,n3;
   static float sum=0.0f;
	 public static void main(String[] args)
   {
	      System.out.println("The first 20 Fibonacci numbers are:");
	      System.out.print(n1+" "+n2);
	      for(int i=2;i<20;i++)
        {
            n3=n1+n2;
	          System.out.print(" "+n3);
	          sum=sum+n3;
	          n1=n2;
	          n2=n3;
	      }
	      System.out.print("\n");
	      System.out.print("The average is "+ sum/20);
	 }
}
