package myapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[1]/a")
	private WebElement women;

	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[2]/a")
	private WebElement dress;

	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[3]/a")
	private WebElement tshirt;

	@FindBy(id = "newsletter-input")
	private WebElement NewsLetter;

	@FindBy(xpath = "//*[@class='alert alert-success']")
	private WebElement SubscribedTxt;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getwomen() {
		return women;
	}

	public WebElement getdress() {
		return dress;
	}

	public WebElement gettshirt() {
		return tshirt;
	}

	public void clickWomentab() {
		women.click();
	}

	public void clickDresstab() {
		dress.click();
	}

	public void clickTshirttab() {
		tshirt.click();
	}

	public String getSubscribedTxt() {
		return SubscribedTxt.getText();

	}

	public void TextNewsLetter(String email) {
		setTextNewsLetter(NewsLetter, email);
	}
}