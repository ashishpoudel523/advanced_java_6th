package class_codes;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawShapes extends JFrame {

	public DrawShapes() {

		setSize(new Dimension(300, 300));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JPanel p = new JPanel() {
			
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				
				Shape line = new Line2D.Double(3, 3, 303, 303);
				Shape rect = new Rectangle(3, 3, 303, 303);
				
				Shape circle = new Ellipse2D.Double(100, 100, 100, 100);
				Shape roundRect = new RoundRectangle2D.Double(20, 20, 250, 250, 5, 25);
				g2.draw(line);
				g2.draw(rect);
				g2.draw(circle);
				g2.draw(roundRect);
			}
		};
		setTitle("My Shapes");
		this.getContentPane().add(p);
	}

	public static void main(String arg[]) {
		new DrawShapes();
	}

}