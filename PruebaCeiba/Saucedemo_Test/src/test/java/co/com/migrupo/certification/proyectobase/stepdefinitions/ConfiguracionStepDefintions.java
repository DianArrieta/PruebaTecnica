package co.com.migrupo.certification.proyectobase.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ConfiguracionStepDefintions {

    @Managed(driver = "chrome")
    private WebDriver hisDriver;
    private Actor user = Actor.named("user");


    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Actor");
        user.can(BrowseTheWeb.with(hisDriver));
        }

    @After
    public void closeDriver(){
        hisDriver.quit();
    }
}
