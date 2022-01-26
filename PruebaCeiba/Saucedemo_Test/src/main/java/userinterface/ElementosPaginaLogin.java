package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosPaginaLogin extends PageObject {

    public static final Target USER_NAME = Target.the("Ingresar username").located(By.id("user-name"));

    public static final Target PASSWORD = Target.the("Ingresar password").located(By.id("password"));

    public static final Target BOTON_LOGIN = Target.the("Boton login").located(By.id("login-button"));

    public static final Target MENSAJE_USUARIO_BLOQUEADO = Target.the("Mensaje de error usuario bloqueado").locatedBy("//button[@class='error-button']/ancestor::h3");
}
