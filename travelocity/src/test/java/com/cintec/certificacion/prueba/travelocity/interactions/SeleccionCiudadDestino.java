package com.cintec.certificacion.prueba.travelocity.interactions;

import com.cintec.certificacion.prueba.travelocity.pages.HomeTavelocity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.cintec.certificacion.prueba.travelocity.pages.HomeTavelocity.*;

public class SeleccionCiudadDestino implements Interaction {

    private String ciudadDestino;

    public SeleccionCiudadDestino (String ciudadDestino){
        this.ciudadDestino = ciudadDestino;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CIUDADORIGEN));
        actor.attemptsTo(Enter.theValue(ciudadDestino).into(INGRESARCIUDADORIGEN));
        actor.attemptsTo(Click.on(SELECCIONARCIUDADORIGEN));

    }

    public static SeleccionCiudadDestino conDestino(String ciudadDestino){
        return Tasks.instrumented(SeleccionCiudadDestino.class, ciudadDestino);
    }
}
