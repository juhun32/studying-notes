package com.greedy.section01.mouse_and_key;

//package com.greedy.section01.mouse_and_key;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class A_MouseEvent extends JFrame implements MouseListener, MouseMotionListener {
	
	public A_MouseEvent() {
		
		this.setTitle("Mouse Event");
		this.setSize(300, 200);

		JPanel panel = new JPanel();
		
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		this.display("Mouse pressed (# of clicks : " + e.getClickCount() + ")", e);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.display("Mouse relesed (# of clicks : " + e.getClickCount() + ")", e);
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		this.display("Mouse entered", e);
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		this.display("Mouse exited", e);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		this.display("Mouse clicked (# of clicks: " + e.getClickCount() + ")", e);
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		this.display("Mouse dragged", e);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.display("Mouse moved", e);
		
	}

	public void display(String s, MouseEvent e) {
		System.out.println(s + " X = " + e.getX() + " y = " + e.getY());
	}

	public static void main(String[] args) {
		
		new A_MouseEvent();
	}
}
