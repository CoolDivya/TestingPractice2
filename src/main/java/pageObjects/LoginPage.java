package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enter_loginid_password(String id,String password)
	{
		 driver.findElement(By.xpath("//input[@name='loginId']")).sendKeys(id);
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}
	
	public void click_login() throws InterruptedException
	{
		 driver.findElement(By.xpath("//input[@id='login']")).click();
		 Thread.sleep(5000);
		 
		
		 
			
	}

}
