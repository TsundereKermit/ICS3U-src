/*
 * Description: This program uses the Swing library to create a GUI for the slider
 * game. It contains two JFrames. The first JFrame contains a JPanel and some other 
 * widgets. The second JFrame contains two JPanels and some widgets.
 * 
 * Author: Tony Jiang
 * Date: Dec. 5, 2018   
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SlidingActual extends JFrame implements ActionListener {
        
        //Declares the JFrames, JPanels, and other widgets
        private JFrame myFrame, loadingFrame;
        private JPanel myPanel, myPanel2, loadingPanel;
        private JButton[] myButtons;
        private JLabel moveShow, loadingTitle, threeByThreeImage, fourByFourImage, gridImage, fiveByFiveImage, custom, pajamaGuardians, sizing, background, selected1, selected2;
        private JButton threeByThree, fourByFour, fiveByFive, resetButton, scrambleButton, gridButton, startButton, customButton, guardianButton, hintButton;
        
        //Declares the variables needed for the slider part of the program
        private int emptyIndex, size, butLength, rows, cols, chunks;
        private int moveCounter=0;
        private int gridSize=4;
        private boolean buttonSetup=false;
        private boolean imageSelected=false;
        
        public static void main(String args[]) 
        {
        
            //calls the constructor for the loading screen
            SlidingActual slidingActual = new SlidingActual();
        
        } //end main
        
        /**
	 * Sets up the loading panel for the slider game.
         * (Turns out that using multiple JFrames is discouraged :( )
	 * Note that the JLabels with move with the user's choice, selected1 is placed
         * above 4x4 and selected2 is placed above the grid setup as the default choice.
 	 */
        
        public SlidingActual() {
            
                //Sets up the fonts for the buttons and title
                Font font = new Font("Arial", Font.PLAIN, 26);
                Font buttonFont = new Font("Arial", Font.PLAIN, 16);

                //Sets up the JFrame window
                loadingFrame = new JFrame();
                loadingFrame.setSize (750,650);
                loadingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                loadingFrame.setLayout(null);
                loadingFrame.setVisible(false);

                //Sets up the JPanel
                loadingPanel = new JPanel();
                loadingPanel.setSize(750,650);
                loadingPanel.setLocation(0,0);
                loadingPanel.setBackground(new Color(221, 234, 255));
                loadingPanel.setLayout(null); //Uses absolute positioning instead of layout managers

                //Sets up the title of the GUI
                loadingTitle = new JLabel();
                loadingTitle.setText("Slider Game");
                loadingTitle.setFont(font);
                loadingTitle.setForeground(Color.BLACK);
                loadingTitle.setBounds(100, 15, 200, 100);

                //Sets up all the JButtons for the user to interact with the program
                threeByThree = new JButton();
                threeByThree.addActionListener(this);
                threeByThree.setBounds(100, 250, 100, 60);
                threeByThree.setFont(buttonFont);
                threeByThree.setText("3x3");

                fourByFour = new JButton();
                fourByFour.addActionListener(this);
                fourByFour.setBounds(225, 250, 100, 60);
                fourByFour.setFont(buttonFont);
                fourByFour.setText("4x4");

                fiveByFive = new JButton();
                fiveByFive.addActionListener(this);
                fiveByFive.setBounds(350, 250, 100, 60);
                fiveByFive.setFont(buttonFont);
                fiveByFive.setText("5x5");

                gridButton = new JButton();
                gridButton.addActionListener(this);
                gridButton.setBounds(225, 525, 100, 60);
                gridButton.setFont(buttonFont);
                gridButton.setText("Grid");

                startButton = new JButton();
                startButton.addActionListener(this);
                startButton.setBounds(475, 485, 100, 100);
                startButton.setFont(new Font("Arial", Font.BOLD, 16));
                startButton.setText("Start");

                customButton = new JButton();
                customButton.addActionListener(this);
                customButton.setBounds(475, 250, 100, 60);
                customButton.setFont(buttonFont);
                customButton.setText("Custom");

                guardianButton = new JButton();
                guardianButton.addActionListener(this);
                guardianButton.setBounds(100, 525, 100, 60);
                guardianButton.setFont(buttonFont);
                guardianButton.setText("Picture");

                //Sets up the JLabels to indicate which option has been selected
                selected1 = new JLabel("Selected");
                selected1.setFont(new Font("Arial", Font.PLAIN, 14));
                selected1.setBounds(225,100,100,30);

                selected2 = new JLabel("Selected");
                selected2.setFont(new Font("Arial", Font.PLAIN, 14));
                selected2.setBounds(225,370,100,30);

                //Sets up the JLabels to illustrate user choice
                threeByThreeImage = new JLabel(new ImageIcon("Images/3x3.png"));
                threeByThreeImage.setBounds(100, 125, 100, 100);

                fourByFourImage = new JLabel(new ImageIcon("Images/4x4.png"));
                fourByFourImage.setBounds(225, 125, 100, 100);

                fiveByFiveImage = new JLabel(new ImageIcon("Images/5x5.png"));
                fiveByFiveImage.setBounds(350, 125, 100, 100);

                custom = new JLabel(new ImageIcon("Images/custom.png"));
                custom.setBounds(475, 125, 100, 100);

                pajamaGuardians = new JLabel(new ImageIcon("Images/PajamaGuardians.png"));
                pajamaGuardians.setBounds(100, 400, 100, 100);

                gridImage = new JLabel (new ImageIcon("Images/4x4.png"));
                gridImage.setBounds(225,400,100,100);

                //Sets up the remaining widgets
                sizing = new JLabel("Size:");
                sizing.setFont(buttonFont);
                sizing.setBounds(100,85,100,30);

                background = new JLabel("Background:");
                background.setFont(buttonFont);
                background.setBounds(100,350,100,30);

                //Adds the components to the JPanel
                loadingPanel.add(loadingTitle);
                loadingPanel.add(threeByThree);
                loadingPanel.add(fourByFour);
                loadingPanel.add(fiveByFive);
                loadingPanel.add(threeByThreeImage);
                loadingPanel.add(fourByFourImage);
                loadingPanel.add(fiveByFiveImage);
                loadingPanel.add(custom);
                loadingPanel.add(customButton);
                loadingPanel.add(pajamaGuardians);
                loadingPanel.add(guardianButton);
                loadingPanel.add(startButton);
                loadingPanel.add(gridButton);
                loadingPanel.add(gridImage);
                loadingPanel.add(sizing);
                loadingPanel.add(background);
                loadingPanel.add(selected1);
                loadingPanel.add(selected2);

                //Adds the JPanel to the JFrame
                loadingFrame.setContentPane(loadingPanel);
                loadingFrame.setVisible(true);
                
        } //end constructor
        
        public SlidingActual (int width, boolean imageSelection) {
                    
                butLength=width*width;
                size=width;
                imageSelected=imageSelection;
                
                //Sets up the JButton array
                myButtons = new JButton[butLength];
                
                //Sets up the JFrame window
                myFrame = new JFrame("Slider Game");
                myFrame.setSize (417,550);
                myFrame.setVisible(false);
                myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                //Sets up the first JPanel that contains all the JButtons from myButtons[]
                myPanel = new JPanel();
                myPanel.setSize(400,400);
                myPanel.setLocation(0,0);
                myPanel.setLayout(new GridLayout(width,width,5,5));
                myPanel.setBackground(Color.black);
                
                //Sets up the second JPanel which will include myPanel and other widgets
                myPanel2 = new JPanel();
                myPanel2.setSize(417, 550);
                myPanel2.setLocation(0,0);
                myPanel2.setLayout(null);
                myPanel2.setBackground(Color.white);
                
                //Sets up the buttons for the user to interact with the game board
                //This JButton will only be added if the image is selected
                hintButton = new JButton("Hint");
                hintButton.setBounds(105,405,80,95);
                hintButton.addActionListener(this);
                
                resetButton = new JButton("Reset");
                resetButton.setBounds(200,405,75,95);
                resetButton.addActionListener(this);
                
                scrambleButton = new JButton("Scramble");
                scrambleButton.setBounds(285, 405 ,100,95);
                scrambleButton.addActionListener(this);
                
                //This JLabel will show the amount of times te user has moved a button
                //on the gameboard
                moveShow = new JLabel();
                moveShow.setText("Moves: 0");
                moveShow.setBounds(10, 425, 100, 50);
                
                //This tests for whether the user has seleccted the image or not
                //and sets up buttons accordingly
                if (imageSelection == true) 
                    setupButtons(true);
                else
                    setupButtons(false);
                
                //Makes the last (bottom right) JButton to be "empty" and sets
                //the emptyIndex to the place of that button
                myButtons[butLength-1].setVisible(false);
                emptyIndex=butLength-1;
                
                //Adds the game board and other widgets to myPanel2
                myPanel2.add(myPanel);
                myPanel2.add(resetButton);
                myPanel2.add(scrambleButton);
                myPanel2.add(moveShow);
                
                if (imageSelection == true) {
                    myPanel2.add(hintButton);
                }
                
                //Adds myPanel2 to the JFrame
                myFrame.validate();
                myFrame.setContentPane(myPanel2);
                myFrame.setVisible(true);
            
        } //end of overloaded constructor
        
        public void setupButtons(boolean selection) {
            
            //Sets up the font and colors for setting up JButtons
            Font f = new Font("Arial", Font.BOLD, 26);
            Font f2 = new Font("Arial", Font.BOLD, 12);
            Color[] colours = {Color.orange, Color.white};
            
            //Sets up the JButtons with the text if the image did not get selected
            if (selection==false) {
                
                //Sets up each JButton
                for (int i = 0; i < myButtons.length; i++) { 
                
                            int colourIndex = 0;  
                            myButtons[i] = new JButton("" + i);  
                            
                                
                            if (size%2 == 0) {
                                for (int j = 0; j < size; j++) {
                                    if (i>=j*size && i <= (j+1)*size-1) {
                                        if (j%2 == 0) {
                                            if (i%2 != 0) {
                                                colourIndex=1;
                                            }
                                        }
                                        else
                                            if (i%2 == 0) {
                                                colourIndex=1;
                                            }
                                    }
                                }
                            }
                            else if (i%2==0)
                                colourIndex=1;
                            myButtons[i].setBackground(colours[colourIndex]);
                            myButtons[i].setForeground(Color.blue);  
                            if (size<7)
                                myButtons[i].setFont(f);
                            else
                                myButtons[i].setFont(f2);
                            myButtons[i].addActionListener(this);  
                            myPanel.add(myButtons[i]);
                            
                }
            }
            
            /*
             * Sets up the JButtons with parts of the image
             * Line 323 is from the accepted answer from 
             * "https://stackoverflow.com/questions/12418618/split-image-into-clickable-regions"
             * 
             * Note: I encountered a problem where the images don't completely fit the JButtons
             * and I have no idea how to fix it so I had to resize the ImageIcon
             */
            else {
                BufferedImage[] imgs = getImages();
                
                myButtons = new JButton[imgs.length];
                for (int i = 0; i < imgs.length; i++) {
                    
                    ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(imgs[i].getSource()));
                    Image img = icon.getImage();
                    //This is a stopgap measure of making the icon fit the JButtons as it did not fit
                    Image newimg = img.getScaledInstance(400/size+10, 400/size, java.awt.Image.SCALE_SMOOTH ) ;  
                    icon = new ImageIcon(newimg);
                    
                    myButtons[i] = new JButton(icon);
                    myButtons[i].setText(""+i);
                    myButtons[i].addActionListener(this);  
                    myPanel.add(myButtons[i]);
                }
            }
            
            buttonSetup=true;
        } // end of setupButtons
        
        /*
         * This gets the portion of the image needed for the button
         * Lines 345-379 is from the accepted answer from 
         * "https://stackoverflow.com/questions/12418618/split-image-into-clickable-regions"
         */
        
        private BufferedImage[] getImages() {
        cols=size;
        rows=size;
        chunks=cols*rows;
            
        File file = new File("Images/PajamaGuardians (2).png"); 
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            
        }
        BufferedImage image = null;
        try {
            image = ImageIO.read(fis); //reading the image file
        } catch (IOException ex) {
            System.out.println("You broke the code!");
        }
        int chunkWidth = image.getWidth() / cols; // determines the chunk width and height
        int chunkHeight = image.getHeight() / rows;
        int count = 0;
        BufferedImage imgs[] = new BufferedImage[chunks]; //Image array to hold image chunks
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                //Initialize the image array with image chunks
                imgs[count] = new BufferedImage(chunkWidth, chunkHeight, image.getType());

                // draws the image chunk
                Graphics2D gr = imgs[count++].createGraphics();
                gr.drawImage(image, 0, 0, chunkWidth, chunkHeight, chunkWidth * y, chunkHeight * x, chunkWidth * y + chunkWidth, chunkHeight * x + chunkHeight, null);
                gr.dispose();
            }
        }
        return imgs;
    } //  end of getImages
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            //Sets up the game board according to player's choice
            if (e.getSource()==threeByThree) {
                gridSize=3;
                setSizeSelected(3);
            }
            
            else if (e.getSource()==fourByFour) {
                gridSize=4;
                setSizeSelected(4);
            }
            
            else if (e.getSource()==fiveByFive) {
                gridSize=5;
                setSizeSelected(5);
            }
            
            else if (e.getSource()==customButton) {
                
                String customNum;
                int num=0;
                customNum = JOptionPane.showInputDialog ("Please enter your preferred size (between 2 and 7)");
                
                boolean trapPast=true;
                
                //This prevents the user from entering anything other than an integer
                try {
                    num = Integer.parseInt(customNum);
                } catch (NumberFormatException c) {
                    JOptionPane.showMessageDialog(myFrame, "You did not enter an integer, please try again");
                    trapPast=false;
                }
                
                //This prevents the user from entering an integer that is out of range
                if (trapPast==true) {
                    
                    if (num<=1 || num>7)
                        JOptionPane.showMessageDialog(myFrame, "Please enter a number between 1 and 7");
                    else 
                        gridSize=num;
                    
                    setSizeSelected(1337);
                }
            }
            
            else if (e.getSource()==guardianButton) {
                imageSelected=true;
                selected2.setBounds(100,370,100,30);
            }
           
            else if (e.getSource()==gridButton) {
                imageSelected=false;
                selected2.setBounds(225,370,100,30);
            }
            
            else if (e.getSource()==startButton) {
                
                if (gridSize>1) {
                    SlidingActual slidingActual = new SlidingActual(gridSize, imageSelected);
                    loadingFrame.setVisible(false);
                }
                
                else
                    JOptionPane.showMessageDialog(myFrame, "Please select a size");
            }
            
            else if (e.getSource()==resetButton) {
                reset();
            }
            
            else if (e.getSource()==scrambleButton) {
                scramble(100);
            }
            
            //Shows a 400x400 copy of the image on the game board 
            else if (e.getSource()==hintButton) {
                
                ImageIcon icon = new ImageIcon("Images/PajamaGuardians (2).png");
                
                JOptionPane.showMessageDialog(
                        null,
                        new JLabel("", icon, JLabel.LEFT),
                        "Hint", JOptionPane.INFORMATION_MESSAGE);
            }
            
            if (buttonSetup==true) {
                
                for (int i=0; i<myButtons.length; i++) {
                    
                    if (e.getSource() == myButtons[i]) {
                        movePiece(i);
                        setMoveShow(moveCounter);
                        
                        //This triggers the victory message if all the pieces are aligned
                        if (isVictorious()==true) {
                            JOptionPane.showMessageDialog(myFrame, "You won in "+moveCounter+" steps!");
                            reset();
                        }
                    }
                }
            }
            
        } // end of actionPerformed
        
        //This sets the size of the game board depending on user input
        public void setSizeSelected(int selected) {
            
            switch (selected) {
                case 3:
                    selected1.setBounds(100,100,100,30);
                    break;
                case 4:
                    selected1.setBounds(225,100,100,30);
                    break;
                case 5:
                    selected1.setBounds(350,100,100,30);
                    break;
                default:
                    selected1.setBounds(475,100,100,30);
                    break;
            }
        
        } // end of setSizeSelected
        
        //Sets the JLabel for moves used
        public void setMoveShow (int moves) {
            
            moveShow.setText("Moves: "+moves);
        
        } // end of setMoveShow
        
        public void movePiece (int index) {
            
                //this checks whether the player made a legal move or not
                if (emptyIndex > size - 1 && index + size == emptyIndex ||
                    emptyIndex%size > 0 && index + 1 == emptyIndex ||
                    emptyIndex%size < size - 1 && index - 1 == emptyIndex ||
                    emptyIndex < size*(size-1) && index - size == emptyIndex) {
                    
                    //This switches the text on the clicked button with the "empty" button
                    myButtons[emptyIndex].setText(myButtons[index].getText());
                    myButtons[index].setText("Kappa");
                    
                    //This is only executed if an image is selected, note that even if
                    //the image option is selected, the number is still present, just underneath the image
                    if (imageSelected==true) {
                        myButtons[emptyIndex].setIcon(myButtons[index].getIcon());
                    }
                    
                    myButtons[emptyIndex].setVisible(true);
                    
                    myButtons[index].setVisible(false);
                    emptyIndex=index;
                    
                    moveCounter++;
                }
                
        } //end of movePiece

        //This checks if all the numbers are in order
        public boolean isVictorious() {
            
            int num=0;
            for (int i=0; i<size*size-1; i++) {
                try { //this try-catch statement will find the "Kappa" button
                    num = Integer.parseInt(myButtons[i].getText());
                    if (i!=num)
                        return false;
                } catch (NumberFormatException c) {
                    //if the "Kappa" button is not at the end this method will return false
                    return false;
                }
            }
            return moveCounter>1;
        
        } //end of isVictorious
        
        //this method scrambles the game board
        private void scramble (int numRepeat) {
            
            for (int i=0; i<numRepeat; i++) {
                int swapNum;
                swapNum = (int) (Math.random()*size*size-1); 
                movePiece(swapNum);
            }
            
            //Sets the moveCounter to 0 after scramble
            moveCounter=0;
            setMoveShow(0);
        
        } //end of scramble
        
        public void reset() {
            
            if (imageSelected==false) {
                
                myButtons[emptyIndex].setVisible(true);
                myButtons[butLength-1].setVisible(false);
                emptyIndex=butLength-1;

                for (int i=0; i<myButtons.length; i++) {
                    myButtons[i].setText(""+i);
                    if (i==butLength-1)
                        myButtons[butLength-1].setText("Kappa");
                }
           
            
                moveCounter=0;
                setMoveShow(0);
            }
            /*
             * Because instead of switching the buttons, I simply moved the icon
             * of the JButtons if the game board is an image, I had to remove all
             * the buttons and add them again
            */
            else {
                for (JButton myButton : myButtons) {
                    myPanel.remove(myButton);
                    myPanel.revalidate();
                    myPanel.repaint();
                }
                
                setupButtons(true);
                
                myButtons[emptyIndex].setVisible(true);
                myButtons[butLength-1].setVisible(false);
                emptyIndex=butLength-1;
                
                moveCounter=0;
                setMoveShow(0);
            }
        } //end of reset

} //end of class