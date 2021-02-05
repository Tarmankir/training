import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/knosov/IdeaProjects/N1/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.rabota.ru/passport/sign-in/");
        driver.findElement(By.xpath("//input[@name = 'login']")).sendKeys("artol@bk.ru");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("test");
        driver.findElement(By.xpath("//button[@class = 'login-form__submit r-btn r-btn_large secondary']")).click();
    }
}

