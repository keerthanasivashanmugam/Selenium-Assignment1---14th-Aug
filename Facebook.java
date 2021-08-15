package weekend.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement webEleCreateNewAccount = driver.findElement(By.linkText("Create New Account"));
		webEleCreateNewAccount.click();
		driver.findElement(By.name("firstname")).sendKeys("Keerthana");
		driver.findElement(By.name("lastname")).sendKeys("Siva Shanmugam");
		driver.findElement(By.name("reg_email__")).sendKeys("Keerthanasihvashanmugam@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Keerthanasihvashanmugam@gmail.com");
		driver.findElement(By.name("firstname")).sendKeys("Keerthana");
		driver.findElement(By.name("reg_passwd__")).sendKeys("KeeRthI");
		
		WebElement webEle1 = driver.findElement(By.id("day"));
		Select drpDwn1 = new Select(webEle1);
		drpDwn1.selectByValue("31");
		
		WebElement webEle2 = driver.findElement(By.id("month"));
		Select drpDwn2 = new Select(webEle2);
		drpDwn2.selectByValue("8");
		
		WebElement webEle3 = driver.findElement(By.name("birthday_year"));
		Select drpDwn3 = new Select(webEle3);
		drpDwn3.selectByValue("1991");
		
		driver.findElement(By.className("_58mt")).click();
		
		
		
		
		
		
	}

}
