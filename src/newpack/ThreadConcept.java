
package newpack;


class ThreadSynchronisation      //  Thread synchronization
{  
	synchronized void dispMessage(String s)
	{
			System.out.println(s);  
			try
			{  
				Thread.sleep(1000);  
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			} 
	}  
}  
  
class MyThreadA extends Thread      //  Thread creation using Runnable or extending Threads
{  
	ThreadSynchronisation ob1;  
	MyThreadA(ThreadSynchronisation ob1)
	{  
		this.ob1=ob1;  
	}  
	public void run()
	{  
		ob1.dispMessage("This message is printed by Child Thread 1");  
	}  
  
}  
class MyThreadB extends Thread   
{  
	ThreadSynchronisation ob2;  
	MyThreadB(ThreadSynchronisation ob2)
	{  
		this.ob2=ob2;  
	}  
	public void run()
	{  
		ob2.dispMessage("This message is printed by Child Thread 2"); 
	}  
}  


public class ThreadConcept 
{
	    public ThreadConcept()
	    {
	    	ThreadSynchronisation obj = new ThreadSynchronisation();
			MyThreadA t1=new MyThreadA(obj);  
			MyThreadB t2=new MyThreadB(obj);  
			t1.start();  
			t2.start();
	    }
		
}
