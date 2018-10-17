package clock;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.Icon;
import java.util.GregorianCalendar;
public class ClockIcon implements Icon {

	private int rotationAngle;
	public ClockIcon(int aSize) {
		size = aSize;
	}
	
	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, size, size);
	
		g2.draw(circle);
		
		Point2D.Double start = new Point2D.Double(size/2, size/2 );
		Point2D.Double end = new Point2D.Double(size/2, 0);
		Line2D hour = new Line2D.Double(start, end);
		int hours = GregorianCalendar.HOUR;
		g2.rotate(Math.toRadians(360/12 * (hours + 1)), size/2, size/2);
		g2.draw(hour);
		
		Point2D.Double startMinute = new Point2D.Double(size/2, size/2 );
		Point2D.Double endMinute = new Point2D.Double(size/2, size/8);
		Line2D minute = new Line2D.Double(startMinute, endMinute);
		g2.setColor(Color.BLUE);
		int minutes = GregorianCalendar.MINUTE;
		g2.rotate(Math.toRadians(360/60 * minutes), size/2, size/2);
		g2.draw(minute);
		
		Point2D.Double startSecond = new Point2D.Double(size/2, size/2 );
		Point2D.Double endSecond = new Point2D.Double(size/2, size/9);
		Line2D second = new Line2D.Double(startSecond, endSecond);
		g2.setColor(Color.RED);
		int seconds = GregorianCalendar.SECOND;
		g2.rotate(Math.toRadians(360/60 * seconds), size/2, size/2);
		g2.draw(second);
		
		
	}

	private int size;
}
