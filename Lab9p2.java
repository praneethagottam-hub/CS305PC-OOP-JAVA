import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab9p2 extends JFrame{
Label l;
Lab9p2(){
		super("JTable Demo");
		String[] heading = {"Name","Course","Rollno"};
		String[][] data ={
				{"Annie","CSE","1234"},
				{"Dolly","CSM","5678"},
				{"Belly","CSD","9012"},
				{"Conrad","CSO","8976"},
				};
		JTable jt = new JTable(data,heading);
		add(jt);
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String...args){
	new Lab9p2();
	}
    }
