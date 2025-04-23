package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartAutomationPages extends StartupPage
{
//	Locators for TC-1 & 2
	By shopOption = By.xpath("//a[.='Shop']");
//	Locators for TC-3 & 4 
	By automationPracticeSiteLogo = By.xpath("//a[@title='Automation Practice Site']"); //TC-4
//	Locators for TC-5
	By newArrivalButton = By.xpath("//h2[.='new arrivals']"); //tc-5
//	Locators for TC-6
	By seleniumRubyProduct = By.xpath("//h3[contains(text(),'Selenium Ruby')]/../../../..//a[@class='woocommerce-LoopProduct-link']"); //TC-6
	By thinkingInHtmlProduct = By.xpath("//h3[.='Thinking in HTML']"); 
	By masteringJavaScriptProduct = By.xpath("//h3[.='Mastering JavaScript']"); 

	public ShoppingCartAutomationPages(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	/**@Test1
	 * about this method verifyNavigateTotTheShoppingCartpage() 
	 * @param : null
	 * @description : go to this shopping cart page URL and validate the home page
	 * @return : return the current page tile as String
	 * @author : Yaksha
	 */
	public String verifyNavigateTotTheShoppingCartpage() throws Exception {
		String titleOfTheShoppingCartPage = "";
		try {	
			titleOfTheShoppingCartPage	=commonEvents.getTitle();
		System.out.println("Title of the Home Page : " + titleOfTheShoppingCartPage );
		}catch(Exception e) {
			throw e;
		}
		return titleOfTheShoppingCartPage;
	}
	/**@Test2
	 * about this method verifyShopOptionIsPresent() 
	 * @param : null
	 * @description : Check shop menu option is present or not
	 * @return : return true if shop option is present, else false
	 * @author : Yaksha
	 */
	public boolean verifyShopOptionIsPresent() throws Exception {
		Boolean shopOptionisDisplay = false;
		try {
		if(commonEvents.isDisplayed(shopOption))
		{
			shopOptionisDisplay=true;
		}
		}catch(Exception e) {
			throw e;
		}
		return shopOptionisDisplay;
	}
	/**@Test3
	 * about this method clickOnShopMenuandValidateTheTitle() 
	 * @param : null
	 * @description : click on the shop menu and validate the title of this shop page
	 * @return : return the current page tile as String
	 * @author : Yaksha
	 */
	public String clickOnShopMenuandValidateTheTitle() throws Exception {
		String shopPageTitle="";
		try {
		commonEvents.click(shopOption);
		shopPageTitle=driver.getTitle();
		System.out.println("Title of the shop page:"+shopPageTitle);
		}catch(Exception e) {
			throw e;
		}
		return shopPageTitle;

	}

	/**@Test4
	 * about this method clickOnLogoandVerifyItIsNavigateToTheHomePage() 
	 * @param : null
	 * @description : validate the logo is present and click on the Automation practice site logo which is present at the left top corner
	 * 				  and verify the page title.
	 * @return : return the current page tile as String
	 * @author : Yaksha
	 */
	public String clickOnLogoandVerifyItIsNavigateToTheHomePage() throws Exception {
		String homePageTitle="";
		try {
			commonEvents.isDisplayed(automationPracticeSiteLogo);
			commonEvents.click(automationPracticeSiteLogo);
			homePageTitle=commonEvents.getTitle();
			System.out.println("Title of the page:"+homePageTitle);
		}catch(Exception e) {
			throw e;
		}
		return homePageTitle;

	}

	/**@Test5
	 * about this method checkIfHomePageHasSectionOfNewArrivals() 
	 * @param : null
	 * @description : check home page has a section of new arrival.
	 * @return : return true if newArrival Button is present, else false
	 * @author : Yaksha
	 */
	public boolean checkIfHomePageHasSectionOfNewArrivals() throws Exception {
		Boolean newArrivalButtonIsDisplay = false;
		try {
			if(commonEvents.isDisplayed(newArrivalButton))
			{
				newArrivalButtonIsDisplay=true;
			}
			
		}catch(Exception e) {
			throw e;
		}
		return newArrivalButtonIsDisplay;
	}
	
	/**@Test6
	 * about this method checkOfArrivalsSectionhasExactly3ProductsEnlisted() : Check of “Arrivals” section has exactly 3 products enlisted
	 * @param : null
	 * @description : Check “New Arrivals” section has exactly 3 products enlisted
	 * @return : return true if all three products are  present, else false
	 * @author : Yaksha
	 */
	public boolean checkOfArrivalsSectionhasExactly3ProductsEnlisted() throws Exception {
		Boolean threeProductsAreDisplay = false;
		try {
			if(commonEvents.isDisplayed(seleniumRubyProduct)&&
					commonEvents.isDisplayed(thinkingInHtmlProduct)&&
					commonEvents.isDisplayed(masteringJavaScriptProduct)) {
				threeProductsAreDisplay=true;
			}
		}catch(Exception e) {
			throw e;
		}
	return threeProductsAreDisplay;
	}
	
}
