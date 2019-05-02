package newtest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;

import java.io.IOException;
import java.util.logging.Logger;

public class TC_02_LogOut extends BaseTest {
    MainPage mainPage = new MainPage();
    private Logger log = (Logger) Logger.getLogger(String.valueOf(TC_02_LogOut.class));

    public TC_02_LogOut() throws IOException {

    }

    @BeforeClass
    public void authorization() throws IOException {
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
    public void TC_02_Log_Out() throws IOException, InterruptedException {
        log.info("=====Step1===== Click profile button");
        mainPage.clickProfileButon();
        log.info("=====Step2===== LogOut");
        mainPage.logout();
        log.info("=====Step3===== Chek logo main page");
        softAssert.assertTrue(mainPage.isMainLogo(), "Main logo is absent");
    }
}
