package commonMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BaseMethods {
	
	public WebDriver driver;
	String url = "http://orangehrm.qedgetech.com/webapp/login.php";
	String uname = "admin";
	String password = "master";
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void launchERP() {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void loginERP() {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("btnsubmit")).click();
		String actResult = driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertEquals(actResult, "Dashboard");
	}
	
	public void loginERP1(String username, String pwd) {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("btnsubmit")).click();
		String actResult = driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertEquals(actResult, "Dashboard");
	}
	
	public void logoutERP() {
		driver.findElement(By.id("mi_logout")).click();
		if (driver.findElement(By.id("btnsubmit")).isEnabled()) {
			System.out.println("Logout successful, Testcase is passed..");
		}
		else {
			System.out.println("Logout failed, Testcase is failed..");
		}
  }
	
	public void accessStockItemsPage() {
		WebElement stockItems = driver.findElement(By.xpath("//a[contains(text(),\"Stock Items \")]"));
		stockItems.click();
		String actResult = driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertEquals(actResult, "Stock Items");
	}
	
	public void accessCustomersPage() {
		WebElement customers = driver.findElement(By.xpath("//li[@id='mi_a_customers']"));
		customers.click();
		String actResult = driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertEquals(actResult, "Customers");
	}
	
	public void selectStockCategories() {
		
	    WebElement stockItems = driver.findElement(By.xpath("//a[contains(text(),\"Stock Items \")]"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(stockItems).build().perform();
		
		WebElement stockCat = driver.findElement(By.xpath("//li[@id='mmi_a_stock_categories']/following::a[@href='a_stock_categorieslist.php']"));
		actions.moveToElement(stockCat).build().perform();
		stockCat.click();
		String actResult = driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertEquals(actResult, "Stock Categories");
	}
	
    public void selectUOM() {
		
	    WebElement stockItems = driver.findElement(By.xpath("//a[contains(text(),\"Stock Items \")]"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(stockItems).build().perform();
		
		WebElement uom = driver.findElement(By.xpath("//li[@id='mi_a_unit_of_measurement']"));
		actions.moveToElement(uom).build().perform();
		uom.click();
		String actResult = driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertEquals(actResult, "Unit of Measurement");
	 }
	
	public void addStockItem()  {
		
		driver.findElement(By.id("mi_a_stock_items")).click();
		WebElement addStock = driver.findElement(By.xpath("(//span[@data-caption='Add'])[1]"));
		addStock.click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		Select category = new Select(driver.findElement(By.id("x_Category")));
		category.selectByVisibleText("Mobiles");
		Select supplierNumber = new Select(driver.findElement(By.id("x_Supplier_Number")));
		supplierNumber.selectByVisibleText("iphone");
		WebElement stockName = driver.findElement(By.xpath("//input[@id='x_Stock_Name']"));
		stockName.sendKeys("Iphone 12 pro");
		Select uom = new Select(driver.findElement(By.id("x_Unit_Of_Measurement")));
		uom.selectByVisibleText("count");
		WebElement purchasePrice = driver.findElement(By.xpath("//input[@id='x_Purchasing_Price']"));
		purchasePrice.sendKeys("100000");
		WebElement sellingPrice = driver.findElement(By.xpath("//input[@id='x_Selling_Price']"));
		sellingPrice.sendKeys("125000");
		WebElement notes = driver.findElement(By.xpath("//input[@id='x_Notes']"));
		notes.sendKeys("Iphone latest Model 2022");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String alertWindow = driver.getWindowHandle();	
		driver.switchTo().window(alertWindow);
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebElement confirm = driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']"));
		confirm.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("mi_a_stock_items")).click();	
	}
}
