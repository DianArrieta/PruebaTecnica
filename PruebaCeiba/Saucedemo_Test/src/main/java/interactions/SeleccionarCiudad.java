package interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.WebElement;

import java.util.List;

import static util.ConstantesString.INNER_HTML;

public class SeleccionarCiudad implements Interaction {

    private String ciudadRequerida;
    private Target target;

    public SeleccionarCiudad(String ciudadRequerida, Target target){
        this.ciudadRequerida = ciudadRequerida;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElement> ciudades = SerenityWebdriverManager.inThisTestThread()
                .getCurrentDriver()
                .findElements(By.cssSelector(target.getCssOrXPathSelector()));

        for (WebElement ciudad : ciudades) {
            if (ciudad.getAttribute(INNER_HTML).contains(ciudadRequerida)) {
                ciudad.click();
                break;
            }
        }
    }

    public static SeleccionarCiudad deResidencia(String ciudadRequerida, Target target){
        return new SeleccionarCiudad(ciudadRequerida,target);
    }



}
