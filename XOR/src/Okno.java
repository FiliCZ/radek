import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Okno extends JFrame {
	private JLabel label1;
	private JTextField field1;
	private JLabel label2;
	private JTextField field2;
    private Button button;
    
	public Okno() {
		this.setTitle("XOR");
		this.setSize(200, 200);
		this.setLayout(new FlowLayout());
		label1 = new JLabel("Cesta k souboru");
		this.add(label1);
		field1 = new JTextField(100);
		this.add(field1);
		label2 = new JLabel("Heslo");
		this.add(label2);
		field2 = new JTextField(30);
		this.add(field2);
		button = new Button("OK");
		this.add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int x = Integer.valueOf(field1.getText()); x++;
				field1.getText();
			}
		});
	}
}
