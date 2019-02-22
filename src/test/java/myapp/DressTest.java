package myapp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DressTest  {
	DressPage dp;
	BasePage bp;

	public DressTest() {
		dp = new DressPage();
		bp = new BasePage();

	}
	@Test
	public void verifySizes(){
		dp.clickDressTab();
		Assert.assertTrue(dp.sizeS().isDisplayed());
		Assert.assertTrue(dp.sizeL().isDisplayed());
		Assert.assertTrue(dp.sizeM().isDisplayed());
		bp.navigateBack();
	}
	@Test
	public void matchCount(){
		dp.clickDressTab();
		Assert.assertEquals(dp.getCountFromHeader(), dp.listofProduct());
		dp.navigateBack();
	}
	@Test
	public void addToCartVerify(){
		dp.clickDressTab();
		dp.clickAddCart();
		Assert.assertTrue(dp.verfiySuccessTxt().contains("Printed"));
		dp.navigateBack();
		
	}
	}
