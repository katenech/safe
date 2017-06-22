package z2;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;

public class SafeCracker extends JFrame {
	JLabel n1, n2, n3;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JLabel resultLabel;
	
	String secretCode;
	String guessCode;

	int digitEnter;
	
	public SafeCracker() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 3, 0, 0));
		
		 n1 = new JLabel("x");
		panel.add(n1);
		
		 n2 = new JLabel("x");
		panel.add(n2);
		
		 n3 = new JLabel("x");
		panel.add(n3);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(3, 3, 0, 0));
		
		 b1 = new JButton("1");
		panel_1.add(b1);
		b1.addActionListener(new ButtonListener());
		
		 b2 = new JButton("2");
		panel_1.add(b2);
		b2.addActionListener(new ButtonListener());
		
		 b3 = new JButton("3");
		panel_1.add(b3);
		b3.addActionListener(new ButtonListener());
		
		 b4 = new JButton("4");
		panel_1.add(b4);
		b4.addActionListener(new ButtonListener());
		
		 b5 = new JButton("5");
		panel_1.add(b5);
		b5.addActionListener(new ButtonListener());
		
		 b6 = new JButton("6");
		panel_1.add(b6);
		b6.addActionListener(new ButtonListener());
		
		 b7 = new JButton("7");
		panel_1.add(b7);
		b7.addActionListener(new ButtonListener());
		
		 b8 = new JButton("8");
		panel_1.add(b8);
		b8.addActionListener(new ButtonListener());
		
		 b9 = new JButton("9");
		panel_1.add(b9);
		b9.addActionListener(new ButtonListener());
		
		 resultLabel = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:");
		getContentPane().add(resultLabel, BorderLayout.NORTH);
		// TODO Auto-generated constructor stub
		
		pack();
		setVisible(true);
		toCrack();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SafeCracker();
	}
	
	public void toCrack(){
		// рандом
		int[] numberMassiv = {1,2,3,4,5,6,7,8,9};
		int[] secretMassiv = new int[3];			
		for(int i=0; i<3; i++){
			int j=(int)(Math.random()*9);
			if(numberMassiv[j]!=0){
			secretMassiv[i]=numberMassiv[j];
			numberMassiv[j]=0;
			}else i--;
		}	
		secretCode=""+secretMassiv[0]+secretMassiv[1]+secretMassiv[2];
		System.out.println(secretCode);
		
		//
		
	}
	
	public class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// Получаем источник события - какая кнопка нажата?
			JButton clickedButton= (JButton)e.getSource();
			clickedButton.setEnabled(false);
			// сохраняем надпись на кнопке в переменную
			String number = clickedButton.getText();
			switch(digitEnter){
			case 0:
				n1.setText(number);
				break;
			case 1:
				n2.setText(number);
				break;
			case 2:
				n3.setText(number);
				break;
			}
			
			digitEnter++;
			if(digitEnter==3)digitEnter=0;
		}
		
	}

}
