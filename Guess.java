package z2;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Guess extends JFrame{
	private JTextField textField;
	JButton button;
	JLabel resultLabel;
	int number;

	public Guess() {
		setTitle("\u0418\u0433\u0440\u0430");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		number=(int)(Math.random()*100+1);
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("\u0418\u0433\u0440\u0430 \"\u0423\u0433\u0430\u0434\u0430\u0439 \u0447\u0438\u0441\u043B\u043E\" \u043E\u0442 1 \u0434\u043E 100");
		getContentPane().add(label, BorderLayout.NORTH);
		
		textField = new JTextField();
		getContentPane().add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		button = new JButton("\u041F\u0440\u043E\u0432\u0435\u0440\u0438\u0442\u044C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guess();
			}
		});
		getContentPane().add(button, BorderLayout.EAST);
		
		resultLabel = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:");
		getContentPane().add(resultLabel, BorderLayout.SOUTH);

		pack();
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Guess();
	}
	
	public void guess(){
		String text=textField.getText();
		int guessNumber=Integer.parseInt(text);
		
		if(guessNumber<number)
		{
		resultLabel.setText("слишком маленькое число");
		}
		if(guessNumber>number)
		{
			resultLabel.setText("слишком большое число");
			}
		if(guessNumber==number)
		{		
		resultLabel.setText("Ура, победа!");
			}
	}

}
