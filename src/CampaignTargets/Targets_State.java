package CampaignTargets;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import CampaignDataCreation.Browser;
import CampaignDataCreation.CampaignElements;
import CampaignDataCreation.LoginElements;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import CampaignSettings.Elements;

public class Targets_State {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) throws InterruptedException, AWTException {

		// ========================================================================//
		// AccountDetails account = new AccountDetails();
		CampaignElements _campaign = new CampaignElements();
		LoginElements _login = new LoginElements();
		Browser _browser = new Browser();
		//AllTextInputs _allText = new AllTextInputs();
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

		Thread.sleep(6000);
		WebElement _email = driver.findElement
		(By.xpath(_login._email));
		Thread.sleep(200);
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
		System.out.println("Navigate to Targets Tab..");
		System.out.println("=====================================================");
		Thread.sleep(1000);
		WebElement _gotoTargetsTab = driver.findElement
		(By.cssSelector(_elements._gotoTargetsTab));
		Thread.sleep(1000);
		_gotoTargetsTab.click();
		Thread.sleep(1000);
		_gotoTargetsTab.click();
		Thread.sleep(5000);
		File _congressMainPage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
							try {
								//System.out.println("=====================================================");
								System.out.println("Taking Screenshot - Targets Congress Page..");
								System.out.println("=====================================================");	
								Thread.sleep(3000);					
								FileUtils.copyFile(_congressMainPage, new File("C:\\CiviTestScreenshot\\CongressMainPage.png"));   	           
								Thread.sleep(2000);												
							} catch (IOException e) {
								System.out.println(e.getMessage());
							}
				Thread.sleep(500);
				//System.out.println("=====================================================");
				System.out.println("Click States Tab..");
				System.out.println("=====================================================");
				WebElement _gotoStatesTab = driver.findElement
				(By.cssSelector(_elements._statesTab));
				Thread.sleep(1000);
				_gotoStatesTab.click();
				Thread.sleep(2000);

							//System.out.println("=====================================================");
							System.out.println("Click States Search Area..");
							System.out.println("=====================================================");
							WebElement _clickStateTextArea = driver.findElement
							(By.cssSelector(_elements._selectStateTextArea));
							Thread.sleep(1000);
							_clickStateTextArea.click();
							Thread.sleep(1000);
							_clickStateTextArea.sendKeys("Arizona");
							Thread.sleep(1000);
							robot.keyPress(KeyEvent.VK_ENTER);
							Thread.sleep(50);
									
							WebElement _clickAddButton = driver.findElement
							(By.cssSelector(_elements._addStatesButton));
							Thread.sleep(1000);
							_clickAddButton.click();
							Thread.sleep(3000);

							
						File _statesPage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
							try {
								//System.out.println("=====================================================");
								System.out.println("Taking Screenshot - Targets States Page..");
								System.out.println("=====================================================");	
								Thread.sleep(3000);					
								FileUtils.copyFile(_statesPage, new File("C:\\CiviTestScreenshot\\StatesMainPage.png"));   	           
								Thread.sleep(2000);												
							} catch (IOException e) {
								System.out.println(e.getMessage());
							}
								Thread.sleep(300);
								//System.out.println("=====================================================");
								System.out.println("Click Select All Button..");
								System.out.println("=====================================================");
								WebElement _clickSelectAllButton = driver.findElement
								(By.cssSelector(_elements._selectAllButton));
								Thread.sleep(1000);
								_clickSelectAllButton.click();
								Thread.sleep(2000);

										//System.out.println("=====================================================");
										System.out.println("Click Add Selected Button..");
										System.out.println("=====================================================");
										WebElement _clickSelectAddSelectedButton = driver.findElement
										(By.cssSelector(_elements._clickSelectAddSelectedButton));
										Thread.sleep(1000);
										_clickSelectAddSelectedButton.click();
										Thread.sleep(9000);
												File _state = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
												try {
													//System.out.println("=====================================================");
													System.out.println("Taking Screenshot - Selected All Targets..");
													System.out.println("=====================================================");	
													Thread.sleep(7000);					
													FileUtils.copyFile(_state, new File("C:\\CiviTestScreenshot\\State_SelectedTargets.png"));   	           
													Thread.sleep(2000);												
												} catch (IOException e) {
													System.out.println(e.getMessage());
												}
													Thread.sleep(500);	
													WebElement _clickViewAddedTargets = driver.findElement
													(By.cssSelector(_elements._viewAddedTargets));
													Thread.sleep(1000);
													_clickViewAddedTargets.click();
													Thread.sleep(8000);
													File _addedTargets = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
																try {
																	//System.out.println("=====================================================");
																	System.out.println("Taking Screenshot - ViewAdded Targets..");
																	System.out.println("=====================================================");	
																	Thread.sleep(8000);					
																	FileUtils.copyFile(_addedTargets, new File("C:\\CiviTestScreenshot\\StateView_AddedTargets.png"));   	           
																	Thread.sleep(2000);												
																} catch (IOException e) {
																	System.out.println(e.getMessage());
																}										
												
	}
		

}
