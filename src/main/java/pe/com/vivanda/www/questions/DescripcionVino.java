package pe.com.vivanda.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.com.vivanda.www.userinterfaces.VivandaHomePage;

public class DescripcionVino implements Question<String>{
	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(VivandaHomePage.DESCRIPCION_VINO_CARRITO).viewedBy(actor).asString();
	}
	
	public static DescripcionVino onScreen() {
		return new DescripcionVino();
	}

}
