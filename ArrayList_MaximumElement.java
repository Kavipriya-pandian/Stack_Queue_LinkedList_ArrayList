package Week3_Assignment;

import java.util.*;
import java.io.*;


public class ArrayList_MaximumElement 
{
	
		
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the total numbers");
			int total=sc.nextInt();
			
			
			ArrayList<Integer> list=new ArrayList<Integer>();
			System.out.println("Enter numbers that ends with 0");
			Integer num=0;
			
		    for(int i=0;i<total;i++)
		   // while(((num)).intValue()>0)
		    {
		    	num=sc.nextInt();
		    	list.add(num);	
		    
		    }
		    
		    
		  
		    	System.out.println("The maximum number in the ArrayList is "+max(list));
		    
		}

		
		 public static Integer max(ArrayList<Integer> list)
		    {
			 	if(list.size()==0)
			    	return null;
			  
		    	Integer max=list.get(0);
		    	for(int i=0;i<list.size();i++)
		    	{
		    		if(list.get(i)>max)
		    		
		    			max=list.get(i);
		    		
		    		
		    	}
		    	return max;
		    	
		    }


}
	



