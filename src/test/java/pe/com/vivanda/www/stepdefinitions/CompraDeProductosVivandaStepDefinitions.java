package pe.com.vivanda.www.stepdefinitions;


import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import pe.com.vivanda.www.questions.DescripcionVino;
import pe.com.vivanda.www.tasks.AgregarAlCarrito;
import pe.com.vivanda.www.tasks.BuscarProducto;
import pe.com.vivanda.www.tasks.ValidarProductosEnCarrito;

public class CompraDeProductosVivandaStepDefinitions {
	
	private Actor User = Actor.named("Comprador");
	
	@Given("^El usuario ingresa a la pagina de Vivanda$")
	public void elUsuarioIngresaALaPaginaDeVivanda() throws InterruptedException {
		User.can(BrowseTheWeb.with(pe.com.vivanda.www.drivers.MyOwnDriver.web().inTheWebPage("http://www.vivanda.com.pe")));
	}


	@Given("^Ingresa el nombre del producto a buscar (.*)$")
	public void ingresaElNombreDelProductoABuscar(String productos) throws InterruptedException {
		User.attemptsTo(BuscarProducto.enVivanda(productos));
	}
	
	

	@When("^Agrega el producto al carrito de compras$")
	public void agregaElProductoAlCarritoDeCompras() {
		User.attemptsTo(AgregarAlCarrito.enVivanda());
	}

	@Then("^Se visualiza el producto en el carrito de compras$")
	public void seVisualizaElProductoEnElCarritoDeCompras() throws InterruptedException {
		User.attemptsTo(ValidarProductosEnCarrito.enVivanda());
		User.should(seeThat(DescripcionVino.onScreen(), Matchers.is("Vino Blanco LOS HAROLDOS Sauvignon Blanc Botella 750ml")));		
	}

}
