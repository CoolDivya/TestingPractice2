package stepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CreateEFT;
import pageObjects.LoginPage;

public class Steps {
	protected WebDriver driver;
	boolean found;
	
	LoginPage login;
	CreateEFT createEFT;
	
	 @Given("^user is on Home Page$")
	 public void user_is_on_Home_Page(){
		 System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("http://administrator:nicecti1!@10.128.32.131/NxIA/main");
	 }
	 
	 @When("^login id is \"([^\"]*)\" and Password is \"([^\"]*)\"$")
	 public void enter_login_id_password(String id, String password){
	 
	 login=new LoginPage(driver);
	 login.enter_loginid_password(id,password);
	 }
	 
	 
	
	 @Then("^click on login button$")
	 public void click_on_loginButton() throws InterruptedException{
	 login=new LoginPage(driver);
	 login.click_login();
	 }
	 
	 @Given("^user is on EFT page$")
	 public void user_is_on_EFT_page() throws InterruptedException {
     createEFT= new CreateEFT(driver);
     createEFT.OpenEFTPage();
	    
	 }

	 @When("^verify AllTemplate folder is available or not$")
	 public void verify_AllTemplate_folder_is_available_or_not()  {
	 createEFT= new CreateEFT(driver);
	 found=createEFT.VerifyAllTemplateFolder();
	    
	 }

	 @Then("^create template \"([^\"]*)\" and create number of categories \"([^\"]*)\"$")
	 public void create_template(String formName,int catgorycount) throws InterruptedException  {
	 createEFT= new CreateEFT(driver);
	 if(found)
	 {
		 createEFT.addNewTemplate(formName, 2);
	 }
	 else
	 {
		 System.out.println("AllTemplate is not found");
	 }
	 }
	 
}
