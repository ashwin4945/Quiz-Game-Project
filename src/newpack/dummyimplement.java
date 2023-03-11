
package newpack;

    //  Usage of classes in different packages
    //  Here this is second package


interface dummyinterface 
{
	int a=10;    //  Interfaces with variables
	
	void printScore();
	default void defaultMethod()     //  Implementing interfaces with default methods
	{
		System.out.println("This is default method in interface and " + "Value of interface variable = " + a);
	}
}

public class dummyimplement implements dummyinterface   // Implementation of Interface
{
	public void printScore()
	{
		System.out.println("This is implementation of method of interface - dummyinterface and " + 
	                       "Accessing Interface variable from class which implements that interface " + a);
	}
}


