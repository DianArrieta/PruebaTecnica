package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosPaginaConfirmacionCompra extends PageObject {

    public static final Target FIRST_NAME = Target.the("First name").located(By.id("first-name"));

    public static final Target LAST_NAME = Target.the("last name").located(By.id("last-name"));

    public static final Target ZIP_CODE = Target.the("Codigo postal").located(By.id("postal-code"));

    public static final Target BOTON_CONTINUE = Target.the("Botón finalizar compra").located(By.id("continue"));

    public static final Target BOTON_FINISH = Target.the("Botón finalizar compra").located(By.id("finish"));

    public static final Target MENSAJE_COMPRA_EXITOSA = Target.the("Mensaje compra exitosa").located(By.xpath("//*[@id='checkout_complete_container']/h2"));
}
