package myApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SizePageObjects extends BasePage {
	
@FindBy(xpath ="//a[text()='S']")
private WebElement sSize;

public SizePageObjects() {
	PageFactory.initElements(driver, this);
}
public WebElement getsSize() {
	return sSize;
}
}
