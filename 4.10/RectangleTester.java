package rectangle;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Collections;

public class RectangleTester {

	public static void main(String[] args)
	{
		ArrayList<Rectangle2D.Double> rect = new ArrayList<>();
		rect.add(new Rectangle2D.Double(123, 321, 300, 300));
		rect.add(new Rectangle2D.Double(25, 50, 20, 20));
		rect.add(new Rectangle2D.Double(300, 300, 123, 321));
		rect.add(new Rectangle2D.Double(3, 3, 3, 3));
		rect.add(new Rectangle2D.Double(123, 97, 60, 30));
		rect.add(new Rectangle2D.Double(123, 321, 300, 300));
		rect.add(new Rectangle2D.Double(69, 96, 100, 100));
		rect.add(new Rectangle2D.Double(123, 321, 200, 100));
		
		
		RectangleComparator comp = new RectangleComparator();
		Collections.sort(rect, comp);
		for(Rectangle2D.Double r: rect)
		{
			System.out.println(r.getX()+" "+r.getY()+" "+r.getWidth()+" "+r.getHeight());
		}
	}
}
