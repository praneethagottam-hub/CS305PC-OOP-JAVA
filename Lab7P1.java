import java.awt.event.*;
import java.awt.*;
class Lab7P1{
	public static void main(String...args){
		final int[] a = {1};
		Frame f = new Frame();
		f.setSize(500,500);
		FlowLayout fl= new FlowLayout();
		f.setLayout(fl);
		TextField tf = new TextField(20);
		Button b = new Button("Click");
		b.setSize(20,40);
		Label l = new Label();
		l.setPreferredSize(new Dimension(20,40));
		f.add(b);
		f.add(tf);
		f.add(l);
		f.setVisible(true);
		b.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae){
				System.out.println("Hello");
				l.setText(tf.getText()+"_"+ a[0]);
				a[0]++;
				}
			});
			f.addWindowListener(new WindowAdapter(){
				@Override
				public void windowClosing(WindowEvent we){
					f.dispose();
				}			
			});
		}
	}

