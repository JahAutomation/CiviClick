package CampaignDisplay;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import CampaignDataCreation.AllTextInputs;
import CampaignDataCreation.Browser;
import CampaignDataCreation.CampaignElements;
import CampaignDataCreation.LoginElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import CampaignSettings.Elements;

public class Display_WidgetCode {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) throws InterruptedException, AWTException {

		// ========================================================================//
		// AccountDetails account = new AccountDetails();
		CampaignElements _campaign = new CampaignElements();
		LoginElements _login = new LoginElements();
		Browser _browser = new Browser();
		AllTextInputs _allText = new AllTextInputs();
		Elements _elements = new Elements();
		Robot robot = new Robot(); 
				
		System.setProperty(_browser._browserPath, _browser._chromeDriver);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(_browser._browser);

		// ==============================================================
		System.out.println("=====================================================");
		System.out.println("Log In..");
		System.out.println("=====================================================");

		Thread.sleep(7000);
		WebElement _email = driver.findElement
		(By.xpath(_login._email));
		_email.click();
		_email.sendKeys(_login._emailAccount);
		WebElement _password = driver.findElement
		(By.xpath(_login._password));
		_password.click();
		_password.sendKeys(_login._passwordAccount);
		WebElement _loginButton = driver.findElement
		(By.xpath(_login._loginButton));
		_loginButton.click();
		Thread.sleep(17000);

		WebElement _clickPublishedData = driver.findElement
		(By.cssSelector(_campaign._petition_ClickDataPublishedStatusEditButton));
		_clickPublishedData.click();
		Thread.sleep(18000);

		//System.out.println("=====================================================");
		System.out.println("Navigate to Display Tab..");
		System.out.println("=====================================================");
		WebElement _gotoDisplayTab = driver.findElement
		(By.cssSelector(_elements._gotoDisplayTab));
		Thread.sleep(1000);
		_gotoDisplayTab.click();
		Thread.sleep(300);
		_gotoDisplayTab.click();
		Thread.sleep(2500);
				//System.out.println("=====================================================");
				System.out.println("Navigate to Widget Link..");
				System.out.println("=====================================================");
				WebElement _clickWidgetCode = driver.findElement
				(By.cssSelector(_elements._clickWidgetCode));
				_clickWidgetCode.click();
				Thread.sleep(300);
				_clickWidgetCode.click();
				Thread.sleep(200);				
				robot.keyPress(KeyEvent.VK_CONTROL);
				Thread.sleep(50);
				robot.keyPress(KeyEvent.VK_A);
				Thread.sleep(50);
				robot.keyPress(KeyEvent.VK_CONTROL);
				Thread.sleep(50);
				robot.keyPress(KeyEvent.VK_C);	
				Thread.sleep(50);
				
					robot.keyRelease(KeyEvent.VK_CONTROL);
					Thread.sleep(50);
					robot.keyRelease(KeyEvent.VK_A);
					Thread.sleep(50);
					robot.keyRelease(KeyEvent.VK_CONTROL);	
					Thread.sleep(50);
					robot.keyRelease(KeyEvent.VK_C);	
					Thread.sleep(2000);
				
				//System.out.println("=====================================================");
				System.out.println("Open New Tab to Navigate W3schools.com..");
				System.out.println("=====================================================");
				Thread.sleep(2000);
				//System.out.println("=====================================================");
				System.out.println("Wait to load W3schools.com..");
				System.out.println("=====================================================");
				((JavascriptExecutor) driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				//To open  new tab
				driver.switchTo().window(tabs.get(1));
				Thread.sleep(1000);
				driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");				
				//Thread.sleep(3000);			
						WebElement _clickHTMLTextEditor = driver.findElement
						(By.cssSelector(_elements.__htmlEditor));
						_clickHTMLTextEditor.click();
						robot.keyPress(KeyEvent.VK_CONTROL);
						Thread.sleep(50);
						robot.keyPress(KeyEvent.VK_A);
						Thread.sleep(50);
						robot.keyPress(KeyEvent.VK_DELETE);
						Thread.sleep(50);											

							robot.keyRelease(KeyEvent.VK_CONTROL);
							Thread.sleep(50);
							robot.keyRelease(KeyEvent.VK_A);
							Thread.sleep(50);
							robot.keyRelease(KeyEvent.VK_DELETE);
							Thread.sleep(50);

								//System.out.println("=====================================================");
								System.out.println("Input Widget Code..");
								System.out.println("=====================================================");
								robot.keyPress(KeyEvent.VK_CONTROL);
								Thread.sleep(50);							
								robot.keyPress(KeyEvent.VK_V);
								Thread.sleep(50);
								
									robot.keyRelease(KeyEvent.VK_CONTROL);							
									Thread.sleep(50);
									robot.keyRelease(KeyEvent.VK_V);							
									Thread.sleep(500);
									//System.out.println("=====================================================");
									System.out.println("Click Run HTML Button..");
									System.out.println("=====================================================");
									
											WebElement _clickRunHTMLButton = driver.findElement
											(By.cssSelector(_elements._runHTMLButton));
											_clickRunHTMLButton.click();
											Thread.sleep(2000);
											//System.out.println("=====================================================");
											System.out.println("Checking HTML output..");
											System.out.println("=====================================================");
											Thread.sleep(15000);										
											File screenshotMid = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
											try {
												//System.out.println("=====================================================");
												System.out.println("Taking Screenshot..");
												System.out.println("=====================================================");
											
									            FileUtils.copyFile(screenshotMid, new File("C:\\CiviTestScreenshot\\WidgetCode.png"));   	           
									            Thread.sleep(2000);
									                 	            
									        } catch (IOException e) {
									            System.out.println(e.getMessage());
									        }
											
													
											

	}
	

}
