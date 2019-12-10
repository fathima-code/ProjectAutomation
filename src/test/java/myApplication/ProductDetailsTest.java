package myApplication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductDetailsTest {
	
	BasePage bp;
	Homepage hp;
	ProductDetailsObjects pp;
	
	public ProductDetailsTest() {
		hp = new Homepage();
		bp = new BasePage();
		pp = new ProductDetailsObjects();
		
	}
	@Test
	public void verifyProductCount() {
		hp.getWomenTag().click();
		System.out.println(pp.getProdectHeaderCount());
		System.out.println(pp.getProductCount());
		Assert.assertTrue(pp.getProductCount()==pp.getProdectHeaderCount(),"Failed to count");	
		//System.out.println(pp.getProdectHeaderCount());
		//System.out.println(pp.getProductCount());
		
	}
}
