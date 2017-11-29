/**
 * 
 * @author Mari Dohnalová
 * This program calculate the sum of the first and second value
 * when the user clicks on the calculate button.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class U15L1 {
	
	static JFrame frame;
	static JLabel aLabel, bLabel, resLabel;
	static JTextField aField, bField, resField;
	static JButton btn;

	public static void main(String[] args) {
                
                // frame
            
		frame = new JFrame("Simple Calculator");
		frame.setSize(300, 300);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                // labels and text fields
		
		aLabel = new JLabel("First Value:");
		aLabel.setBounds(20, 50, 120, 30);
		
		bLabel = new JLabel("Second Value:");
		bLabel.setBounds(20, 90, 120, 30);
		
		resLabel = new JLabel("Sum is:");
		resLabel.setBounds(20, 130, 120, 30);
		
		aField = new JTextField();
		aField.setBounds(140, 50, 140, 30);
		
		bField = new JTextField();
		bField.setBounds(140, 90, 140, 30);
		
		resField = new JTextField();
		resField.setBounds(140, 130, 140, 30);
		
                // button and action of button
                
		btn = new JButton("Calculate");
		btn.setBounds(140, 170, 100, 30);
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(aField.getText());
				int b = Integer.parseInt(bField.getText());
				int res = a + b;
				resField.setText(res + "");
			}
		});
		
		frame.add(aLabel);
		frame.add(bLabel);
		frame.add(resLabel);
		frame.add(aField);
		frame.add(bField);
		frame.add(resField);
		frame.add(btn);
	}

}
