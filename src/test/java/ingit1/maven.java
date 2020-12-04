package ingit1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class maven {

	@Test
	public void test() {
	     myclass ob = new myclass();
	     assertEquals(28, ob.multiply(7, 4));
	}

}
