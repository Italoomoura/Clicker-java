import java.awt.*;
import javax.swing.*;

public class GUI {
	
	static int contador = 0;
	static JLabel label;
	
	public static void main(String[] args) {
	
		JFrame frame = new JFrame("Click");
		frame.setSize(300, 300);
		
		JPanel panel = new JPanel();
		panel.setSize(200, 300);
		panel.setLayout(new GridLayout(0, 1));
		
		JPanel panel2 = new JPanel();
		panel2.setSize(200,300);
		panel2.setLayout(new GridBagLayout());
		
		label = new JLabel("Clicks: 0");
		JButton button = new JButton("Click Aqui!");
		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				click();
			}
		});
		
		panel2.add(label);
		panel.add(panel2);
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
	}
	
	public static void click() {
		contador++;
		label.setText("Clicks: "+contador);
	}

}