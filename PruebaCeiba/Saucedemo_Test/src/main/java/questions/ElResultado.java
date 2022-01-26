package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import util.ObtenerTextoSelenium;

public class ElResultado implements Question<String> {

    private Target mensajeMostrado;

    public ElResultado(Target mensajeMostrado){
        this.mensajeMostrado = mensajeMostrado;
    }

    @Override
    public String answeredBy(Actor actor) {

     return Text.of(mensajeMostrado).viewedBy(actor).asString().replace('\n',' ');

    }

    public static ElResultado para(Target mensajeMostrado) {
        return new ElResultado(mensajeMostrado);
    }

}
