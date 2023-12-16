package section01.container;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFremeTest1 extends JFrame{
	
	public JFremeTest1() {
		this.setBounds(300, 200, 800, 500);
		this.setTitle("MyFrame");
		
		try {
			this.setIconImage(ImageIO.read(new File("images/cat.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setResizable(false);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
