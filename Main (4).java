
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice {
	
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver  driver = new ChromeDriver();
	driver.get("Http://Google.com");
	//Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.get("Http://Flipkart.com");
	//Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@class='_1TOQfO']")).click();
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys("7004948234");
	
	driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();

	
	Thread.sleep(28000);
	driver.findElement(By.xpath("//button[@class='QqFHMw llMuju M5XAsp']")).click();
	
	
	 WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
	 searchbox.sendKeys("realme 14x");
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(" Pragram is Successfully Executed");
	
	driver.quit();

	}

}
