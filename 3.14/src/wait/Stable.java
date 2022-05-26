package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Stable
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);        //implicit wait
		
		driver.navigate().to("https://www.amazon.in");
		
		WebDriverWait myw= new WebDriverWait(driver,20);                        //explicit wait ,time interval of 500ms
		
		WebElement wait= myw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Mobiles']")));
        
		   wait.click();
		//driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		WebElement best=driver.findElement(By.xpath("//a[text()='Best Sellers'][@class='nav-a  ']"));
			String a =best.getText();
			System.out.println(a);
		best.click();
		    driver.quit();		
		
		
		
		
	}

}
