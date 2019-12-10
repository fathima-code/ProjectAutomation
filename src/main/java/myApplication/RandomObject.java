package myApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RandomObject extends BasePage {
	@FindBy(xpath ="//a[@title='Women']")
	private WebElement WomenTag;

	@FindBy(xpath ="(//a[@title='Dresses'])[2]")
	private WebElement DressesTag;
    
	@FindBy(id= "newsletter-input")
	private WebElement setEmail;
	
	@FindBy(name="submitNewsletter")
	private WebElement Btnclick;
	
	@FindBy(xpath = "//*[@id=\"columns\"]/p")
	private WebElement txtsubscriptionmsg;
	
	public RandomObject() {
		PageFactory.initElements(driver, this);
	}
		
	public WebElement WomenTag()  {
		return WomenTag;
	}
		
	public WebElement DressesTag() {
		return DressesTag;
	}
	
	public void setEmailId(String name) 	{
		setText(setEmail,name);
	}
	
	public WebElement clickbtn() {
		return Btnclick;
	}
	
	public WebElement txtSubmsg() {
		return txtsubscriptionmsg;
	}
	}
	
	
	


