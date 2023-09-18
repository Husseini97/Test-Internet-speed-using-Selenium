import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class test {
    private WebDriver driver ;


    public void setup() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--headless");
        driver= new ChromeDriver(options);
        driver.get("https://fibertest.net/");
        System.out.println(driver.getTitle());
        WebElement startTest =driver.findElement(By.id("_inner_img"));
                startTest.click();

        try {
            Thread.sleep(80099);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement downSpeed =driver.findElement(By.id("dspeed"));
    WebElement upSpeed =driver.findElement(By.id("uspeed"));
    String D =downSpeed.getText();
    String U=upSpeed.getText();
    System.out.println( "download is "+D);
    System.out.println("upload is  " + U);

    driver.navigate().to("https:");
        try {
            Thread.sleep(9999);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String halan = "ha";
        WebElement Halan =driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div[2]/form/div/div/div/input"));
        Halan.sendKeys(halan);
        WebElement HalanEnter =driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div[2]/form/button"));
        HalanEnter.click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement HalanEntermail =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/form/p[1]/input"));
        HalanEntermail.click();

        String halanMail = "********";
        WebElement HalanMail =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/p[2]/input"));
        HalanMail.sendKeys(halanMail);

        String halanPass = "*******";
        WebElement HalanPass1 =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/p[3]/input"));
        HalanPass1.sendKeys(halanPass);
        WebElement HalanSubmit =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/p[4]/button"));
        HalanSubmit.click();
        try {
            Thread.sleep(9999);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement clickText=driver.findElement(By.xpath("//div[@aria-label='Message ']//p"));
        clickText.click();
        WebElement SendMesg =driver.findElement(By.xpath("//div[@aria-label='Message ']//p"));
        SendMesg.sendKeys(" According to Fiber Test | Gigabit internet speed test The download speed is   " + D);
        SendMesg.sendKeys("  &    The upload speed is  " + U);
        WebElement HalanSend =driver.findElement(By.xpath("//i[@type='paperplane-filled']"));
        HalanSend.click();


    }
    public static void main (String args[]){
 test koks = new test() ;
koks.setup();
    }
}

