package section02.layout;

import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F_PanelLayout extends JFrame{

	public F_PanelLayout() throws HeadlessException {
		super("JPanelLayout");
		
		this.setBounds(200,200,500,500);
		
		JLabel lb = new JLabel(" : ");
		lb.setLocation(50,100);
		lb.setSize(150,50);
		
		
		JTextField tf = new JTextField("hghg");
		tf.setLocation(110,100);
		tf.setSize(200,50);
		
		JButton btn = new JButton(" 버튼 ");
		btn.setLocation(350, 100);
		btn.setSize(100,50);
		
		JPanel panel = new JPanel();
		panel.setSize(500,500);
		
		panel.setLayout(null);
		
		panel.add(lb);
		panel.add(tf);
		panel.add(btn);
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
	}
	
	

}
