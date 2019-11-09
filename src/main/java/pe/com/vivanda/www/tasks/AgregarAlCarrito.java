package pe.com.vivanda.www.tasks;

import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import pe.com.vivanda.www.userinterfaces.VivandaShopPage;

public class AgregarAlCarrito implements Task{
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(VivandaShopPage.AGREGAR_VINO_BLANCO),
				Click.on(VivandaShopPage.DESPACHO_A_DOMICILIO), 
				Hit.the(Keys.ENTER).into(VivandaShopPage.MENU_DISTRITO),
				Hit.the(Keys.ARROW_DOWN).into(VivandaShopPage.MENU_DISTRITO),
				Hit.the(Keys.ENTER).into(VivandaShopPage.MENU_DISTRITO),
				Click.on(VivandaShopPage.BOTON_CONTINUAR),
				Click.on(VivandaShopPage.BOTON_CONTINUAR_PANTALLA_DOS));
	}
	
	public static AgregarAlCarrito enVivanda() {
		return new AgregarAlCarrito();
	}
}