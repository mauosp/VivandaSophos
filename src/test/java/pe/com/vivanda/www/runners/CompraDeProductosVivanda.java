package pe.com.vivanda.www.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/pe/com/vivanda/www/features/compra_de_productos_vivanda.feature",    
glue="pe.com.vivanda.www.stepdefinitions",     
snippets=SnippetType.CAMELCASE)

public class CompraDeProductosVivanda {

}
