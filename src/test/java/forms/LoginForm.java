package forms;

import newtest.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginForm extends BaseElement {
    private String cssEmailField = "#identifierId";

    public LoginForm() throws IOException {
    }

    /**
     * Set Email.
     *
     * @param email user Email.
     */
    public void setEmail(String email){
        WebElement emailField = driver.findElement(By.cssSelector(cssEmailField));
        emailField.sendKeys(email);
    }

}
