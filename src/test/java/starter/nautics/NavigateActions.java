package starter.nautics;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

/**
 * UIInteractionSteps let us define action classes which regroup related actions.
 * The @Step annotation is used to indicate that this action will appear as a step in the reports.
 */
public class NavigateActions extends UIInteractions {
    @Step("Navigate to the home page")
    public void toTheHomePage() {
        openUrl("https://credendo-tst1.outsystemsenterprise.com/Terms/Business");

    }
//    public void toLogIn(){
//        openUrl("https://navylead.iqnautics.com/#/login");
//    }


}
