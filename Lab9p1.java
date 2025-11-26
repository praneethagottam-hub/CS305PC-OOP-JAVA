import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab9p1 extends JFrame{
Label l;

	Lab9p1(){
		super("Tabbed Pane Demo");
		JTabbedPane jtp = new JTabbedPane();
	        jtp.addTab("Tab1" ,new Label("TabbedPane 1"));
	        jtp.addTab("Tab2" ,new Label("TabbedPane 2"));
	        jtp.addTab("Tab3" ,new Label("TabbedPane 3"));
		
		add(jtp);
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String...args){
	new Lab9p1();
	}
    }
