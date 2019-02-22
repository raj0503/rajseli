package myapp;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressPage extends BasePage {

	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[2]/a")
	private WebElement dresstab;
	@FindBy(xpath = "//*[@for='layered_id_attribute_group_1']")
	private WebElement sizeSmall;
	@FindBy(xpath = "//*[@for='layered_id_attribute_group_2']")
	private WebElement sizeMedium;
	@FindBy(xpath = "//*[@for='layered_id_attribute_group_3']")
	private WebElement sizeLarge;
	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement txtHeader;
	@FindBys(@FindBy(xpath = "//*[@class='product_list grid row']/li"))
	private List<WebElement> lstProduct;
	@FindBy(id = "layer_cart_product_title")
	private WebElement successTxt;
	@FindBy(xpath = "//*[@class='product_list grid row']/li[1]//span[text()='Add to cart']")
	private WebElement addCart;
	@FindBy(xpath = "//*[@class='product_list grid row']/li[1]")
	private WebElement hover;
	@FindBy(xpath = "//*[@class='cross']")
	private WebElement cross;
	@FindBy(xpath = "//*[@title='View my shopping cart']")
	private WebElement carthover;
	@FindBy(xpath = "//*[@alt='Printed Dress']")
	private WebElement product;

	public DressPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickDressTab() {
		dresstab.click();
	}

	public WebElement sizeS() {
		return sizeSmall;
	}

	public WebElement sizeM() {
		return sizeMedium;
	}

	public WebElement sizeL() {
		return sizeLarge;
	}

	public List<WebElement> listOfProduct() {
		return lstProduct;
	}

	public WebElement txtOnHeader() {
		return txtHeader;
	}

	public int listofProduct() {
		return lstProduct.size();
	}

	public int getCountFromHeader() {

		/*
		 * String txt = txtHeader.getText(); String[] arr = txt.split(" "); txt
		 * = arr[2]; int number = Integer.parseInt(txt); return number;
		 */

		return Integer.parseInt(txtHeader.getText().split(" ")[2]);

	}

	public String verfiySuccessTxt() {
		isElementVisible(successTxt);
		return successTxt.getText();
	}

	Actions ac = new Actions(driver);

	public void clickAddCart() {
		ac.moveToElement(hover).build().perform();
		addCart.click();
	}
	public void clickcross() {
		ac.moveToElement(cross).build().perform();
		cross.click();
	}
	public void hoverAddtoCart() {
		ac.moveToElement(carthover).build().perform();
		product.click();
	}
}