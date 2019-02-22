package myapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

	public static WebDriver driver;
	public String browser = "chrome";

	public BasePage() {
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Raj\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.get(" http://automationpractice.com/index.php");
			}

		}
		
	}

	public String getTitlte() {
		return driver.getTitle();
	}	

	public void navigateBack() {
		driver.navigate().back();
	}
		public boolean elementFound(WebElement element) {
			boolean res = false;
			try {
				res = element.isDisplayed();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return res;
		}
		
		public void setTextNewsLetter(WebElement NewsLetter , String email) {
			if (email != null) {
				NewsLetter.click();
				NewsLetter.clear();
				NewsLetter.sendKeys(email);
				NewsLetter.sendKeys(Keys.ENTER);
			}
		}
		
		public boolean isElementVisible(WebElement element) {
			try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
			} catch (Exception e) {
			return false;
			}
			}

	}