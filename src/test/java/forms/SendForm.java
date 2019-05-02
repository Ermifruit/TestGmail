package forms;

import newtest.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class SendForm extends BaseElement {
    private String cssGmailAdress = ".oj div textarea";
    private String cssTopicMessage = ".aoD.az6 input";
    private String cssText = ".Ar.Au div";



    public SendForm() throws IOException {
    }

    public void gmailAdress(){
        WebElement adres = driver.findElement(By.cssSelector(cssGmailAdress));
        adres.sendKeys("Viktar.Prakopchyk1991@gmail.com");
    }


    public void gmailTopic(){
        WebElement topic = driver.findElement(By.cssSelector(cssTopicMessage));
        topic.sendKeys("AutoSendMail");
    }

    public void gmailText(){
        WebElement text = driver.findElement(By.cssSelector(cssText));
        text.sendKeys("Auto Auto Auto");
    }

}
