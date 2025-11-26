import java.awt.event.*;
import java.awt.*;
class Lab7P2 implements ActionListener{
	Frame f = new Frame();
	FlowLayout fl= new FlowLayout();
	TextField tf = new TextField(20);
	Button b = new Button("Click");
	Label l = new Label();
	int a=1;
	Lab7P2(){
		f.setSize(500,500);		
		f.setLayout(fl);				
		b.setSize(20,40);		
		l.setPreferredSize(new Dimension(20,40));
		f.add(b);
		f.add(tf);
		f.add(l);
		f.setVisible(true);
		b.addActionListener(this);
		f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we){
					f.dispose();
				}
		});
		}
		public static void main(String...args){
		Lab7P2 p = new Lab7P2();
		}
			public void actionPerformed(ActionEvent ae){
				System.out.println("Hello");
				l.setText(tf.getText()+"_"+ a);
				a++;
				}
				}
