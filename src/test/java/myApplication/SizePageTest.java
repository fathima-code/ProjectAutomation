package myApplication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SizePageTest {
	 BasePage bp;
	 Homepage hp;
	 SizePageObjects sp;
	
	 public SizePageTest() {
		 bp= new BasePage();
		 hp = new Homepage();
		 sp= new SizePageObjects();
	 }
	 
	@Test
	public void verifysSize() {
		hp.getTshirtsTag().click();
        Assert.assertTrue(bp.elementFound(sp.getsSize()), "Failed");
	}
		 
	 }


