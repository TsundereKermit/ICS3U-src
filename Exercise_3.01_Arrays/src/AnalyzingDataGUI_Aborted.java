import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Description: my attempt at GUI, turned out to take too much time, aborted
 * 
 * Author: Tony Jiang
 * Date: Dec. 1, 2018
 */

public class AnalyzingDataGUI_Aborted extends JFrame implements ActionListener {
    
    public static void main(String[] args){
        new AnalyzingDataGUI_Aborted();
    }
        
    public AnalyzingDataGUI_Aborted() {
        JFrame myFrame = new JFrame("AnaLyzingData_GUI");
        myFrame.setSize(600,400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new FlowLayout());
        myFrame.setVisible(false);
        
        JLabel title = new JLabel("Dice Roll Simulator");
	title.setBounds(10, 10, myFrame.getWidth(), 40);
	title.setFont(new Font("Arial", Font.BOLD, 26));
	title.setForeground(Color.BLACK);
        
        String[] choices = { "none", "Display rolls", "Display average", 
                                "Display frequency", "Reverse Rolls", "Exit" };
        JComboBox chooseYourFate = new JComboBox(choices);
        chooseYourFate.setSelectedIndex(0);
        chooseYourFate.addActionListener(this);
        chooseYourFate.setBounds(10,100,200,30);
        
        String welcome ="Hello there!" +
                        "\nWelcome to the dice rolling station!" +
                        "\nHow many times would you like to roll?";
        JTextArea textArea = new JTextArea(welcome);
        textArea.setBounds(320,270,200,70);
	textArea.setLineWrap(true);
	textArea.setWrapStyleWord(true);
	textArea.setFont(new Font("Arial", Font.PLAIN, 15));
        JScrollPane scroll = new JScrollPane (textArea);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(119, 136, 153));
        //mainPanel.add(title);
        //mainPanel.add(scroll);
        //mainPanel.add(chooseYourFate);
        //myFrame.setContentPane(mainPanel);
        myFrame.add(title);
        myFrame.add(chooseYourFate);
        myFrame.add(scroll);
        myFrame.setVisible(true);
    }
        
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
}
