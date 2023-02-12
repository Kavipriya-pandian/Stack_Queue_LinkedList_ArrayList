package DXC;

	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	//creating wrapper class
	class Integer
	{
		private int sum=0;
		public void add(int x)
		{
			sum=sum+x;
		}
		public int get()
		{
			return sum;
		}
	}
	public class Thread_Sum
	{

			private static Integer sum = new Integer();
		    
		    
		    public static void main(String[] args)
		    {

		    	for(int j=0;j<10;j++) 
		    	{
		    		sum=new Integer();
			        ExecutorService executor = Executors.newFixedThreadPool(1000);
			        for(int i = 0;i < 1000;i++)
			        {
			            executor.execute(new AddOne());
			        }
			
			        executor.shutdown();
			        while (!executor.isTerminated()) 
			        {
			        	
			        }
			
			        System.out.println(sum.get());
		    	}


		    }
		    
		    public static class AddOne implements Runnable
		    {
		       synchronized public void run() //synchronized method
		        {
		                sum.add(1);
		        }

		    }
		
		
	


}
