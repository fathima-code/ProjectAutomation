package myApplication;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RanTestPage {
	RandomObject rp;
	BasePage bp;
	int random = new Random().nextInt(50000);
	String email ="automation" +random +"@gmail.com";
	
	
	public RanTestPage() {
		rp = new RandomObject();
		bp = new BasePage ();
	}
	
	@Test 
	public void verifyWomenTag() {
		Assert.assertTrue(bp.elementFound(rp.WomenTag()), "Failed to display");
	}
	
	@Test
	public void verifyEmailId() {
		rp.setEmailId(email);
		rp.clickbtn().click();
		//System.out.println("email" +rp);
		String msg = rp.txtSubmsg().getText();
		Assert.assertTrue(msg.contains("successfully"), "Failed to display");
		System.out.println("dddd" +msg);
		
	}

}
