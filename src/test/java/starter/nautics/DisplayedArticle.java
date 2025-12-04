package starter.nautics;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DisplayedArticle extends PageComponent {

    @FindBy(xpath = "//a[contains(text(),'Create Customer')]")
    private WebElementFacade firstHeading;

    public String getFirstHeading() {

        return firstHeading.getText();
    }

}
