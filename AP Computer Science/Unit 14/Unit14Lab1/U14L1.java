/**
 * 
 * @author Marie Dohnalová
 * This program sets up a GUI interface for a loan calculator.
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class U14L1 extends JFrame{
	
	JLabel rate, years, amount, payMonth, payTot;
	JTextField rateField, yearField, amountField, payMonthField, payTotField;
	JButton calcBtn;
	
	public U14L1(){
		super("Loan Calculator");
		this.setSize(400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		
		rate = new JLabel("Annual Interest Rate:");
		rate.setBounds(20, 20, 150, 30);
		
		rateField = new JTextField();
		rateField.setBounds(160, 20, 200, 30);
		
		years = new JLabel("Number of Years:");
		years.setBounds(20, 60, 150, 30);
		
		yearField = new JTextField();
		yearField.setBounds(160, 60, 200, 30);
		
		amount = new JLabel("Loan Amount:");
		amount.setBounds(20, 100, 150, 30);
		
		amountField = new JTextField();
		amountField.setBounds(160, 100, 200, 30);
		
		payMonth = new JLabel("Monthly Payment:");
		payMonth.setBounds(20, 140, 150, 30);
		
		payMonthField = new JTextField();
		payMonthField.setBounds(160, 140, 200, 30);
		
		payTot = new JLabel("Total Payment:");
		payTot.setBounds(20, 180, 150, 30);
		
		payTotField = new JTextField();
		payTotField.setBounds(160, 180, 200, 30);
		
		calcBtn = new JButton("Calculate");
		calcBtn.setBounds(260, 220, 100, 30);
		
		this.add(rate);
		this.add(rateField);
		this.add(years);
		this.add(yearField);
		this.add(amount);
		this.add(amountField);
		this.add(payMonth);
		this.add(payMonthField);
		this.add(payTot);
		this.add(payTotField);
		this.add(calcBtn);
	}

	public static void main(String[] args) {
		U14L1 frame = new U14L1();
	}

}
