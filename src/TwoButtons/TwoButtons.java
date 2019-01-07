package TwoButtons;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;

/*
 * Alanna Botscharow
 * 12/18
 */
public class TwoButtons implements ActionListener{
	JButton redButton = null; //this variable is a member of the class.
	JButton greenButton = null;
	JFrame myFrame = null;
	BorderLayout bLayout;
	public static void main(String[] args) {
	
		//Instance of the two buttons
		new TwoButtons(); 
		
	}

	//constructor public 
	public TwoButtons() {
        myFrame = new JFrame(); //Create a new JFrame
		
		//set frame title, size, location.
		myFrame.setTitle("Choose your color");
		myFrame.setSize(550,150); 
		myFrame.setLocation(200, 300);
		
		
		//close the program.
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//assign layout
		bLayout = new BorderLayout(5,10);
		//FlowLayout myLayout = new FlowLayout(); 
		//GridLayout myLayout = new GridLayout(3,2); 
		JPanel myPanel = (JPanel)myFrame.getContentPane(); 
		//BoxLayout myLayout = new BoxLayout(myPanel,BoxLayout.Y_AXIS);
		BorderLayout myLayout = new BorderLayout(); 
		myFrame.setLayout(myLayout);
		Border myBorder = (BorderFactory.createLineBorder(Color.red));
		myPanel.setBorder(myBorder); 
		
		
		
		//Buttons
		redButton = new JButton("red");
		greenButton = new JButton("green"); 
		redButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		greenButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
		
		myFrame.add(redButton,BorderLayout.LINE_START);
	/*	myFrame.add(new JLabel("")); 
		myFrame.add(new JLabel("")); 
		myFrame.add(new JLabel("")); 
		myFrame.add(new JLabel("")); 
		*/myFrame.add(greenButton,BorderLayout.LINE_END); 
		
		// link the buttons
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		
		//make the frame visible
		myFrame.setVisible(true);
		
		
	}

	public void actionPerformed(ActionEvent event) {
		Object control = event.getSource(); 
		
		//if red button was clicked
		if (control == redButton )
		{
			myFrame.getContentPane().setBackground(Color.red) ;
		}
		//else if green button was clicked
		else if (control == greenButton)
		{
			myFrame.getContentPane().setBackground(Color.green) ;
		}
	}
}
