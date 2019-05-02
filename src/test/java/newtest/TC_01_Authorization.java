package newtest;

import org.testng.annotations.Test;
import pages.MainPage;

import java.io.IOException;
import java.util.logging.Logger;

public class TC_01_Authorization extends BaseTest {
    private Logger log = (Logger) Logger.getLogger(String.valueOf(TC_01_Authorization.class));

    public TC_01_Authorization() throws IOException {
    }

    @Test
    public void TC_01_Authorization() throws IOException, InterruptedException {
        log.info(String.format("=====Step1===== The page \"%s\" is open", projectUrl));
        MainPage mainPage = new MainPage();
        softAssert.assertTrue(mainPage.isMainLogo(), "Main logo is absent");
        log.info("=====Step2===== Email");
        mainPage.login();
        log.info("=====Step3===== Click next button");
        mainPage.clickNextButton();
        log.info("=====Step4===== password");
        mainPage.password();
        log.info("=====Step5===== loIn");
        mainPage.passwordNextButton();
        log.info("=====Step6===== Gmail logo");
        softAssert.assertTrue(mainPage.isGmailLogo(), "Gmain logo is absent");


    }
}
