package seanNate.TestDungeon;

import java.awt.*;
import javax.swing.*;

public class DungeonGui extends JFrame {
	
	JPanel textWindow;
	JTextArea dungeonArea;
	String title = "Simple Dungeon";
	
	public DungeonGui(int width, int height) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textWindow = new JPanel();
		dungeonArea = new JTextArea(height,width);
		dungeonArea.setEditable(false);
		textWindow.add(dungeonArea);
		add(textWindow);
		setVisible(true);
		pack();
	}
	
	public void update(String s) {
		dungeonArea.setText(s);
	}

}
