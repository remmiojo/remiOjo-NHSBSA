package stepDef;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class Hook extends BaseUtil {
    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void innitialize() {

        //https://github.com/bonigarcia/webdrivermanager
        //Chrome:
        WebDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver();

        //Firefox:
//        WebDriverManager.firefoxdriver().setup();
//        base.driver = new FirefoxDriver();
    }

    @After
    public void teardown() throws InterruptedException, IOException {
        takeAScreenshot();
        Thread.sleep(2000);
        base.driver.quit();
    }

    private void takeAScreenshot() throws IOException {
        TakesScreenshot srcShot = ((TakesScreenshot) base.driver);
        File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile, new File("target/Screenshot" + System.currentTimeMillis() + ".png"));
    }

}
