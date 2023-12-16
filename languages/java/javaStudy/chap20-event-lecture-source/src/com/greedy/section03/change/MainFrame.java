package com.greedy.section03.change;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame(){
		this.setSize(300, 200);
		
		new MainPage(this);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
