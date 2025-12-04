package starter.nautics;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class LoginForm  extends UIInteractions {

    @FindBy(xpath = "//body/app-root[1]/app-root[1]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
    private WebElementFacade username;

    @FindBy(xpath = "//body/app-root[1]/app-root[1]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    private WebElementFacade password;

    @FindBy(xpath = "//button[contains(text(),'Sign In')]")
    private WebElementFacade loginButton;

    public void login() throws InterruptedException {
        typeInto(username,"test");
        typeInto(password,"test");
        clickOn(loginButton);

        Thread.sleep(5000);

      

//        $(By.name(username)).sendKeys("test");
//        $(By.name(password)).sendKeys("test");

//
    }
    public void assertThatUserIsOnLoginPage(){
        waitABit(3000);
        shouldBeVisible(By.xpath("//a[contains(text(),'Create Customer')]"));
    }
}
