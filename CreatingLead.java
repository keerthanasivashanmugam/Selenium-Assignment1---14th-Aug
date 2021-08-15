package weekend.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingLead {
	
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup(); 
	 ChromeDriver driver=new ChromeDriver(); 
	 driver.get("http://leaftaps.com/opentaps/control/main");
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 WebElement webUser = driver.findElement(By.id("username"));
	 webUser.sendKeys("demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 String title = "My Home | opentaps CRM";
	 String title1 = driver.getTitle();
	 if(title.equals(title1))
		 System.out.println("Home Page");
	 else
		 System.out.println("Not in home page");
	 
	 
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Create Lead")).click();
	 System.out.println("In Create lead page");
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BNY");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Keerthana");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Siva Shanmugam");
	 
	 WebElement webEleDrp1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 Select drpdwn1 = new Select(webEleDrp1);
	 drpdwn1.selectByValue("LEAD_EMPLOYEE");
	 
	 WebElement webEleDrp2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	 Select drpdwn2 = new Select(webEleDrp2);
	 drpdwn2.selectByVisibleText("eCommerce Site Internal Campaign");
	
	 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("keerthi");
	 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("shiva");
	 driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hi");
	 driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/31/19");
	 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SQA");
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tester");
	 driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("7l");
	 
	 WebElement webEleDrp3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
	 Select drpdwn3 = new Select(webEleDrp3);
	 drpdwn3.selectByValue("INR");
	 
	 WebElement webEleDrp4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	 Select drpdwn4 = new Select(webEleDrp4);
	 drpdwn4.selectByValue("IND_SOFTWARE");
	
	 driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("2");
	
	 WebElement webEleDrp5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	 Select drpDwn5 = new Select(webEleDrp5);
	 drpDwn5.selectByValue("OWN_CCORP");
	 
	 driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("50");
	 driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("@");
	 driver.findElement(By.id("createLeadForm_description")).sendKeys("This is description box");
	 driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("This is important note");
	 
	 System.out.println("Filling Contact Information");
	 
	 WebElement webEleCountryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
	 webEleCountryCode.clear();
	 webEleCountryCode.sendKeys("3");
	 
	 driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("606601");
	 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9597736085");
	 driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("254701");
	 driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Priya");
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("keerthanasivashanmugam@gmail.com");
	 driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://mail.google.com/mail/u/0/");
	 
	 System.out.println("Filling Primary Address");
	 
	 driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Keerthana");
	 driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Keerthi");
	 driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("745/725");
	 driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Amman kovil street");
	 driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("TVM");
	 
	 WebElement webEleStateOrProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	 Select drpDwn6 = new Select(webEleStateOrProvince);
	 drpDwn6.selectByVisibleText("Indiana");
	 
	 driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("606 601");
	 
	 WebElement WebEleCountry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	 Select drpDwn7 = new Select(WebEleCountry);
	 drpDwn7.selectByValue("IND");
	 
	 driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("606601");
	 
	 WebElement webEleName = driver.findElement(By.id("createLeadForm_firstName"));
	 webEleName.getText();
	 System.out.println("First Name : "+webEleName.getAttribute("value"));
	 	  
	 driver.findElement(By.name("submitButton")).click();
	 
	 String title2 = "View Lead | opentaps CRM";
	 String titleViewPage = driver.getTitle();
	 if(title2.equals(titleViewPage))
		 System.out.println("In View Page");
	 else
		 System.out.println("Not in View page");

	//String NameDisplay = driver.getAttribute("createLeadForm_firstName");
	//System.out.println(NameDisplay);
//getAttribute("value");

}

}
