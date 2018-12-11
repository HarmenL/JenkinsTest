
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest
{
	@Test
    public void testMyNameHarmen() {
        Name myName = new Name("Harmen");
	    assertEquals(myName.WhatIsMyName(), "Harmen");
    }
	
    @Test
    public void testMyNameJaap() {
        Name myName = new Name("Jaap");
        assertEquals(myName.WhatIsMyName(), "Jaap");
    }
}
