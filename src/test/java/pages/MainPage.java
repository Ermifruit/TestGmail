package pages;

import forms.GmailForm;
import forms.PasswordForm;
import newtest.BaseElement;
import forms.LoginForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.IOException;


public class MainPage extends BaseElement {
    private String cssMainLogo = "#logo";
    private String cssLoginNextButton = "#identifierNext > content > span";
    private String cssPasswordNext = "#passwordNext > content > span";
    private String cssGmailLogo = "#gb > div.gb_gd.gb_Md.gb_od > div.gb_lc.gb_qc.gb_la.gb_sc > div.gb_Rb > div > a";
    private String cssProfileButton = "#gb > div.gb_gd.gb_Md.gb_od > div.gb_mc.gb_Ja.gb_lc.gb_Jd > div > div.gb_Ea.gb_Fc.gb_7f.gb_f.gb_hf > div > a";
    private LoginForm loginForm = new LoginForm();
    private PasswordForm passwordForm = new PasswordForm();
    private GmailForm gmailForm = new GmailForm();




    public MainPage() throws IOException {
    }

    public boolean isMainLogo(){
        WebElement mainLogo = driver.findElement(By.cssSelector(cssMainLogo));
        return mainLogo.isDisplayed();
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
        WebElement profileButton = driver.findElement(By.cssSelector(cssProfileButton));
        profileButton.click();
    }

    public void logout() throws IOException, InterruptedException {
        gmailForm.clickLogOutButon();
    }





}
