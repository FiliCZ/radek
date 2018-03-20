import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Okno extends JFrame {
	private JLabel label1;
	private JTextField field1;
	private JLabel label2;
	private JTextField field2;
    private JButton button;
    
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
}
}
