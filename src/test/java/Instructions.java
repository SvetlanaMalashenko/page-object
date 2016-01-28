import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by svetlana on 24.01.16
 */
public class Instructions {

    WebDriver driver;

    public Instructions(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnNewButton() {
       driver.findElement(By.cssSelector("input[value*= 'New']")).click();
    }

    public void setTextToTheCommentText(String commentText) {
        driver.findElement(By.cssSelector("input[id*= 'Text']")).sendKeys(commentText);
    }

    public void setTextToTheNumberField(String number) {
        driver.findElement(By.cssSelector("input[id*='Number']")).sendKeys(number);
    }

    public void clickOnCategory() {
       driver.findElement(By.cssSelector("input[value*='1']")).click();
    }

    public void clickOnCurrentSelection() {
       driver.findElement(By.cssSelector("input[name*='CurSelect']")).click();
    }

    public void clickOnSaveButton() {
       driver.findElement(By.cssSelector("input[value*='Save']")).click();
    }

    public void clickOnReturnButton() {
      driver.findElement(By.tagName("a")).click();
    }

    public void sortRows() {
      driver.findElement(By.cssSelector("a[href*='Text&Text=DESC']")).click();
    }

    public WebElement getIdValue() {
      return driver.findElement(By.cssSelector("td[class*= 'numbercolumn']"));
    }
}