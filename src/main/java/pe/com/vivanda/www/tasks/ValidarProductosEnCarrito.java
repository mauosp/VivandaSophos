package pe.com.vivanda.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import pe.com.vivanda.www.interactions.EsperarDisponibilidad;
import pe.com.vivanda.www.userinterfaces.VivandaHomePage;

public class ValidarProductosEnCarrito implements Task{
		
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(EsperarDisponibilidad.segundos(9));
		actor.attemptsTo(Click.on(VivandaHomePage.CARRITO_DE_COMPRAS));
	}
	
	public static ValidarProductosEnCarrito enVivanda() {
		return new ValidarProductosEnCarrito();
	}
}
