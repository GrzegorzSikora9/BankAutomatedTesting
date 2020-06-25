package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;




public class AcordionPage extends BasePage {
	
	public AcordionPage() throws IOException {
		super();
			}
	
	@FindBy(xpath = "//h1[contains(text(),'ACCORDION & TEXT AFFECTS (APPEAR & DISAPPEAR)')]") WebElement accordionButton; 
	@FindBy(css = "#manual-testing-description") WebElement manualTestingDescriptionText;
	
	// Background
	public AcordionPage user_navigate_to_website() throws Exception {
		driver.get("http://www.webdriveruniversity.com/");
		return new AcordionPage();
	}

	
	public AcordionPage click_Accordion_Text() throws Exception {
	    waitAndClickElement(accordionButton);
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		return new AcordionPage();
	}

	// Click and text is visible
	public AcordionPage user_click_on_tab(String tab) throws Exception {
		// for 3 examples we can use simply waitAndClick method instead of loop
		for(int a = 0; a < 17  ; a++ ) {
		Thread.sleep(500);
		waitAndClickElementsUsingByLocator(By.xpath(tab)); }
		return new AcordionPage();
		
	}

	
	public AcordionPage text_should_be_visible(String text1) throws Exception {
		WaitUntilWebElementIsVisibleUsingByLocator(By.xpath(text1));
		return new AcordionPage();
	}
	// Click and text is non visible
	
	public AcordionPage user_click_on_open(String tab) throws Exception {
		waitAndClickElementsUsingByLocator(By.xpath(tab));
		return new AcordionPage();
	}

	// Assertion
	public AcordionPage text_should_be_hidden(String text2) throws Exception {
		if( driver.findElements(By.xpath(text2)).size() !=0 )  {
			AssertJUnit.fail("Element is visible!");
			}else{
			System.out.println("Element is InVisible");
			}
		return new AcordionPage();
	}

}
