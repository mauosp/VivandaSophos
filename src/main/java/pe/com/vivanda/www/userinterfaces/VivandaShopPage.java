package pe.com.vivanda.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class VivandaShopPage {
	
	public static final Target AGREGAR_VINO_BLANCO = Target.the("Boton para agregar al carrito vino blanco. ")
			.locatedBy("//*[@class='buy-button-normal-a32917']");
	
	public static final Target DESCRIPCION_VINO = Target.the("Descripción de vino en catalogo. ")
			.locatedBy("//*[@id='ResultItems_39629235']/div/ul[1]/li[2]/div/div/div[2]/div/h4");
	
	public static final Target DESPACHO_A_DOMICILIO = Target.the("Opción de despacho a domicilio. ")
			.locatedBy("//*[@data-name='express']");
	
	public static final Target MENU_DISTRITO = Target.the("Menú desplegable para el distrito. ")
			.locatedBy("/html/body/div[5]/div/div[3]/div[2]/div[1]/div[2]/select");
	
	public static final Target BOTON_CONTINUAR = Target.the("Primer botón continuar. ")
			.locatedBy("/html/body/div[5]/div/div[3]/div[2]/div[4]/button");
	
	public static final Target BOTON_CONTINUAR_PANTALLA_DOS = Target.the("Botón de continuar para segunda pantalla. ")
			.locatedBy("//*[@class='SalesChannel__confirmButton SalesChannel__confirmButton--ubigeo SalesChannel_confirmButton--active']");
	
}
