package myApplication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class womensubpageTest {

	BasePage bp;
	Homepage hp;
	womensubpage wp;
	public womensubpageTest() {
		bp= new BasePage();
		hp= new Homepage();
	}
	@Test 
	public void verifyclickWomen() {
		 hp.getWomenTag().click();
		 String a= hp.getTitlte();
		 Assert.assertTrue(a.contains("Women"),"Failed to display Women");
		 System.out.println("dddddddd" +a );
	}

    @Test
    public void verifyclickDresses() {
    hp.getDressesTag().click();
    String b = hp.getTitlte();
    Assert.assertTrue(b.contains("Dresses"), "Failed to display Dresses");
    }
    
    @Test
    public void verifyclickTshirts() {
    	hp.getTshirtsTag().click();
    	String c = hp.getTitlte();
    	Assert.assertTrue(c.contains("T-shirts"),"Failed to display Tshirts");
    }
    @Test
    public void verifyMessage() {
    	wp.WebElement("fathima.hcl@gmail.com");
    	String msg =wp.getMessage();
    	Assert.assertTrue(msg.contains("successfully"), "Failed to display");
    	
    }
    }

	
