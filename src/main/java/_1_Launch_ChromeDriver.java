import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _1_Launch_ChromeDriver {


    public static void main(String[] args) {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver","D:\\intelijj idea\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.btes.co.in/login/index.php");

        driver.findElement(By.id("username")).sendKeys("rch01220063");
        driver.findElement(By.id("password")).sendKeys("Manish@123");
        driver.findElement(By.id("rememberusername")).click();
        driver.findElement(By.id("loginbtn")).click();

    }
}
