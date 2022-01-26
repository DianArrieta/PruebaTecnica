package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.ElementosPaginaLogin.*;

public class IniciarSesion implements Task {

    private String username;
    private String password;

    public IniciarSesion (String username, String password){
        this.username= username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            Enter.theValue(username).into(USER_NAME),
            Enter.theValue(password).into(PASSWORD),
            Click.on(BOTON_LOGIN)
        );
    }

    public static IniciarSesion enLaPagina(String username, String password) {
        return instrumented(IniciarSesion.class, username, password);
    }
}
