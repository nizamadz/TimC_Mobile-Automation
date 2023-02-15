package kosthub.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class selectRolePage {
    WebDriverWait wait;
    AndroidDriver driver;

    public selectRolePage(WebDriverWait wait, AndroidDriver driver){
        this.wait=wait;
        this.driver=driver;
    }

    By pencariButton = By.id("com.example.kosthub:id/card_pencari");
    By pemilikButton = By.id("com.example.kosthub:id/card_pemilik");
    By skipButton = By.id("com.example.kosthub:id/tv_lewati");
    By chooseButton = By.id("com.example.kosthub:id/btn_pilih");

    public void clickpencariButton(){
        driver.findElement(pencariButton).click();
    }
    public void clickpemilikButton(){
        driver.findElement(pemilikButton).click();
    }
    public void clickskipButton(){
        driver.findElement(skipButton).click();
    }
    public void clickchooseButton(){
        driver.findElement(chooseButton).click();
    }

//    public void validateinfirstPage(){wait.until(ExpectedConditions.presenceOfElementLocated());}
}
