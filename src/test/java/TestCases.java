import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.sun.activation.registries.LogSupport.log;
import static org.junit.Assert.assertEquals;

/**
 * Created by svetlana on 24.01.16
 */
public class TestCases {

    WebDriver driver;
    Instructions commentPge;

    @Before
    public void setup(){
        driver = new FirefoxDriver();
        commentPge = new Instructions(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://comments.azurewebsites.net/");
    }

    @After
    public void closeBrowser() throws IOException {
        driver.quit();
    }

    @Test
    public void createComment() {
        log("Open page with comments");
        commentPge.clickOnNewButton();

        log("Write text inside the comment Text");
        commentPge.setTextToTheCommentText("MyCommentSveta");

        log("Write date inside the number field");
        commentPge.setTextToTheNumberField("432");

        log("Select Category");
        commentPge.clickOnCategory();

        log("Click on the button CurSelect");
        commentPge.clickOnCurrentSelection();

        log("Click save button");
        commentPge.clickOnSaveButton();

        log("Click button Return");
        commentPge.clickOnReturnButton();

        log("Sort rows by id");
        commentPge.sortRows();

        log("Assert that line has correct Id");
        assertEquals(commentPge.getIdValue().getText(),"432");
    }
}
