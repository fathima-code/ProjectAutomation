package myApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;	
import org.openqa.selenium.support.PageFactory;

	public class womensubpage extends BasePage{
@FindBy(xpath ="//a[@title='Women']")
private WebElement ClickWomen;

@FindBy(xpath ="(//a[@title='Dresses'])[2]")
private WebElement ClickDresses;

@FindBy(xpath ="(//*[@id=\"block_top_menu\"]/ul/li[3]/a")
private WebElement ClickTshirts;

@FindBy (id ="newsletter-input")
private WebElement  txtBoxNewsLetter;

@FindBy (name = "submitNewsletter")
private WebElement btnSubmitNewsletter;

@FindBy (xpath = "//*[@class='alert alert-success']")
private WebElement txtSubscription;

		
public womensubpage() {
	PageFactory.initElements(driver, this);
}
public WebElement getclickWomen() {
	return ClickWomen;
	
}
public WebElement getclickDresses() {
	return ClickDresses;
}
public WebElement getclickTshirts() {
	return ClickTshirts;
}
public void  WebElement (String email) {
	setText(txtBoxNewsLetter,email);
	btnSubmitNewsletter.click();
}
public String getMessage() {
	return txtSubscription.getText();
}	
}
	


