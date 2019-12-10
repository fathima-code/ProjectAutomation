package myApplication;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsObjects extends BasePage {
@FindBy (xpath = "//*[@class ='heading-counter']")
private WebElement txtProductHeaderCount;


@FindBys(@FindBy(xpath = "//*[@class='product_list grid row']/1i"))
private List<WebElement> firstProduct;

public ProductDetailsObjects() {
	PageFactory.initElements(driver, this);
}

public int getProductCount() {
	return firstProduct.size();
}

public int getProdectHeaderCount() {
	return Integer.parseInt(txtProductHeaderCount.getText().split(" ")[2]);
	
}





}


