import java.util.Scanner;
import newpack.dummyimplement;
import newpack.ThreadConcept;

public class MainClass {

	public static void main(String[] args) 
	{
		MCQTest test = new MCQTest();
		
		layout ob4 = new layout(17,21.47);
		newlayout ob2 = new newlayout();
		newlayout ob3 = new newlayout(ob2);  //  Passing object as parameter to constructor
		ob4.MethodOverride();        //  Overriding methods and associated object creation
		ob2.MethodOverride();
		
		//  Usage of classes in different packages
		
		newpack.dummyimplement obj = new newpack.dummyimplement();
		obj.printScore();
		obj.defaultMethod();   //  Implementing interfaces with default methods
		
		
		//  Thread creation using Runnable or extending Threads & Thread synchronization
		
		newpack.ThreadConcept ob5 = new newpack.ThreadConcept();
		
		Scanner sc = new Scanner(System.in);
		
		int w;
		String s1,s2;
		
		//  Reading console input (next() , nextInt() and nextLine()) using Scanner class
		
		w = sc.nextInt();
		s1 = sc.next();
		s2 = sc.nextLine();
		
		
		//   String handling functions
		
		int len = s1.length();
		char c1 = s2.charAt(10);
		int comp = s1.compareToIgnoreCase(s2);
	}

}
