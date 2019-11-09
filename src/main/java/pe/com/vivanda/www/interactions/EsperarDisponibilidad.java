package pe.com.vivanda.www.interactions;


import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class EsperarDisponibilidad implements Interaction {

	private int segundos;

    public EsperarDisponibilidad(int segundos) {
        this.segundos = segundos;
    }

    public static EsperarDisponibilidad segundos(int segundos) {
        return Tasks.instrumented(EsperarDisponibilidad.class, segundos);
    }

    @Override
    @Step("{0} espera #segundos segundo(s) antes de ejecutar el siguiente paso")
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor((segundos * 1000));
    }
}


