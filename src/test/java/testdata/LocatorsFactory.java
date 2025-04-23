package testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.StartupPage;

public class LocatorsFactory extends StartupPage {
		By shopIconButton = By.xpath("//a[.='Shop']"); 
		By androidProductCategory = By.xpath("//a[.='Android']"); 
		By newArrivalButton = By.xpath("//h2[.='new arrivals']"); 
		By seleniumRubyProduct = By.xpath("//h3[contains(text(),'Selenium Ruby')]/../../../..//a[@class='woocommerce-LoopProduct-link']"); 
		By seleniumRubyTitle = By.xpath("//h1[.='Selenium Ruby']"); 
		By viewBasketButton = By.xpath("//a[.='View Basket']"); 
		By applyCouponcodeButton = By.xpath("//input[@name='apply_coupon']"); 
		By proceedToCheckoutButton= By.xpath("//a[contains(text(),'	Proceed to Checkout')]/../..//div[@class='wc-proceed-to-checkout']"); 
		By seleniumRubyInsideTheBasketPage = By.xpath("//a[.='Selenium Ruby']/../..//td[@class='product-name']"); 
		By removeMessage= By.xpath("//div[@class='woocommerce-message']"); 
		By increasedProductInCart= By.xpath("//span[.='1 item']"); 
		By loginButton= By.xpath("//input[@name=\"login\"]"); 
		By testCasesIcon=By.xpath("//a[.='Test Cases']");
		By filterByPriceSlider=By.xpath("//h4[.='Filter by price']");
		By toolsIcon=By.xpath("//a[.='Tools']");
		By productTotalPrice=By.xpath("(//td[@data-title=\"Total\"])[1]");
		By checkTheQuantity=By.xpath("//div[@class=\"quantity\"]");
		By seleniumRubyProductPrice=By.xpath("(//span[@class=\"woocommerce-Price-amount amount\"])[1]/..");
		By taxAmount=By.xpath("//td[@data-title=\"Tax\"]");	


		 
		public LocatorsFactory(WebDriver driver) {
			super(driver);
		}
		


		public WebElement getShopIconOption(WebDriver driver) {
			WebElement shopIconButtonWebElement = driver.findElement(shopIconButton);
	        return shopIconButtonWebElement;
	    }
		
		public WebElement androidProductCategoryIsPresent(WebDriver driver) {
			WebElement androidProductCategoryWebElement = driver.findElement(androidProductCategory);
	        return androidProductCategoryWebElement;
	    }
		public WebElement newArrivalButtonIsPresent(WebDriver driver) {
			WebElement newArrivalButtonWebElement = driver.findElement(newArrivalButton);
	        return newArrivalButtonWebElement;
	    }
		public WebElement seleniumRubyProductIsPresent(WebDriver driver) {
			WebElement seleniumRubyProductWebElement = driver.findElement(seleniumRubyProduct);
	        return seleniumRubyProductWebElement;
	    }
		
		public WebElement seleniumRubyTitleIsPresent(WebDriver driver) {
			WebElement seleniumRubyTitleWebElement = driver.findElement(seleniumRubyTitle);
	        return seleniumRubyTitleWebElement;
	    }
		
		public WebElement viewBasketButtonIsPresent(WebDriver driver) {
			WebElement viewBasketButtonWebElement = driver.findElement(viewBasketButton);
	        return viewBasketButtonWebElement;
	    }
		
		public WebElement applyCouponcodeButtonIsPresent(WebDriver driver) {
			WebElement applyCouponcodeButtonWebElement = driver.findElement(applyCouponcodeButton);
	        return applyCouponcodeButtonWebElement;
	    }
		
		public WebElement proceedToCheckoutButtonIsPresent(WebDriver driver) {
			WebElement proceedToCheckoutButtonWebElement = driver.findElement(proceedToCheckoutButton);
	        return proceedToCheckoutButtonWebElement;
	    }
		
		public WebElement seleniumRubyInsideTheBasketPageIsPresent(WebDriver driver) {
			WebElement seleniumRubyInsideTheBasketPageWebElement = driver.findElement(seleniumRubyInsideTheBasketPage);
	        return seleniumRubyInsideTheBasketPageWebElement;
	    }
		
		public WebElement removeMessageIsPresent(WebDriver driver) {
			WebElement removeMessageWebElement = driver.findElement(removeMessage);
	        return removeMessageWebElement;
	    }
		
		public WebElement increasedProductInCartIsPresent(WebDriver driver) {
			WebElement increasedProductInCartWebElement = driver.findElement(increasedProductInCart);
	        return increasedProductInCartWebElement;
	    }
		
		public WebElement loginButtonIsPresent(WebDriver driver) {
			WebElement loginButtonWebElement = driver.findElement(loginButton);
	        return loginButtonWebElement;
	    }
		
		public WebElement testCasesIconIsPresent(WebDriver driver) {
			WebElement testCasesIconWebElement = driver.findElement(testCasesIcon);
	        return testCasesIconWebElement;
	    }
		public WebElement toolsIconIsPresent(WebDriver driver) {
			WebElement toolsIconWebElement = driver.findElement(toolsIcon);
	        return toolsIconWebElement;
	    }
		
		public WebElement filterByPriceSliderIsPresent(WebDriver driver) {
			WebElement filterByPriceSliderWebElement = driver.findElement(filterByPriceSlider);
	        return filterByPriceSliderWebElement;
	    }
		
		public WebElement productTotalPriceIsPresent(WebDriver driver) {
			WebElement productTotalPriceWebElement = driver.findElement(productTotalPrice);
	        return productTotalPriceWebElement;
	    }
		public WebElement checkTheQuantityIsPresent(WebDriver driver) {
			WebElement checkTheQuantityWebElement = driver.findElement(checkTheQuantity);
	        return checkTheQuantityWebElement;
	    }
		
		public WebElement seleniumRubyProductPriceIsPresent(WebDriver driver) {
			WebElement seleniumRubyProductPriceWebElement = driver.findElement(seleniumRubyProductPrice);
	        return seleniumRubyProductPriceWebElement;
	    }
		public WebElement taxAmountIsPresent(WebDriver driver) {
			WebElement taxAmountIsPresentWebElement = driver.findElement(taxAmount);
	        return taxAmountIsPresentWebElement;
	    }
		
}
