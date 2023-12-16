package com.greedy.section02.uses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_MethodTest extends JFrame implements ActionListener{
	
	private JButton button;
	private JLabel label;
	
	public D_MethodTest() {
		
		this.setSize(300, 200);
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		button.addActionListener(this);
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	/* 상속받아 오버라이딩하여 처리 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			label.setText("드디어 버튼이 눌려졌습니다.");
		}
		
	}

	public static void main(String[] args) {
		new D_MethodTest();
	}
}
