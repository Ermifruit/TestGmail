package forms;

import newtest.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class PasswordForm extends BaseElement {
    private String cssPasswordField = "#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input";

    public PasswordForm() throws IOException {
    }

    /**
     * Set Password.
     *
     * @password email user Password.
     */
    public void setPassword(String email){
        WebElement passwordField = driver.findElement(By.cssSelector(cssPasswordField));
        passwordField.sendKeys(password);
    }
}
