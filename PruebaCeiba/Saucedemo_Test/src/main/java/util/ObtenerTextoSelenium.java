package util;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.SerenityWebdriverManager;

public class ObtenerTextoSelenium {
    private ObtenerTextoSelenium() {

    }

    public static String textoWebElement(Target target) {
        return  SerenityWebdriverManager.inThisTestThread()
                .getCurrentDriver()
                .findElement(By.cssSelector(target.getCssOrXPathSelector()))
                .getText();
    }

}
