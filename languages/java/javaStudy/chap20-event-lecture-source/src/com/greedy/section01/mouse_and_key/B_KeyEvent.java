package com.greedy.section01.mouse_and_key;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class B_KeyEvent extends JFrame implements KeyListener {
	
	public B_KeyEvent() {
		this.setTitle("이벤트 예제");
		this.setSize(300, 200);

		JTextField tf = new JTextField(20);
		tf.addKeyListener(this);

		this.add(tf);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	/* 한글안됨 */
	@Override
	public void keyTyped(KeyEvent e) {
		this.display("KeyTyped ", e);
		
	}
	
	/* 한글됨 */
	@Override
	public void keyPressed(KeyEvent e) {
		this.display("KeyPressed ", e);
		
	}
	
	/* 한글안됨 */
	@Override
	public void keyReleased(KeyEvent e) {
		this.display("Key Released ", e);
		
	}
	
	public void display(String s, KeyEvent e) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		/* 컨트롤 쉬프트 알트에 대한 처리 */
		String modifiers = e.isAltDown() + " " + e.isControlDown() + " "
				+ e.isShiftDown();
		System.out.println(s + " " + c + " " + keyCode + " " + modifiers);
	}

	public static void main(String[] args) {
		new B_KeyEvent();
		
	}
}
