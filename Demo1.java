package demop1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 
{
	public WebDriver driver;
	@BeforeSuite
	public void config()
	{
		System.out.println("before suit");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://sampleapp.tricentis.com/101/app.php");
		 driver.findElement(By.xpath("(//a[@id='nav_automobile'])[1]")).click();
	}
	@BeforeMethod
	public void waiting()
	{
		System.out.println("timeout for befoe every test");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@Test(priority = 1)
	public void enterVehicleData()
	{
		System.out.println("testnG start");
		driver.findElement(By.xpath("//select[@id='make']")).sendKeys("Ford");
		driver.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@id='dateofmanufacture']")).sendKeys("11/10/2022");
		driver.findElement(By.xpath("//select[@id='numberofseats']")).sendKeys("4");
		driver.findElement(By.xpath("//select[@id='fuel']")).sendKeys("gas");
		driver.findElement(By.xpath("//input[@id='listprice']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@id='licenseplatenumber']")).sendKeys("TN54DF");
		driver.findElement(By.xpath("//input[@id='annualmileage']")).sendKeys("15000");
		driver.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();	
	}
	@Test(priority = 2)
	public void InsurenceData()
	{
		System.out.println("insurence data");
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Ashok");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Sekar");
		driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("01/07/1998");
		/**
		 * driver.findElement(By.xpath("//input[@id='gendermale']")).sendKeys("Male");
		 */WebElement ele=driver.findElement(By.xpath("//*[text()='Male']"));
		 ele.click();
		
		driver.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("Street1,ecity");
		driver.findElement(By.xpath("//select[@id='country']")).sendKeys("india");
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("446456");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//select[@id='occupation']")).sendKeys("Employee");
		//driver.findElement(By.xpath("//input[@id='bungeejumping']")).sendKeys("bungeejumping");
		driver.findElement(By.xpath("//*[text()=' Speeding']")).click();
		driver.findElement(By.xpath("//input[@id='website']")).sendKeys("http://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
	}
	@Test(priority = 3)
	public void enterProductData()
	{
		System.out.println("enter product details");
		driver.findElement(By.xpath("//input[@id='startdate']")).sendKeys("11/01/2023");
		driver.findElement(By.xpath("//select[@id='insurancesum']")).sendKeys("5000000");
		driver.findElement(By.xpath("//select[@id='meritrating']")).sendKeys("Bonus 3");
		driver.findElement(By.xpath("//select[@id='damageinsurance']")).sendKeys("No Coverage");
		driver.findElement(By.xpath("//input[@id='EuroProtection']")).sendKeys("Euro Protection");
		driver.findElement(By.xpath("//select[@id='courtesycar']")).sendKeys("No");
		driver.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
	}
	@Test(priority = 4)
	public void selectPriceOption()
	{
		System.out.println("select price option");
		driver.findElement(By.xpath("//label[@class='choosePrice ideal-radiocheck-label'][1]")).click();
		driver.findElement(By.xpath("//button[@id='nextsendquote']")).click();
	}
	@Test(priority = 5)
	public void sendQuote()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sumi.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234565680");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("USerAshok");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Asd@88");
		driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("Asd@88");
		driver.findElement(By.xpath("//textarea[@id='Comments']")).sendKeys("this is comment area");
		driver.findElement(By.xpath("//button[@id='sendemail']")).click();
	}
	
}
