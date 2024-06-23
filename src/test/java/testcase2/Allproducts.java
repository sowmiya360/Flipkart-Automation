package testcase2;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allproducts {

	public static WebDriver wd;
	
	public static void setup()
	{
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\sowmi\\eclipse-workspace\\Flipkart\\src\\test\\resources\\chromedriver.exe");
	    wd = new ChromeDriver();
	}
	public static void url()
	{
		wd.get("https://www.flipkart.com/");
		wd.manage().window().maximize();
	}
	
	public static void searchengine()
	{
		WebElement search = wd.findElement(By.xpath("//input[contains(@class,'Pke_EE')]"));
	    search.click();
	    search.sendKeys("mens footwear");
	    search.submit(); 
	   	}
	
	public static void list()
	{
		List<String> allpages = new ArrayList<>();
	
		while(true)
		{
		List<WebElement> page1 = wd.findElements(By.xpath("//div[contains(@class,'nt6sNV JxFEK3 _48O0EI')]/div"));
		for(WebElement firstpage : page1)
		{
			String firstpagename = firstpage.findElement(By.xpath("//a[contains(@class,'WKTcLC')]")).getText();
			allpages.add(firstpagename);	
			
		}
		
		try
		{
			WebElement next = wd.findElement(By.xpath("//a[contains(@class,'_9QVEpD')]"));
			next.click();
		}
		catch(Exception E)
		{
			break;
		}
		}
		
	 for(String all : allpages)
	 {
		 if(all.contains("black shoes"))
		 {
			 System.out.println(all);
		 }
	 }
	}

	public static void quit()
	{
		wd.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Allproducts.setup();
		Allproducts.url();
		Allproducts.searchengine();
		Allproducts.list();
		Allproducts.quit();
	*/
	}

}
