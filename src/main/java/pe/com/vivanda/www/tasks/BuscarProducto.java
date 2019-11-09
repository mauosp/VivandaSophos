package pe.com.vivanda.www.tasks;


import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import pe.com.vivanda.www.userinterfaces.VivandaHomePage;

public class BuscarProducto implements Task{
	
	private String productos;
	
	public BuscarProducto(String productos) {
		this.productos = productos;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(productos).into(VivandaHomePage.BARRA_DE_BUSQUEDA).thenHit(Keys.ENTER));
	}
	
	
	public static BuscarProducto enVivanda(String productos) {
		return new BuscarProducto(productos);
	}
}
