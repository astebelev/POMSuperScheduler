package screenobjects;

import dto.Credentials;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreen extends BaseScreen{
    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/log_email_input']")
    MobileElement emailEditText;

    @AndroidFindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/log_password_input']")
    MobileElement passwordEditText;

    @AndroidFindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/login_btn']")
    MobileElement loginButton;

    @AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
    MobileElement errorMessage;

    public LoginScreen fillEmail(String email){
        type (emailEditText,email);
        return this;
    }
    public LoginScreen fillPassword(String password){
        type (passwordEditText,password);
        return this;
    }

    public WizardScreen clickLogin(){
        hideKeyboard();
        loginButton.click();
        return new WizardScreen(driver);
    }
    public WizardScreen completeLogin(Credentials credentials){
        type(emailEditText, credentials.getEmail());
        type(passwordEditText,credentials.getPassword());
        hideKeyboard();
        loginButton.click();
        return new WizardScreen(driver);
    }

    public LoginScreen completeLoginNeg(Credentials credentials){
        //login
        type(emailEditText, credentials.getEmail());
        type(passwordEditText,credentials.getPassword());
        hideKeyboard();
        loginButton.click();

        return this;
    }
    public String errorMessage(){
        return errorMessage.getText();
    }

}
