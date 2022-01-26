package tasks;

import interactions.SeleccionarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.ElementosPaginaCarroDeCompras.BOTON_CHECKOUT;
import static userinterface.ElementosPaginaConfirmacionCompra.*;
import static userinterface.ElementosPaginaInventario.CARRITO;

public class AgregarProducto implements Task {

    private String producto;

    public AgregarProducto(String producto){
        this.producto= producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarProducto.delInventario(producto),
                Click.on(CARRITO),
                Click.on(BOTON_CHECKOUT),
                Enter.theValue("user").into(FIRST_NAME),
                Enter.theValue("Automation").into(LAST_NAME),
                Enter.theValue("01001").into(ZIP_CODE),
                Click.on(BOTON_CONTINUE),
                Click.on(BOTON_FINISH)
        );
    }

    public static AgregarProducto delInventario(String producto) {
        return instrumented(AgregarProducto.class, producto);
    }
}
