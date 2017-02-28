import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class FacebookLogin {
	private String baseUrl = "https://www.facebook.com";
	private WebDriver driver;

	@Test
	public void facebookLogin() throws InterruptedException {
		WebElement username = this.driver.findElement(By.id("email"));
		WebElement password = this.driver.findElement(By.id("pass"));
		WebElement Login = this.driver.findElement(By.id("u_0_q"));
		username.sendKeys("gyakovenko@yahoo.com");
		password.sendKeys("1shaGalin@");
		Login.click();
	}

	@BeforeMethod
	public void setUp() {
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.get(this.baseUrl);
	}

	@AfterMethod
	public void tearDown() {
		this.driver.quit();
	}

}

// public static void main(String[] args) throws InterruptedException {
// WebDriver driver = new FirefoxDriver();
// driver.manage().window().maximize();
// driver.get("https://www.facebook.com");
// Thread.sleep(2000);
// WebElement username = driver.findElement(By.id("email"));
// WebElement password = driver.findElement(By.id("pass"));
// WebElement Login = driver.findElement(By.id("u_0_q")); // Is this ID
// // dynamic?
// username.sendKeys("gyakovenko@yahoo.com");
// password.sendKeys("1shaGalin@");
// Login.click();
//
// }
// }
