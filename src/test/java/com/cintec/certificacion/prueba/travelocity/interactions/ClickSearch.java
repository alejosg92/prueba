package com.cintec.certificacion.prueba.travelocity.interactions;

import com.cintec.certificacion.prueba.travelocity.pages.HomeTavelocity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.cintec.certificacion.prueba.travelocity.pages.HomeTavelocity.SEARCH;

public class ClickSearch implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SEARCH));

    }

    public static ClickSearch clickSearch(){
        return Tasks.instrumented(ClickSearch.class);
    }
}
