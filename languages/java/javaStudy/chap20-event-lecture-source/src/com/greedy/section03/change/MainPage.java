package com.greedy.section03.change;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MainPage extends JPanel{
	
	private MainFrame mf;
	private JPanel mainPage;
	
	public MainPage(MainFrame mf){
		this.mf = mf;
		this.mainPage = this;
		
		this.setSize(300,200);
		this.setBackground(Color.BLUE);
		
		this.addMouseListener(new MyMouseAdapter());
		
		mf.add(this);
	}
	
	class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e){
			//이벤트 처리 내용 작성
			ChangePanel.changePanel(mf, mainPage, new SubPage());
		}
	}

}









