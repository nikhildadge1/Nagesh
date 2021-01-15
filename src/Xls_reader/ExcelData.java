package Xls_reader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelData 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/"
				+ "webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		Xls_Reader reader=new Xls_Reader("C:\\Users\\hp\\eclipse-workspace\\"
				+ "ExcelData\\src\\TestData\\Book1.xlsx");
		
		int rowcount=reader.getRowCount("sheet1");
		
		for(int rownum=2;rownum<=rowcount;rownum++)
		{
			String firstNN=reader.getCellData("sheet1", "FirstName", rownum);
			System.out.println(firstNN);
			
			String LastNN=reader.getCellData("sheet1", "LastName", rownum);
			System.out.println(LastNN);
			
			String userNN=reader.getCellData("sheet1", "UserName", rownum);
			System.out.println(userNN);
			
			String pass=reader.getCellData("sheet1", "Passwod", rownum);
			System.out.println(pass);
			
			String Conpass=reader.getCellData("sheet1", "ConfirmPass", rownum);
			System.out.println(Conpass);
			
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(firstNN);
			
			
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(LastNN);
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userNN);
			
			driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(pass);
			
			driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(Conpass);
			
			
		}
		
	}

	

}
