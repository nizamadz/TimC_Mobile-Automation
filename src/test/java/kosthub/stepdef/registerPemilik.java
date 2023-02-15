package kosthub.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kosthub.Base;
import kosthub.pages.Register;
import kosthub.pages.TermsOfServicePage;
import kosthub.pages.firstScreen;
import kosthub.pages.selectRolePage;

public class registerPemilik extends Base {

    firstScreen firstScreen =new firstScreen(wait,driver);
    selectRolePage selectRolePage =new selectRolePage(wait,driver);
    
    Register register = new Register(wait,driver);
    TermsOfServicePage tos = new TermsOfServicePage(wait,driver);
    @Given("user on first page")
    public void userOnFirstPage(){
        firstScreen.validateInFirstPage();
    }

    @And("user click next button thrice")
    public void clickThrice(){
        firstScreen.clickNextButton();
        firstScreen.clickNextButton();
        firstScreen.clickNextButton();
    }

    @And("user click start button")
    public void userClickStartButton() {
        firstScreen.clickStartButton();
    }

    @And("user select role pemilik")
    public void userSelectRolePemilik() {
        selectRolePage.clickpemilikButton();
        selectRolePage.clickchooseButton();
    }

    @And("user input email {string}")
    public void userUserInputEmail(String email) {
        register.inputEmail(email);
    }

    @And("user input password{string}")
    public void userInputPassword(String password) {
        register.inputPasswordTextBox(password);
    }

    @And("user input confirmation password{string}")
    public void userInputConfirmationPassword(String confirmPass) {
        register.inputConfirmationPasswordTextBox(confirmPass);
    }

    @And("user input phone{string}")
    public void userInputPhoneNumber(String phone) {
        register.inputPhoneNumberTextBox(phone);
    }

    @When("user click register")
    public void userClickRegister() {
        register.clickRegisterButton();
    }

    @Then("user in TOS page")
    public void userInTOSPage() {
        tos.validateInTOSPage();
    }
}
