package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	//this is homepage class
	//adding second commit through the branch
	
	

	@FindBy(xpath = "//*[ @id='branding']//a[@id='welcome']")
	private WebElement link;

	@FindBy(xpath = "//*[@id='welcome-menu']/ul/li[3]//a[text()='Logout']")
	private WebElement logoutLink;


	public HomePageClass(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public WebElement getProfileLinkElement() {

		return link;
	}

	public WebElement getLogoutLink() {

		return logoutLink;
	}




}
