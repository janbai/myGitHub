package functional;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


@SuppressWarnings("serial")

class MyFrame extends JFrame{
		
		private class onClickListener implements ActionListener {
			private int clicksCount;

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("click");
				String text = "Clicks: " + ++clicksCount;
				label.setText(text);
				button.setText("Click (" + clicksCount + ")");
			}
		}
		private JLabel label = new JLabel("Clicks: ");
		private JButton button = new JButton("Click");
		
		public MyFrame(){
			super("Clicks Counter");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		int x = 700;
		int y = 300;
		setLocation(x, y);
		
		int width = 500;
		int height = 200;
		setSize(width, height);
				
		add(label,BorderLayout.NORTH);
				
		add(button,BorderLayout.SOUTH);
		
		ActionListener onClick = new onClickListener();
		button.addActionListener(onClick);
		
	}
}


public class NichtstaticInnerClass {
	
	public static void main(String[] args) {
		
		JFrame frame = new MyFrame();
		frame.setVisible(true);
		System.out.println("end of main");
		
	}
}
