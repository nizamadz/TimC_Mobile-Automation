package kosthub.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Register {
    WebDriverWait wait;
    AndroidDriver driver;

    public Register(WebDriverWait wait, AndroidDriver driver){
        this.wait=wait;
        this.driver=driver;
    }

    By emailTextBox = By.id("com.example.kosthub:id/edt_email");
    By phoneNumberTextBox = By.id("com.example.kosthub:id/edt_phone_number");
    By passwordTextBox = By.id("com.example.kosthub:id/edt_password");
    By confirmationPasswordTextBox = By.id("com.example.kosthub:id/editTextRepeatPassword");
    By registerButton = By.id("com.example.kosthub:id/btn_daftar");
    By registerAsPemilikButton=By.id("com.example.kosthub:id/tv_daftarSebagaiPemilikKos");
    By login= By.id("com.example.kosthub:id/tv_sudahPunyaAkun");
    By LoginWithGmailButton = By.id("com.example.kosthub:id/btn_loginMelaluiGmail");
    By backButton = By.id("com.example.kosthub:id/btn_back");
    By header = By.id("com.example.kosthub:id/tv_buatAkun");

    public void inputEmail(String email){driver.findElement(emailTextBox).sendKeys(email);}
    public void inputPhoneNumberTextBox(String phoneNumber){driver.findElement(phoneNumberTextBox).sendKeys(phoneNumber);}
    public void inputPasswordTextBox(String password){driver.findElement(passwordTextBox).sendKeys(password);}
    public void inputConfirmationPasswordTextBox(String confirmationPassword){driver.findElement(confirmationPasswordTextBox).sendKeys(confirmationPassword);}

    public void clickLoginWithGmailButton(){driver.findElement(LoginWithGmailButton).click();}
    public void clickLoginButton(){driver.findElement(login).click();}
    public void clickRegisterButton(){driver.findElement(registerButton).click();}
    public void clickRegisterAsPemilikButton(){driver.findElement(registerAsPemilikButton).click();}
    public void clickBackButton(){driver.findElement(backButton).click();}

    public void validateInRegisterPage(){wait.until(ExpectedConditions.presenceOfElementLocated(header));}
}
