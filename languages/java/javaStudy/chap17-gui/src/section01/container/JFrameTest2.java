package section01.container;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest2 {

	public void showMainFrame() {
		JFrame mainFrame = new JFrame("MyFrame2");
		mainFrame.setBounds(300,200,800, 500);
		try {
			mainFrame.setIconImage(ImageIO.read(new File("images/cat.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
