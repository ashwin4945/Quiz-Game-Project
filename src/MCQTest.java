

import java.awt.event.*;    //importing packages
import java.awt.*;
import javax.swing.*;


class ExcessScore extends Exception     //  Custom exceptions
{
	String s;
	ExcessScore(String s)
	{
		super(s);
	}
}

class layout extends JFrame   //Inheritance
{
	int a;
	double b;
	String str;
	
	layout()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,700);  
		
		getContentPane().setBackground(Color.black);  //Background colour choice
		setLayout(null);
		setResizable(false); //frame cannot be resized
	}
	
	
	// overloading in constructors
	
	layout(int a,double b)   // Passing basic data types as parameters to constructors
	{
		this.a = a;
		this.b = b;
	}
	
	layout(layout obj)     // passing object as parameter to constructor
	{
		this.a = obj.a;            // usage of this keyword
		this.str = obj.str;
	}
	
	layout returnObject()     // Returning objects from method
	{
		layout ob1 = new layout(10,15.2);
		return ob1;
	}
	
	void MethodOverride()    //  Method Overriding
	{
		System.out.println("OverRiding in class layout");
	}
}


class newlayout extends layout    // MultiLevel Inheritance and usage of super keyword
{
	int x;
	String y;
	
	newlayout()
	{
		this.x = 20;
		this.y = "NIE";
	}
	
	newlayout(newlayout ob2)
	{
		super(ob2);   // Multilevel inheritance - Passing objects as parameters in constructors in super()
	}
	
	void MethodOverride()     // Method Overriding
	{
		System.out.println("OverRiding in class newlayout");
	}
}

class text extends JTextArea
{
	text()
	{
		setBounds(0, 75, 700, 100);
		setLineWrap(true);
		setWrapStyleWord(true);
		setBackground(Color.black);
		setForeground(Color.white);
		setFont(new Font("Comic Sans MS",Font.BOLD,30));
		setBorder(BorderFactory.createBevelBorder(1));
		setEditable(false);
	}
}


public class MCQTest implements ActionListener   //Interface
{
	
	String[] questions = {
				             "Which of the following property is not true about JAVA?",
				             "Which of the following is used to access a class in Object Oriented Programming?",
				             "Which of the following is used in excption handling?",
				             "Which is the keyword used for memory allocation in JAVA?",
				             "How many constructors can be there in a class in Object Oriented Programming?",
				             "What is the keyword to forcefully generate an Exception?",
				             "Which of the following is not an Access Specifier?",
				             "Which of the following keywords is used to stop inheritance?",
				             "Which of the following is the valid way to find the length of a string?",
				             "Same Function name in different classes is known as"
						};
	
	String[][] options = {
							{ "Abstraction","Not Robust","Polymorphism","Encapsulation"},
							{ "Objects","Strings","Arrays","super"},
							{ "class","threads","access specifiers","try and catch blocks"},
							{"this","public","new","super"},
							{"Many","one","zero","two"},
							{"throws","catch","try","throw"},
							{"private","protected","public","int"},
							{"public","final","class","finally"},
							{"str.length","length","str.length()","str_length()"},
							{"Method Overloading","Method Overriding","inheritance","objects"}
						};
	
	char[] ans = {
						'B',
						'A',
						'D',
						'C',
						'A',
						'D',
						'D',
						'B',
						'C',
						'B'
				};
	
	char user_ans;
	char correct_ans;
	int index;
	int count_rightans=0;
	int total_ques = questions.length;
	int score;
	
	
	
	
	layout frame = new layout();
	
	JTextField textfield = new JTextField();
	
