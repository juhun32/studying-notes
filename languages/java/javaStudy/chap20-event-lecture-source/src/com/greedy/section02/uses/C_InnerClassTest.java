package com.greedy.section02.uses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_InnerClassTest extends JFrame{
	
	/* 내부클래스를 이용한 이벤트 처리 */
	private JButton button;
	private JLabel label;
	
	public C_InnerClassTest() {
		this.setSize(300, 200);
		
		this.setTitle("내부클래스 예제");
		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		button.addActionListener(new MyEvent());
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/* 내부 클래스 사용
	 * 필드에 직접 접근 가능함
	 * */
	private class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("드디어 버튼이 눌러졌습니다.");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new C_InnerClassTest();

	}

}
