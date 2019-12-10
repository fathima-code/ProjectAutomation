package myApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage{
@FindBy (xpath="//a[@title='Women']")
private WebElement WomenTag;

@FindBy (xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
private WebElement DressesTag;

@FindBy (xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
private WebElement TshirtsTag;

@FindBy (id ="newsletter-input")
private WebElement  txtBoxNewsLetter;

@FindBy (name = "submitNewsletter")
private WebElement btnSubmitNewsletter;

@FindBy (xpath = "//*[@class='alert alert-success']")
private WebElement txtSubscription;

public Homepage() {
	PageFactory.initElements(driver, this);
}

public WebElement getWomenTag() {
	return WomenTag;
}
public WebElement getDressesTag() {
	return DressesTag;
}
public WebElement getTshirtsTag() {
	return TshirtsTag;
}
public void  WebElement (String email) {
	setText(txtBoxNewsLetter,email);
	btnSubmitNewsletter.click();
}
public String getMessage() {
	return txtSubscription.getText();
}	


}

