package starter.nautics;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SerenityJUnit5Extension.class)
class WhenNavigatingToHomePage {

    /**
     * Define the webdriver instance to be u    sed for these tests
     */
    @Managed(driver = "chrome", options = "chro")
    WebDriver driver;

    /**
     * Navigation actions. This is a UIInteraction class so it will be instantiated automatically by Serenity.
     */
    NavigateActions navigate;

    /**
     * Actions related to searches. This is a UIInteraction class so it will be instantiated automatically by Serenity.
     */
    SearchActions search;

    /**
     * A page object representing a Wikipedia article that is currently appearing in the browser.
     * Page Objects are automatically initialised by Serenity.
     */
    DisplayedArticle displayedArticle;
    LoginForm loginForm;
    OrdersPage ordersPage;
    CustomerManagement customerManagement;

    @Test
    void searchBySingleKeyword() throws InterruptedException {
        navigate.toTheHomePage();
        //Thread.sleep(5000);

        // loginForm.assertThatUserIsOnLoginPage();
        loginForm.login();


        loginForm.assertThatUserIsOnLoginPage();

        customerManagement.createCustomer();


    }
}
