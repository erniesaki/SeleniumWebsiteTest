package SeleniumWebTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ChromeDriverTest {
    private static WebDriver driver;
    @Before
    public void setup()  {
        //System.setProperty("webdriver.chrome.driver","C:\\filepath\\chromedriver.exe");
        driver = new ChromeDriver(); }
    @Test
    public void exampleSelenium() throws InterruptedException{
        driver.manage().window().fullscreen();
        driver.get("http://www.google.com/");
        WebElement googleSearchField = driver.findElement(By.name("q"));
        googleSearchField.sendKeys("gas gas gas");
        Thread.sleep(2000);
        googleSearchField.submit();
        Thread.sleep(2000);
        WebElement kahoot = driver.findElement(By.partialLinkText("Manuel - Gas Gas Gas"));
        kahoot.click();
        Thread.sleep(271000);
        driver.navigate().refresh();
        Thread.sleep(271000); }
    @Test
    public void gasGasGas() throws InterruptedException{
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.get("https://youtu.be/atuFSv2bLa8?t=1m18s");
        Thread.sleep(3000);
        for(int counter=0;counter<=10;counter++) {
            driver.navigate().refresh();
            Thread.sleep(2500); } }
    @Test
    public void shoppingWebsiteExcercise() throws InterruptedException{
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(1000);
        WebElement wbSrch = driver.findElement(By.name("search_query"));
        wbSrch.sendKeys("dress");
        Thread.sleep(2000);
        wbSrch.submit();
        Thread.sleep(2000);
        driver.get("http://automationpractice.com/index.php?id_product=7&controller=product&search_query=dress&results=7");
        Thread.sleep(2000);
    }
    @Test
    public void travelWebsiteExcercise() throws InterruptedException{
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.get("https://www.phptravels.net/");
        Thread.sleep(2000);
        driver.findElement(By.tagName("input")).sendKeys("London");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//html//li[@class='select2-results-dept-0 select2-result select2-result-unselectable select2-result-with-children']//li[1]/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[15]/div[@class='datepicker-days']/table//td[.='20']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='adults']//option[@value='3']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='body-section']/div[5]/div[3]/div/table/tbody/tr/td/div[2]/div/h4/a/b")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("tr:nth-child(8) [type='submit']")).click();
        Thread.sleep(4000);
    }
    @Test
    public void demoQA() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.get("http://www.demoqa.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@id='menu-interactions']//a[@href='http://demoqa.com/draggable/']")).click();
        Thread.sleep(3000);
        WebElement drag = driver.findElement(By.id("draggable"));
        actions.moveToElement(drag).clickAndHold().moveByOffset(300,300).release().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"tabs\"]/ul/li[2]")).click();
        Thread.sleep(3000);
        WebElement drag2 = driver.findElement(By.id("draggabl"));
        actions.moveToElement(drag2).clickAndHold().moveByOffset(0,300).release().perform();
        Thread.sleep(4000);
        WebElement drag3 = driver.findElement(By.id("draggabl2"));
        actions.moveToElement(drag3).clickAndHold().moveByOffset(300,0).release().perform();
        Thread.sleep(4000);
        driver.findElement(By.id("menu-item-142")).click();
        Thread.sleep(3000);
    }
    @After
    public void tearDown(){
        driver.quit(); }
}
