package week3.day2.Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys("Bags");
		driver.findElement(By.xpath("//button[@class='rilrtl-button']/span")).click();
		driver.findElement(By.xpath("//label[contains(@class,'genderfilter facet-linkname-Men')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(@class,'Fashion Bags')]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,' filter-container')]/div[1]/div[1]")).getText());
		
	
		//List<String> l1=new ArrayList<String>();
		
		
		
	}

}
