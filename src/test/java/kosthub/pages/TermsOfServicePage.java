package kosthub.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TermsOfServicePage {
    WebDriverWait wait;
    AndroidDriver driver;

    public TermsOfServicePage(WebDriverWait wait, AndroidDriver driver){
        this.wait=wait;
        this.driver=driver;
    }

    By cancelButton = By.id("com.example.kosthub:id/btn_batal");
    By agreeButton = By.id("com.example.kosthub:id/btn_setuju");
    By header = By.id("com.example.kosthub:id/tv_termOfService");

    public void clickCancelButton(){
        driver.findElement(cancelButton).click();
    }
    public void clickAgreeButton(){
        driver.findElement(agreeButton).click();
    }

    public void validateInTOSPage(){wait.until(ExpectedConditions.presenceOfElementLocated(header));}
}
