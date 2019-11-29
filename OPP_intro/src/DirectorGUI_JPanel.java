/* Description: This program uses the Java Swing library to
 * create a GUI for our Director/Acrobat classes (all 7 of them).  
 * It contains one JFrame
 * which is made up of one JPanel which in turn is made up of a text
 * area (with an attached scrollbar), a combo box, and up to 4 buttons.
 * Original Author: Unknown
 * Modifications: Mr. Roller
 * Modification Date: Oct 17th, 2018
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DirectorGUI_JPanel extends JFrame implements ActionListener
{
	private Acrobat acrobat = new Acrobat();
	private Dice die = new Dice();

        //declare a Swing JFrame, JPanel and other widget objects
        private JFrame myFrame;
        private JPanel mainJPanel;
	private JTextArea displayArea;
	private JScrollPane scrollPane;
	private JComboBox classes;
	private JButton button1, button2, button3, button4;
	
	public static void main(String[] args) 
	{	
		new DirectorGUI_JPanel();
	} // end main
	
	public DirectorGUI_JPanel()
	{
                //Setup our JFrame Window
                myFrame = new JFrame("OOP Role Playing GUI");//w/ frame title
                myFrame.setSize(600,400); //size the window
                myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myFrame.setLayout(null); //no Layout manager being used
                myFrame.setVisible(false);
		
		// combo box
		String[] choice = 
			{"Select a class","Acrobat Class","Dice Class","Calculator Class","LazyCalculator Class","Bamboozler Class","Blackboard Class","Decider Class"};
		classes = new JComboBox(choice);
		classes.setSelectedIndex(0);
		classes.setBounds(10, 50, 150, 30);
		classes.addActionListener(this);

		// buttons for user to interact with each class
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		button1.setBounds(10, 150, 150, 30);
		button2.setBounds(10, 200, 150, 30);
		button3.setBounds(10, 250, 150, 30);
		button4.setBounds(10, 300, 150, 30);
		
		button1.setVisible(false);
		button2.setVisible(false);
		button3.setVisible(false);
		button4.setVisible(false);
		
		button1.setFont(new Font("Georgia", Font.BOLD, 12));
		button2.setFont(new Font("Georgia", Font.BOLD, 12));
		button3.setFont(new Font("Georgia", Font.BOLD, 12));
		button4.setFont(new Font("Georgia", Font.BOLD, 12));
		
		// text area to display output
		displayArea = new JTextArea("DirectorGUI class is running...");
		displayArea.setBounds(175, 25, 400, 320);
		displayArea.setWrapStyleWord(true);
		displayArea.setLineWrap(true);
		displayArea.setBackground(Color.BLACK);
		displayArea.setForeground(Color.WHITE);
		displayArea.setFont(new Font("Georgia", Font.BOLD, 14));
		displayArea.setEditable(false);
		scrollPane = new JScrollPane(displayArea);
		scrollPane.setBounds(175, 25, 400, 320);
		
                mainJPanel=new JPanel();  //Second half of JPanel Instantiation
		mainJPanel.setLayout(null); //no Layout Manager used
                mainJPanel.setSize(300,200);
                mainJPanel.setBackground(new Color(0, 78, 106));
                mainJPanel.add(scrollPane);  //add text area
                mainJPanel.add(classes);     //add combo box dropdown
                mainJPanel.add(button1);     //add button
                mainJPanel.add(button2);
                mainJPanel.add(button3);
                mainJPanel.add(button4);
                
                //Add my only JPanel to my JFrame
                myFrame.setContentPane(mainJPanel);
		myFrame.setVisible(true);
                
	} // end constructor
	
	public void actionPerformed(ActionEvent e)
	{
		// if the user chose something from the drop down menu
		// then show the appropriate buttons
		if(e.getSource() == classes)
		{
			button1.setVisible(true);
			button2.setVisible(true);
			button3.setVisible(true);
			button4.setVisible(false);	// only becomes visible if blackboard is chosen
			
			showAppropriateButtons();
		}
		// if the user pressed a button, go to a method that knows what to do based upon 
		// which class is currently selected in the drop down menu
		else if(e.getSource() instanceof JButton) 
		{
			if(classes.getSelectedItem().equals("Acrobat Class"))
				actionPerformedAcrobat(e);

			else if(classes.getSelectedItem().equals("Dice Class"))
				actionPerformedDice(e);
			
			else if(classes.getSelectedItem().equals("Calculator Class"))
				actionPerformedCalculator(e);
			
			else if(classes.getSelectedItem().equals("LazyCalculator Class"))
				actionPerformedLazyCalculator(e);
			
			else if(classes.getSelectedItem().equals("Bamboozler Class"))
				actionPerformedBamboozler(e);
			
			else if(classes.getSelectedItem().equals("Blackboard Class"))
				actionPerformedBlackboard(e);
			
			else if(classes.getSelectedItem().equals("Decider Class"))
				actionPerformedDecider(e);
		
		}
	} // end actionPerformed method
	
	public void showAppropriateButtons()
	{
		if(classes.getSelectedItem().equals("Acrobat Class"))
		{
			displayArea.append("\n\nAcrobat class has been chosen...");
			button1.setText("Clap");
			button2.setText("Kneebend");
			button3.setText("Count");
		}
		else if(classes.getSelectedItem().equals("Dice Class"))
		{
			displayArea.append("\n\nDice class has been chosen...");
			button1.setText("Roll");
			button2.setText("Number of Rolls");
			button3.setText("Reset");
		}
		else if(classes.getSelectedItem().equals("Calculator Class"))
		{
			displayArea.append("\n\nCalculator has class been chosen...");
			button1.setText("Add");
			button2.setText("Subtract");
			button3.setVisible(false);
		}
		else if(classes.getSelectedItem().equals("LazyCalculator Class"))
		{
			displayArea.append("\n\nLazyCalculator class has been chosen...");
			button1.setText("Add 2 Integers");
			button2.setText("Add 4 Integers");
			button3.setVisible(false);
		}
		else if(classes.getSelectedItem().equals("Bamboozler Class"))
		{
			displayArea.append("\n\nBamboozler class has been chosen...");
			button1.setText("Add");
			button2.setText("Subtract");
			button3.setVisible(false);
		}
		else if(classes.getSelectedItem().equals("Blackboard Class"))
		{
			displayArea.append("\n\nBlackboard class has been chosen...");
			button1.setText("Draw Square");
			button2.setText("Draw Circle");
			button3.setText("Draw Text");
			button4.setVisible(true);
			button4.setText("Clear");
		}
		else if(classes.getSelectedItem().equals("Decider Class"))
		{
			displayArea.append("\n\nDecider class has been chosen...");
			button1.setText("Day of the Week");
			button2.setText("Rate Someone");
			button3.setVisible(false);
		}
		else if(classes.getSelectedItem().equals("Select a class"))
		{
			displayArea.append("\n\nSelect a class...");
			button1.setVisible(false);
			button2.setVisible(false);
			button3.setVisible(false);
		}
	
	}

	public void actionPerformedAcrobat(ActionEvent e)
	{
		if(e.getActionCommand().equals("Clap"))
		{
			try
			{
				int numClaps = Integer.parseInt(JOptionPane.showInputDialog("How many claps?"));
				displayArea.append("\n\n" + acrobat.clap(numClaps));
			}
			catch(NumberFormatException ex)
			{
				displayArea.append("\n\nERROR - Invalid number of claps");
			}
		}
		else if(e.getActionCommand().equals("Kneebend"))
		{
			try
			{
				int numBends = Integer.parseInt(JOptionPane.showInputDialog("How many kneebends?"));
				displayArea.append("\n\n" + acrobat.kneeBend(numBends));
			}
			catch(NumberFormatException ex)
			{
				displayArea.append("\n\nERROR - Invalid number of kneebends");
			}
		}
		else if(e.getActionCommand().equals("Count"))
		{
			displayArea.append("\n\nNumber of exercises: " + acrobat.count());
		}
	}

	public void actionPerformedDice(ActionEvent e)
	{
		if(e.getActionCommand().equals("Roll"))
		{
			displayArea.append("\n\nRoll of the die: " + die.roll());
		}
		else if(e.getActionCommand().equals("Number of Rolls"))
		{
			displayArea.append("\n\nNumber of rolls: " + die.numRolls());
		}
		else if(e.getActionCommand().equals("Reset"))
		{
			die.reset();
			displayArea.append("\n\nCount has been reset");
		}
	}
	
	public void actionPerformedCalculator(ActionEvent e)
	{
		Calculator calc = new Calculator();
		
		if(e.getActionCommand().equals("Add"))
		{
			try
			{
				int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
				int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
				
				displayArea.append("\n\n" + num1 + " + " + num2 + " = " + calc.add(num1, num2));
			}
			catch(NumberFormatException ex)
			{
				displayArea.append("\n\nERROR - Input must be an integer");
			}
		}
		else if(e.getActionCommand().equals("Subtract"))
		{
			try
			{
				int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
				int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
				
				displayArea.append("\n\n" + num1 + " - " + num2 + " = " + calc.subtract(num1, num2));
			}
			catch(NumberFormatException ex)
			{
				displayArea.append("\n\nERROR - Input must be an integer");
			}
		}
	}
	
	public void actionPerformedLazyCalculator(ActionEvent e)
	{
		LazyCalculator lazy = new LazyCalculator();
		
		if(e.getActionCommand().equals("Add 2 Integers"))
		{
			try
			{
				int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
				int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
				
				displayArea.append("\n\n" + num1 + " + " + num2 + " = " + lazy.add(num1, num2));
			}
			catch(NumberFormatException ex)
			{
				displayArea.append("\n\nERROR - Input must be an integer");
			}
		}
		else if(e.getActionCommand().equals("Add 4 Integers"))
		{
			try
			{
				int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
				int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a second number"));
				int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter a third number"));
				int num4 = Integer.parseInt(JOptionPane.showInputDialog("Enter a fourth number"));
				
				displayArea.append("\n\n" + num1 + " + " + num2 + " + " + num3 + " + " + num4 + " = " + lazy.add(num1, num2, num3, num4));
			}
			catch(NumberFormatException ex)
			{
				displayArea.append("\n\nERROR - Input must be an integer");
			}
		}
	}
	
	public void actionPerformedBamboozler(ActionEvent e)
	{
		Bamboozler oozler = new Bamboozler();
		
		if(e.getActionCommand().equals("Add"))
		{
			try
			{
				int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
				int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
				
				displayArea.append("\n\n" + num1 + " + " + num2 + " = " + oozler.add(num1, num2));
			}
			catch(NumberFormatException ex)
			{
				displayArea.append("\n\nERROR - Input must be an integer");
			}
		}
		else if(e.getActionCommand().equals("Subtract"))
		{
			try
			{
				int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
				int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
				
				displayArea.append("\n\n" + num1 + " - " + num2 + " = " + oozler.subtract(num1, num2));
			}
			catch(NumberFormatException ex)
			{
				displayArea.append("\n\nERROR - Input must be an integer");
			}
		}	
	}
	
	public void actionPerformedBlackboard(ActionEvent e)
	{
		Blackboard board = new Blackboard();
		
		if(e.getActionCommand().equals("Draw Square"))
		{
			displayArea.append("\n\n" + board.drawSquare());
		}
		else if(e.getActionCommand().equals("Draw Circle"))
		{
			displayArea.append("\n\n" + board.drawCircle());
		}
		else if(e.getActionCommand().equals("Draw Text"))
		{
			String text = JOptionPane.showInputDialog("Enter text");
			if (text != null)
				{
				displayArea.append("\n\n" + board.drawText(text));
				}
		}
		else if(e.getActionCommand().equals("Clear"))
		{
			displayArea.setText("");
		}
	}
	
	public void actionPerformedDecider(ActionEvent e)
	{
		Decider decide = new Decider();
		
		if(e.getActionCommand().equals("Day of the Week"))
		{
			String month = JOptionPane.showInputDialog("Enter a month \n(Ex: April)");
			try
			{
				int day = Integer.parseInt(JOptionPane.showInputDialog("Enter a day of the month\n(An integer between 1 and 31)"));
				
				if(decide.dayOfWeek(month, day).equalsIgnoreCase("Invalid Input"))
					displayArea.append("\n\n" + decide.dayOfWeek(month, day));
				else
					displayArea.append("\n\n" + decide.dayOfWeek(month, day) + ", "+ month + " " + day + ", 2018");
			}
			catch(NumberFormatException ex)
			{
				displayArea.append("\n\nERROR - Day must be an integer");
			}
		}
		else if(e.getActionCommand().equals("Rate Someone"))
		{
			String text = JOptionPane.showInputDialog("Enter a person's name");
			if(decide.rate(text).equalsIgnoreCase("do not know"))
				displayArea.append("\n\n" + decide.rate(text));
			else
				displayArea.append("\n\n" + text + ": " + decide.rate(text));
		}
	}

} // end class