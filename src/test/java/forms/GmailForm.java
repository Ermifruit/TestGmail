package forms;

import newtest.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class GmailForm extends BaseElement  {
    private String cssLogOutButton = "#gb_71";
    public GmailForm() throws IOException {
    }

    public void clickLogOutButon()throws IOException{
        WebElement LogOutButton = driver.findElement(By.cssSelector(cssLogOutButton));
        LogOutButton.click();

    }

}
