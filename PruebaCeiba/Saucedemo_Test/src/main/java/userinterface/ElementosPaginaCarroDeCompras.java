package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosPaginaCarroDeCompras extends PageObject {

    public static final Target BOTON_CHECKOUT = Target.the("Botón finalizar compra").located(By.id("checkout"));
}
