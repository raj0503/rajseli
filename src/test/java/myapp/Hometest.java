package myapp;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hometest {

	Homepage hp;
	BasePage bp;
	
	public Hometest() {
		hp = new Homepage();
		bp = new BasePage();
	}
	int value = new Random().nextInt(20000);
	String email = "princemaker" + value + "@gmail.com";


	@Test
	public void verifytabs() {
		Assert.assertTrue(hp.getwomen().isDisplayed());
		Assert.assertTrue(hp.getdress().isDisplayed());
		Assert.assertTrue(hp.getdress().isDisplayed());
	}

	@Test
	public void verfiynavigate() {
		hp.clickWomentab();
		Assert.assertTrue(bp.getTitlte().contains("Women"));
		bp.navigateBack();
		hp.clickDresstab();
		Assert.assertTrue(bp.getTitlte().contains("Dresses"));
		bp.navigateBack();
		hp.clickTshirttab();
		Assert.assertTrue(bp.getTitlte().contains("T-shirt"));
		bp.navigateBack();
	}

	@Test
	public void verifyNewsLetter() {
		hp.TextNewsLetter(email);
		Assert.assertTrue(hp.getSubscribedTxt().contains("successfully"));
	}
}