package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosPaginaInventario extends PageObject {

    public static final Target INVENTARIO = Target.the("Ingresar username").located(By.id("inventory_container"));
    public static final Target CARRITO = Target.the("Botón agregar al carrito").located(By.className("shopping_cart_badge"));
}
