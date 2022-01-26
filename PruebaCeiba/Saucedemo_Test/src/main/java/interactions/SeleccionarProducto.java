package interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.WebElement;

public class SeleccionarProducto implements Interaction {

    private String productoAAgregar;

    SeleccionarProducto (String productoAAgregar ){
        this.productoAAgregar=productoAAgregar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String xpath = "//div[contains(text(),'" + productoAAgregar +"')]/ancestor::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']/button";
        WebElement element = SerenityWebdriverManager.inThisTestThread()
                .getCurrentDriver()
                .findElement(By.xpath(xpath));

        element.click();

    }


    public static SeleccionarProducto delInventario(String productoAAgregar){
        return new SeleccionarProducto(productoAAgregar);
    }
}
