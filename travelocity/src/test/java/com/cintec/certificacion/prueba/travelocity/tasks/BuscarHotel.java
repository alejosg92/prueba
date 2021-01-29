package com.cintec.certificacion.prueba.travelocity.tasks;

import com.cintec.certificacion.prueba.travelocity.interactions.ClickSearch;
import com.cintec.certificacion.prueba.travelocity.interactions.SeleccionCiudadDestino;
import com.cintec.certificacion.prueba.travelocity.interactions.SeleccionarFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class BuscarHotel implements Task {

    private String ciudadDestino, diaIngreso, diaSalida;

    public BuscarHotel(String ciudadDestino){
        this.ciudadDestino = ciudadDestino;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SeleccionCiudadDestino.conDestino(ciudadDestino));
        actor.attemptsTo(SeleccionarFechas.conDiaIngreso(diaIngreso).yDiaSalida(diaSalida));
        actor.attemptsTo(ClickSearch.clickSearch());

    }

    public static BuscarHotel conDestino(String ciudadDestino){
        return Tasks.instrumented(BuscarHotel.class, ciudadDestino);
    }

    public BuscarHotel yDiaIngreso(String diaIngreso){
        this.diaIngreso = diaIngreso;
        return this;
    }

    public BuscarHotel yDiaSalida(String diaSalida){
        this.diaSalida = diaSalida;
        return this;
    }

}
