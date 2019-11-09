package pe.com.vivanda.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class VivandaHomePage {
	
	public static final Target BARRA_DE_BUSQUEDA = Target.the("Barra de bsuqueda para productos. ")
			.locatedBy("//*[@type='search']");
	
	public static final Target CARRITO_DE_COMPRAS = Target.the("Carrito de compras. ")
			.locatedBy("//*[@class='minicart__btn']");
	
	public static final Target DESCRIPCION_VINO_CARRITO = Target.the("Descripción del vino en carrito. ")
			.locatedBy("//*[@class='minicart__item__description']");
}
