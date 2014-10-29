package google;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointClassTest {

	@Test
	public void test() {
		PointClass p1 = new PointClass(1,2);
		PointClass p2 = new PointClass(1,2);
		PointClass p3 = new PointClass(2,3);
		assertTrue("p1==p2",p1.equals(p2));
		assertFalse("p1!=p3",p1.equals(p3));
		assertFalse("p2!=p3",p2.equals(p3));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	}

}
