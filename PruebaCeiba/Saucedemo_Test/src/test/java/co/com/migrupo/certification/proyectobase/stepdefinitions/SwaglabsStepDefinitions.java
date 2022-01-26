package co.com.migrupo.certification.proyectobase.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.hamcrest.Matchers;
import questions.ElResultado;
import tasks.AbrirNavegador;
import tasks.AgregarProducto;
import tasks.IniciarSesion;
import userinterface.PaginaPrincipal;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterface.ElementosPaginaConfirmacionCompra.MENSAJE_COMPRA_EXITOSA;
import static userinterface.ElementosPaginaInventario.INVENTARIO;
import static userinterface.ElementosPaginaLogin.MENSAJE_USUARIO_BLOQUEADO;

public class SwaglabsStepDefinitions {

    @Dado("^que el usuario ingresa a la pagina$")
    public void queElUsuarioIngresaALaPagina() throws Exception {
        theActorInTheSpotlight().wasAbleTo(AbrirNavegador.on(new PaginaPrincipal()));
    }

    @Cuando("^el usuario ingresa a la pagina con las credenciales: \"([^\"]*)\" y \"([^\"]*)\"$")
    public void elUsuarioIngresaALaPaginaConLasCredencialesY(String username, String password) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.enLaPagina(username,password)
        );
    }

    @Entonces("^el puede ver el inventario de productos$")
    public void elPuedeVerElInventarioDeProductos() throws Exception {
        theActorInTheSpotlight().should(
                seeThat(the(INVENTARIO), isVisible())
        );
    }

    @Entonces("^el puede ver un mensaje de error \"([^\"]*)\"$")
    public void elPuedeVerUnMensajeDeError(String mensajeEsperado) throws Exception {
        theActorInTheSpotlight().should(
                seeThat(ElResultado.para(MENSAJE_USUARIO_BLOQUEADO), Matchers.is(mensajeEsperado.trim()))
        );
    }

    @Cuando("^realiza la compra del producto \"([^\"]*)\"$")
    public void
    realizaLaCompraDelProducto(String producto) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                AgregarProducto.delInventario(producto)
        );
    }

    @Entonces("^el puede ver el mensaje de confirmacion \"([^\"]*)\"$")
    public void elPuedeVerElMensajeDeConfirmacion(String mensaje) throws Exception {
        theActorInTheSpotlight().should(
                seeThat(ElResultado.para(MENSAJE_COMPRA_EXITOSA), Matchers.is(mensaje))
        );
    }

}
