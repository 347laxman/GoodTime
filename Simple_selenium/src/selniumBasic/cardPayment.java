package selniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cardPayment {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aa\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stg.app2food.com/order7/11002/#/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"maincat_7846\"]/a/p/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"maincat_7846\"]/div/p/span/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"control-59148\"]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"pickup_option\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"saveOrderAddrBtn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"article_82735\"]/ul/li[1]/label/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"article_82736\"]/ul/li[1]/label/input")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//*[@id=\"mod_list_group\"]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"article_82737\"]/ul/li[1]/label/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"addItemBtn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"cartStatic\"]/div[3]/div/dl/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"lg_gst_btn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"guestUserFirstName\"]")).sendKeys("Laxman");
		driver.findElement(By.xpath("//*[@id=\"guestUserLastName\"]")).sendKeys("Kumar");
		driver.findElement(By.xpath("//*[@id=\"guestUserEmail\"]")).sendKeys("laxman@app2mobile.com");
		driver.findElement(By.xpath("//*[@id=\"guestUserMobile\"]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id=\"info-form\"]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"addNewCard\"]/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#example3-card-number")).sendKeys("4242424242424242");
		driver.findElement(By.xpath("//*[@id=\"expiration\"]")).sendKeys("0222");
		driver.findElement(By.xpath("//*[@id=\"cvv\"]")).sendKeys("147");
		driver.findElement(By.xpath("//*[@id=\"pay-button\"]")).click();
		Thread.sleep(1000);
		String txt = driver.findElement(By.xpath("//*[@id=\"ordered-items\"]/div/div[2]/article/p[1]")).getText();
		System.out.println(txt);
		
		
	}

}
