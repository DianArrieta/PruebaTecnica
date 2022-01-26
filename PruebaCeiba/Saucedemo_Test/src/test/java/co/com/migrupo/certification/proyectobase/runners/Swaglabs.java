package co.com.migrupo.certification.proyectobase.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/tienda.feature",
        glue = "co.com.migrupo.certification.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class Swaglabs {
}
