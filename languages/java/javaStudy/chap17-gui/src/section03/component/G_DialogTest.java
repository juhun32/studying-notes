package section03.component;


import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class G_DialogTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setSize(500, 500);
		
		JPanel panel = new JPanel();
		JButton button1 = new JButton("simple dialog");
		
		Dialog sd = new Dialog(mf, "simple dialog");
		sd.setBounds(150, 250, 150, 150);
		
		JButton button2 = new JButton("close");
		sd.add(button2);
		
		JButton button3 = new JButton("input dialog");
		panel.add(button3);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				sd.setVisible(true);
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				sd.dispose();
			}
		});
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String input = JOptionPane.showInputDialog(" Էϼ");
				System.out.println(input);
			}
		});
		
		panel.add(button1);
		
		mf.add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
