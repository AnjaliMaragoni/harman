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
