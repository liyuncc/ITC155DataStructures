package ch3G;
import java.awt.*;

public class MickeyBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a drawing panel with yellow background
		DrawingPanel panel = new DrawingPanel(220, 150);
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();		
		
		//draw the left circle
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		
		//draw the right circle
		g.setColor(Color.BLUE);
		g.fillOval(130, 25, 40, 40);
		
		//draw the box
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		//draw the black line
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);

	}
	
	
}
