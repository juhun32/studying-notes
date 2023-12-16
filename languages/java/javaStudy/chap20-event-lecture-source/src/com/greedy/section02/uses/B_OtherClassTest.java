package com.greedy.section02.uses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_OtherClassTest extends JFrame{
	
	private JButton button;
	private JLabel label;
	
	public B_OtherClassTest() {
		this.setSize(300, 200);
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		/* 필드에 접근을 못하기 때문에 생성자 혹은 메소드쪽으로 전달하여 처리 */
		button.addActionListener(new MyEvent(button, label));
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

class MyEvent implements ActionListener{
	private JButton button;
	private JLabel label;
	
	public MyEvent(JButton button, JLabel label) {
		this.button = button;
		button.addActionListener(this);
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			label.setText("드디어 버튼이 눌러졌습니다.");
		}
	}
	
}


