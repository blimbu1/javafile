
import java.awt.*;
import java.awt.event.*;

public class windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame win = new Frame();
		TextField ti = new TextField();
		Button bi = new Button("click");
		Event2 e = new Event2(ti);
		bi.addActionListener(e);
		win.add(ti,BorderLayout.NORTH);
		win.add(bi,BorderLayout.CENTER);
		win.setSize(300,500);
		win.setVisible(true);

	}

}

class Event2 implements ActionListener{
	TextField x;
	public Event2(TextField t){
		x = t;
	}
	public void actionPerformed(ActionEvent t){
		x.setText("hello");
	}
}

