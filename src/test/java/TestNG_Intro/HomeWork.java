package TestNG_Intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork extends TestBase {

    @Test
    public static void test()throws Exception{
        driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
        WebElement bankButton=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        WebElement account=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        WebElement Button500=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement amount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
        WebElement sales=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
        WebElement targetAccountCredit=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
        WebElement Button5000Credit=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement targetAmountCredit=driver.findElement(By.xpath("//li[@class='placeholder']"));
        Actions action=new Actions(driver);
        action.dragAndDrop(bankButton,account).perform();
        action.dragAndDrop(Button500,amount).perform();
        action.dragAndDrop(sales,targetAccountCredit).perform();
        Thread.sleep(5000);
        action.dragAndDrop(Button5000Credit,targetAmountCredit).perform();
           }

           @Test
    public static void  test2(){
        driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");

        WebElement id=driver.findElement(By.xpath("//input[@name='cusid']"));
        id.sendKeys("123");
        WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
               submit.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();


           }

           @Test
    static public void test3(){

        driver.get("http://demo.guru99.com/test/upload/");
        WebElement upload=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
        upload.sendKeys("C:\\Users\\nurik\\Desktop\\Agile.rtf");
        WebElement acceptButton=driver.findElement(By.xpath("//input[@id='terms']"));
        acceptButton.click();
        WebElement submitFile=driver.findElement(By.xpath("//button[@id='submitbutton']"));
        submitFile.click();
        WebElement text=driver.findElement(By.xpath("//*[@id=\"res\"]/center"));
               Assert.assertEquals(text.getText(),"1 file \n" +
                       "has been successfully uploaded.");

           }
           @Test
    static public void test4(){
        driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement doubleClick=driver.findElement(By.xpath("//body[@id='authentication']"));
        Actions action=new Actions(driver);
        action.doubleClick();
        Alert alert=driver.switchTo().alert();
        alert.accept();


           }

}
