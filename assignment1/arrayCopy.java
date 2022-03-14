/*Q3. Write a method called copyOf(), which accept an int array and returns a copy of the given array. 
The method's signature is as follows:
public static int[] copyOf(int[] array)*/ 

package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class arrayCopy {
	public static void main(String[] args) 
	{
	    int n;
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the size of array: ");
	    n=sc.nextInt();
	    int array1[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        array1[i]=sc.nextInt();
	    }
	    System.out.println("elements in array1: ");
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(array1[i]+" ");
	            
	    }
	    copyOf(array1);
	}
	public static int[] copyOf(int array1[])
	{
	    int n=array1.length;
	    int array2[]=new int[n];
	    array2=array1;
	    System.out.println(" \nelements in array2 are: ");
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(array2[i]+" ");
	            
	    }
	    return array2;
	}
}
