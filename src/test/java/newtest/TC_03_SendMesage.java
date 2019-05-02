package newtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;

import java.io.IOException;
import java.util.logging.Logger;

public class TC_03_SendMesage extends BaseTest {
    MainPage mainPage = new MainPage();
    private Logger log = (Logger) Logger.getLogger(String.valueOf(TC_03_SendMesage.class));

    public TC_03_SendMesage() throws IOException {
    }

    @BeforeClass
    public void TC_01_Authorization() throws IOException {
        log.info(String.format("=====Step1===== The page \"%s\" is open", projectUrl));
        softAssert.assertTrue(mainPage.isMainLogo(), "Main logo is absent");
        log.info("=====Step2===== Email");
        mainPage.login();
        log.info("=====Step3===== Click next button");
        mainPage.clickNextButton();
        log.info("=====Step4===== password");
        mainPage.password();
        log.info("=====Step5===== logIn");
        mainPage.passwordNextButton();

    }

    @Test
    public void TC_03_SendMesage() throws IOException {
        log.info("=====Step5===== click send button");
        mainPage.sendGmailButton();
        log.info("=====Step6===== write address");
        mainPage.adress();
        log.info("=====Step7===== write topic");
        mainPage.topic();
        log.info("=====Step8===== write text");
        mainPage.text();
        log.info("=====Step9===== click send message");
        mainPage.clickSendMessage();
        softAssert.assertTrue(mainPage.sendMail(), "message delivered");
    }

    @AfterClass
    public void TC_02_Log_Out() throws IOException, InterruptedException {
        log.info("=====Step10===== Click profile button");
        mainPage.clickProfileButon();
        log.info("=====Step11===== LogOut");
        mainPage.logout();
        log.info("=====Step12===== Chek logo main page");
        softAssert.assertTrue(mainPage.isMainLogo(), "Main logo is absent");
    }
}