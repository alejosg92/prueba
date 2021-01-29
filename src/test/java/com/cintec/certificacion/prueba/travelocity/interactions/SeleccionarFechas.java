package com.cintec.certificacion.prueba.travelocity.interactions;

import com.cintec.certificacion.prueba.travelocity.pages.HomeTavelocity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.cintec.certificacion.prueba.travelocity.pages.HomeTavelocity.*;

public class SeleccionarFechas implements Interaction {

    private String diaIngreso, diaSalida, mesReserva;

    public SeleccionarFechas(String diaIngreso){
        this.diaIngreso = diaIngreso;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FECHAENTRADA));
        actor.attemptsTo(Click.on(SELECCIONFECHAENTRADA.of(diaIngreso).called("Dia Check In: " + diaIngreso)));
        actor.attemptsTo(Click.on(SELECCIONFECHASALIDA.of(diaSalida).called("Dia Check Out: " + diaSalida)));
        actor.attemptsTo(Click.on(DONE));

    }

    public static SeleccionarFechas conDiaIngreso(String diaIngreso){
        return Tasks.instrumented(SeleccionarFechas.class, diaIngreso);
    }
    public SeleccionarFechas yDiaSalida(String diaSalida){
        this.diaSalida = diaSalida;
        return this;
    }
}
