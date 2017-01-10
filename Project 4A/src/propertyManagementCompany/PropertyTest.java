package propertyManagementCompany;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PropertyTest {
	
	Property p1,p2,p3,p4,p5;
	ManagementCompany m;
	
	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testGetName() {
		p1 = new Property ("Belmar", "Silver Spring", 1200, "John Smith");
		String name = p1.getName();
		assertEquals("Belmar", name);
	}


	@Test
	public void testGetCity() {
		p2 = new Property ("Camden Lakeway", "Rockville", 5000, "Ann Taylor");
		String city = p2.getCity();
		assertEquals("Silver Spring", city);
	}

	@Test
	public void testGetOwner() {
		p3 = new Property ("Hamptons", "Rockville", 1250, "Rick Steves");
		String owner = p3.getOwner();
		assertEquals("Rick Steves", owner);
	}


}
