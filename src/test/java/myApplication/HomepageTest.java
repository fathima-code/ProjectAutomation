package myApplication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest {
	
	BasePage bp;
	Homepage hb;
	
	public HomepageTest() {
		bp= new BasePage();
		hb= new Homepage();
		
	}
@Test 
public void verifyWomenTag() {
	Assert.assertTrue(bp.elementFound(hb.getWomenTag()), "Filed to display");	
}

@Test 
public void verifyDressesTag() {
	Assert.assertTrue(bp.elementFound(hb.getDressesTag()), "Filed to display aa");	
}
@Test 
public void verifyTshirtsTag() {
	Assert.assertTrue(bp.elementFound(hb.getTshirtsTag()), "Filed to display ss");	
}

}

