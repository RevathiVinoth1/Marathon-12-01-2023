package salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option1=new ChromeOptions();
		option1.addArguments("---disable notifications");
		ChromeDriver driver=new ChromeDriver(option1);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(2000);
		WebElement opt = driver.findElement(By.xpath("((//span[@class='slds-truncate'])[3]"));
		opt.click();
		//driver.executeScript("arguments[0].click();", opt);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Salesforce Automation By RevathiVinoth");
		driver.findElement(By.xpath("//span[text()='Select a date for Close Date']"));
		driver.findElement(By.xpath("(//span[text()='Needs Analysis'])[11]")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		//driver.findElement(By.xpath("(//input[@class='slds-input'])[6]")).click();)
		//driver.findElement(By.xpath("//input[@name='CloseDate']"));
		//driver.findElement(By.xpath("//records[@class='slds-form__item slds-no-space']"));
	}

}
