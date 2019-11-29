import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Description: This frame will provide a graphical user interface (GUI)
 * that allows someone to translate easily from English text into Pig Latin
 *
 * @author Ms Cianci
 * @modifications Mr. Roller (Nov 12th, 2018)
 * @since  April 11th, 2016
 */
public class DemoGUI extends JFrame implements ActionListener
{
        private JFrame myFrame;
        private JPanel mainJPanel;
        private JLabel titleLabel;
	private JButton button;
	private JTextArea area1, area2;
	
	/**
	 * Constructor method sets up the frame for the Pig Latin translator's 
	 * graphical user interface
	 */
	public DemoGUI()
	{
                //Set up JFrame
                myFrame = new JFrame("Pig Latin Translater");
                myFrame.setSize(600,400);
                myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myFrame.setLayout(null);
                myFrame.setVisible(false);
                
                //Set up a title JLabel
		titleLabel = new JLabel("Pig Latin Translator");
		titleLabel.setBounds(10, 10, myFrame.getWidth(), 40);
		titleLabel.setFont(new Font("Georgia", Font.BOLD, 26));
		titleLabel.setForeground(Color.YELLOW);
		
                //Set up a JTextArea for entering text
		area1 = new JTextArea();
		area1.setBounds(360, 70, 215, 100);
		area1.setLineWrap(true);
		area1.setWrapStyleWord(true);
		area1.setFont(new Font("Georgia", Font.PLAIN, 15));
		
                //Set up a JTextArea for displaying text
		area2 = new JTextArea();
		area2.setBounds(360, 210, 215, 100);
		area2.setLineWrap(true);
		area2.setWrapStyleWord(true);
		area2.setFont(new Font("Georgia", Font.PLAIN, 15));
		area2.setEditable(false);
		
                //Set up a JButton to grab text from one window and put
                //it in the other
		button = new JButton("Hello ICS3U!");
		button.addActionListener(this);
		button.setBounds(0, 100, 340, 200);
		button.setOpaque(true);
		button.setBackground(new Color(150, 150, 150));
		button.setBorder(null);
                
                //Set up our main JPanel
                mainJPanel = new JPanel();
                mainJPanel.setLayout(null);
                mainJPanel.setBackground(new Color(0, 150, 0));
                mainJPanel.add(titleLabel);
                mainJPanel.add(area1);
                mainJPanel.add(area2);
                mainJPanel.add(button);
                
                //Add the JPanel to our JFrames Content Pane
                myFrame.setContentPane(mainJPanel);
                myFrame.setVisible(true);
		
	} // end constructor method
	
	/**
	 * If the translate button is pressed, translate the entered text from 
	 * English to Pig Latin and display it.
	 * If the instructions buttons is pressed, display the instructions in a pop-up
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button){
			//area1.setText("You pushed the button!");
			area2.setText("You wrote: " + area1.getText());
		
		}
	} // end actionPerformed method
	
	public static void main(String[] args)
	{
		new DemoGUI();
	}
} // end class