package starter.nautics;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.support.FindBy;

public class OrdersPage extends UIInteractions {

    @FindBy(id = "b6-TooltipWrapper")
    private WebElementFacade addOrderButton;

    @FindBy(id = "//span[contains(text(),'New Purchase Order')]")
    private WebElementFacade newPurchaseOrderText;

    public PurchaseOrderPage addOrder(){
        clickOn(addOrderButton);
        return new PurchaseOrderPage();
    }

}
