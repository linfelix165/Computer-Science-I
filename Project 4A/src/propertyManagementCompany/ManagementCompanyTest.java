package propertyManagementCompany;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTest {
	Property p1,p2,p3,p4,p5;
	ManagementCompany m;

	@Before
	public void setUp() throws Exception {
		p1 = new Property ("Belmar", "Silver Spring", 1200, "John Smith");
		p2 = new Property ("Camden Lakeway", "Rockville", 5000, "Ann Taylor");
		p3 = new Property ("Hamptons", "Rockville", 1250, "Rick Steves");
		p4 = new Property ("Mallory Square", "Wheaton", 1000, "Abbey McDonald");
		p5 = new Property ("Lakewood", "Rockville", 3000, "Alex Tan");
		
		m = new ManagementCompany("Alliance", "1235",6);
		
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
	}

	@After
	public void tearDown() throws Exception {
		p1 = p2 = p3 = null;
		m = null;
	}

	@Test
	public void testAddProperty() {
		 
		 assertTrue(m.addProperty(p5),4,0);
		 assertTrue(m.addProperty(p4),3,0);
		 assertTrue(m.addProperty(p1),1,0);
	}

	private void assertTrue(int addProperty, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testDisplayPropertyAtIndex() {
		assertEquals(m.maxPropertyRentIndex(),1,0);
	}

	@Test
	public void testTotalRent() {
		assertTrue(m.totalRent());
	}

	private void assertTrue(double totalRent) {
		// TODO Auto-generated method stub
		
	}

}
