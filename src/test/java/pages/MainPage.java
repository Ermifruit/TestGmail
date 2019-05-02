package pages;

import forms.GmailForm;
import forms.PasswordForm;
import forms.SendForm;
import newtest.BaseElement;
import forms.LoginForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.IOException;


public class MainPage extends BaseElement {
    private String xPathMainLogo = "//*[contains(@class,'qZp31e')]";
    private String cssLoginNextButton = "#identifierNext > content > span";
    private String cssPasswordNext = "#passwordNext > content > span";
    private String cssGmailLogo = "#\\3a 3z > div > div";
    private String xPathProfileButton = "//*[contains(@class,'gb_ya gbii')]";
    private String cssSendGmailButton = ".aic .z0 div";
    private String xPathClickButtonSendMessage = "//*[contains(@class,'T-I J-J5-Ji aoO v7 T-I-atl L3')]";
    private String xPathChekSendMail = "//*[contains(@aria-label,'Входящие 1')]";
    private LoginForm loginForm = new LoginForm();
    private PasswordForm passwordForm = new PasswordForm();
    private GmailForm gmailForm = new GmailForm();
    private SendForm sendForm = new SendForm();





    public MainPage() throws IOException {

    }

    public boolean isMainLogo(){
        WebElement mainLogo = driver.findElement(By.xpath(xPathMainLogo));
        return mainLogo.isDisplayed();
    }
    public boolean sendMail(){
        WebElement sendCheck = driver.findElement(By.xpath(xPathChekSendMail));
        return sendCheck.isDisplayed();
    }

    public void login(){
        loginForm.setEmail(login);
    }

    public void clickNextButton(){
        WebElement nextButton = driver.findElement(By.cssSelector(cssLoginNextButton));
        nextButton.click();
    }

    public void password(){
        passwordForm.setPassword(password);
    }

    public void passwordNextButton(){
        WebElement nextPasswordButton = driver.findElement(By.cssSelector(cssPasswordNext));
        nextPasswordButton.click();
    }

    public boolean isGmailLogo(){
        WebElement gmailLogo = driver.findElement(By.cssSelector(cssGmailLogo));
        return gmailLogo.isDisplayed();
    }

    public void clickProfileButon(){
        WebElement profileButton = driver.findElement(By.xpath(xPathProfileButton));
        profileButton.click();
    }

    public void logout() throws IOException {
        gmailForm.clickLogOutButon();
    }

    public void sendGmailButton (){
        WebElement sendButton = driver.findElement(By.cssSelector(cssSendGmailButton));
        sendButton.click();
    }

    public void clickSendMessage(){
        WebElement sendMessage = driver.findElement(By.xpath(xPathClickButtonSendMessage));
        sendMessage.click();
    }

    public void adress(){
        sendForm.gmailAdress();
    }

    public void topic(){
        sendForm.gmailTopic();
    }

    public void text(){
        sendForm.gmailText();
    }



}
