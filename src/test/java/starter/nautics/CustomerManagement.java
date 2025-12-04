package starter.nautics;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.support.FindBy;

public class CustomerManagement extends UIInteractions {

    @FindBy(id = "inputFirstName")
    private WebElementFacade firstName;
    @FindBy(id = "inputLastName")
    private WebElementFacade lastName;


    @FindBy(xpath = "//a[contains(text(),'Create Customer')]")
    private WebElementFacade createCustomerButton;

    public void createCustomer() {
        clickOn(createCustomerButton);
        typeInto(firstName, "Niocolae");
        typeInto(lastName, "filip");
    }

}
