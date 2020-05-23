package fr.uvsq.pglp_9_9;


import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Stack;

/**
 * Unit test for simple App.
 */
public class AppTest
{

	@Test
	public void carre() {
		Point p = new Point(10,10);
		Carre c = new Carre(p,"c1",10);
		
		Point pTransi = new Point(11,11);
		c.deplace(pTransi);
		
		assertTrue(c.getSize() == 10);
	}
	
	@Test
	public void rectangle() {
		Point p = new Point(10,10);
		Rectangle r = new Rectangle(p,"r1",10,5);
		
		Point pTransi = new Point(11,11);
		r.deplace(pTransi);
		
		int sizeL = r.getSizeL();
		int sizeH = r.getSizeH();
		
		assertTrue(sizeL-5 == sizeH);
	}
	
	@Test
	public void Triangle() {
		Point p = new Point(10,10);
		Triangle t = new Triangle(p,"t1",10);
		
		Point pTransi = new Point(11,11);
		t.deplace(pTransi);
		
		assertTrue(t.getSize() == 10);
	}
	
	@Test
	public void Cercle() {
		Point p = new Point(10,10);
		Cercle c = new Cercle(p,"c1",10);
		
		Point pTransi = new Point(11,11);
		c.deplace(pTransi);
		
		assertTrue(c.getRayon() == 10);
	}
	
}