	text textarea = new text();
	
	
	JButton button_A = new JButton();   //Buttons for options
	JButton button_B = new JButton();
	JButton button_C = new JButton();
	JButton button_D = new JButton();
	
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	
	JTextField number_correct = new JTextField();
	JTextField disp_message = new JTextField();
	JTextField curr_score = new JTextField();
	JTextField disp_curr_scr = new JTextField();
	
	
	
	
	public MCQTest()  //Default constructor
	{
		
		textfield.setBounds(0, 0, 700, 75);
		textfield.setBackground(Color.black);
		textfield.setForeground(Color.orange);
		textfield.setFont(new Font("Times New Roman",Font.BOLD,45));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
				
		button_A.setBounds(0, 175, 100, 100); 
		button_A.setFont(new Font("Times New Roman",Font.BOLD,35));
		button_A.setFocusable(false);
		button_A.addActionListener(this);
		button_A.setText("A");
		
		button_B.setBounds(0, 300, 100, 100); 
		button_B.setFont(new Font("Times New Roman",Font.BOLD,35));
		button_B.setFocusable(false);
		button_B.addActionListener(this);            //usage of this keyword
		button_B.setText("B");
		
		button_C.setBounds(0, 425, 100, 100); 
		button_C.setFont(new Font("Times New Roman",Font.BOLD,35));
		button_C.setFocusable(false);
		button_C.addActionListener(this);
		button_C.setText("C");
		
		button_D.setBounds(0, 550, 100, 100); 
		button_D.setFont(new Font("Times New Roman",Font.BOLD,35));
		button_D.setFocusable(false);
		button_D.addActionListener(this);
		button_D.setText("D");
		
		answer_labelA.setBounds(150, 175, 500, 125);
		answer_labelA.setBackground(Color.black);
		answer_labelA.setForeground(Color.white);
		answer_labelA.setFont(new Font("Arial",Font.PLAIN,35));
		
		
		answer_labelB.setBounds(150, 300, 500, 125);
		answer_labelB.setBackground(Color.black);
		answer_labelB.setForeground(Color.white);
		answer_labelB.setFont(new Font("Arial",Font.PLAIN,35));
			
		
		answer_labelC.setBounds(150, 425, 500, 125);
		answer_labelC.setBackground(Color.black);
		answer_labelC.setForeground(Color.white);
		answer_labelC.setFont(new Font("Arial",Font.PLAIN,35));
		
		
		answer_labelD.setBounds(150, 550, 500, 125);
		answer_labelD.setBackground(Color.black);
		answer_labelD.setForeground(Color.white);
		answer_labelD.setFont(new Font("Arial",Font.PLAIN,35));
		
		
		number_correct.setBounds(100, 250, 500, 125);
		number_correct.setBackground(Color.black);
		number_correct.setForeground(Color.white);
		number_correct.setFont(new Font("Ink Free",Font.BOLD,50));
		number_correct.setBorder(BorderFactory.createBevelBorder(1));
		number_correct.setHorizontalAlignment(JTextField.CENTER);
		number_correct.setEditable(false);
		
		
		disp_message.setBounds(10,350,650,125);
		disp_message.setBackground(Color.black);
		disp_message.setForeground(Color.white);
		disp_message.setFont(new Font("Ink Free",Font.BOLD,30));
		disp_message.setBorder(BorderFactory.createBevelBorder(1));
		disp_message.setHorizontalAlignment(JTextField.CENTER);
		disp_message.setEditable(false);
		
		
		curr_score.setBounds(500, 550, 200, 40);
		curr_score.setBackground(Color.black);
		curr_score.setForeground(Color.white);
		curr_score.setFont(new Font("Arial",Font.BOLD,25));
		curr_score.setBorder(BorderFactory.createBevelBorder(1));
		curr_score.setHorizontalAlignment(JTextField.CENTER);
		curr_score.setEditable(false);
		curr_score.setText("Current Score");
		
		disp_curr_scr.setBounds(560, 590, 75, 50);
		disp_curr_scr.setBackground(Color.black);
		disp_curr_scr.setForeground(Color.green);
		disp_curr_scr.setFont(new Font("Times New Roman",Font.BOLD,45));
		disp_curr_scr.setBorder(BorderFactory.createBevelBorder(1));
		disp_curr_scr.setHorizontalAlignment(JTextField.CENTER);
		disp_curr_scr.setEditable(false);
		
		
			
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		
		frame.add(button_A);
		frame.add(button_B);
		frame.add(button_C);
		frame.add(button_D);
		
		frame.add(textarea);
		frame.add(textfield);
		frame.add(curr_score);
		frame.add(disp_curr_scr);
		frame.setVisible(true);
		
		nextQuestion();
		
	}
	
	// Logic Part starts here
	
	public void nextQuestion()   //AccessSpecifier(Public)
	{
		if(index>=total_ques)
		{
			results();
		}
		else
		{
			textfield.setText("Question "+(index+1));
			textarea.setText(questions[index]);
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
			disp_curr_scr.setText(""+count_rightans);
		}
	}

