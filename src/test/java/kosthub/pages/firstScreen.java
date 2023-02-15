package kosthub.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class firstScreen {
    WebDriverWait wait;
    AndroidDriver driver;

    public firstScreen(WebDriverWait wait, AndroidDriver driver){
        this.wait=wait;
        this.driver=driver;
    }

    By nextButton = By.id("com.example.kosthub:id/btn_next");
    By startButton = By.id("com.example.kosthub:id/btn_mulai");
    By skipButton = By.id("com.example.kosthub:id/btn_lewati");
    By logo = By.id("com.example.kosthub:id/img");

    public void clickNextButton(){
        driver.findElement(nextButton).click();
    }
    public void clickStartButton(){
        driver.findElement(startButton).click();
    }
    public void clickSkipButton(){
        driver.findElement(skipButton).click();
    }

    public void validateInFirstPage(){wait.until(ExpectedConditions.presenceOfElementLocated(logo));}
}