	@Override   //Method Overriding
	public void actionPerformed(ActionEvent e) 
	{
		button_A.setEnabled(false);
		button_B.setEnabled(false);
		button_C.setEnabled(false);
		button_D.setEnabled(false);
		
		if(e.getSource()==button_A)
		{
			correct_ans = 'A';
			if(correct_ans==ans[index])
			{
				count_rightans++;
			}
		}
		
		if(e.getSource()==button_B)
		{
			correct_ans = 'B';
			if(correct_ans==ans[index])
			{
				count_rightans++;
			}
		}
		
		if(e.getSource()==button_C)
		{
			correct_ans = 'C';
			if(correct_ans==ans[index])
			{
				count_rightans++;
			}
		}
		
		if(e.getSource()==button_D)
		{
			correct_ans = 'D';
			if(correct_ans==ans[index])
			{
				count_rightans++;
			}
		}
		
		showAnswer();
	}
	
	public void showAnswer()    //Member functions
	{
		button_A.setEnabled(false);
		button_B.setEnabled(false);
		button_C.setEnabled(false);
		button_D.setEnabled(false);
		
		if(ans[index] == 'A')
		{
			answer_labelA.setForeground(Color.green);
			answer_labelB.setForeground(Color.red);
			answer_labelC.setForeground(Color.red);
			answer_labelD.setForeground(Color.red);
		}
		
		if(ans[index] == 'B')
		{
			answer_labelA.setForeground(Color.red);
			answer_labelB.setForeground(Color.green);
			answer_labelC.setForeground(Color.red);
			answer_labelD.setForeground(Color.red);
		}
		
		if(ans[index] == 'C')
		{
			answer_labelA.setForeground(Color.red);
			answer_labelB.setForeground(Color.red);
			answer_labelC.setForeground(Color.green);
			answer_labelD.setForeground(Color.red);
		}
		
		if(ans[index] == 'D')
		{
			answer_labelA.setForeground(Color.red);
			answer_labelB.setForeground(Color.red);
			answer_labelC.setForeground(Color.red);
			answer_labelD.setForeground(Color.green);
		}
		
		
		//Method overriding below
		
		Timer pause = new Timer(1000,new ActionListener() {
			@Override                                          
			public void actionPerformed(ActionEvent e)
			{
				answer_labelA.setForeground(Color.white);
				answer_labelB.setForeground(Color.white);
				answer_labelC.setForeground(Color.white);
				answer_labelD.setForeground(Color.white);
				
				correct_ans=' ';
				
				button_A.setEnabled(true);
				button_B.setEnabled(true);
				button_C.setEnabled(true);
				button_D.setEnabled(true);
				
				index++;
				
				nextQuestion();
			}
		});
		
		pause.setRepeats(false);
		pause.start();
	}
	
	public void results()
	{
		
		button_A.setVisible(false);
		button_B.setVisible(false);
		button_C.setVisible(false);
		button_D.setVisible(false);
		
		
		answer_labelA.setVisible(false);
		answer_labelB.setVisible(false);
		answer_labelC.setVisible(false);
		answer_labelD.setVisible(false);
		
		
		button_A.setEnabled(false);
		button_B.setEnabled(false);
		button_C.setEnabled(false);
		button_D.setEnabled(false);
		
		
		curr_score.setVisible(false);
		disp_curr_scr.setVisible(false);
		
		textfield.setText("RESULTS");
		textarea.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		
		
		number_correct.setText("Total Score = "+count_rightans);
		
		// Custom exceptions
		
		try
		{
			if(count_rightans>10)
			{
				throw new ExcessScore("Score beyond maximum marks");
			}
		}
		catch(ExcessScore e)
		{
			disp_message.setText("Exception Occured here");
		}
		

		if(count_rightans==0)
		{
			disp_message.setText("Oops! That was a pretty bad performance");
		}
		
		if(count_rightans>=1 && count_rightans<5)
		{
			disp_message.setText("That was a good try!, Better Luck Next time");
		}
		
		if(count_rightans>=5 && count_rightans<8)
		{
			disp_message.setText("That was a pretty good performance!");
		}
		
		if(count_rightans>=8 && count_rightans<10)
		{
			disp_message.setText("Great! you have done an excellent work");
		}
		
		if(count_rightans==10)
		{
			disp_message.setText("That was a breathtaking performance!!");
		}
		
		
		frame.add(disp_message);
		
		frame.add(number_correct);
	}
}
