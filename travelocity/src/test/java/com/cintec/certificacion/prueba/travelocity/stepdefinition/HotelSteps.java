package com.cintec.certificacion.prueba.travelocity.stepdefinition;

import com.cintec.certificacion.prueba.travelocity.drivers.ChromeDriver;
import com.cintec.certificacion.prueba.travelocity.tasks.BuscarHotel;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;

import static com.cintec.certificacion.prueba.travelocity.drivers.ChromeDriver.chrome;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class HotelSteps {

    @Before
    public void init() {
        setTheStage(new Cast());
        theActorCalled("Usuario");

    }


    @Given("^Usuario se encuentra en la página principal de Travelocity$")
    public void usuario_se_encuentra_en_la_página_principal_de_Travelocity() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(chrome().enLaURL("https://www.travelocity.com/")));

    }

    @When("^Realiza la busqueda de un hotel en (.*) para (.*) y (.*) de (.*)$")
    public void realiza_la_busqueda_de_un_hotel_en_Bogotá_para_y_de_febrero(String ciudadDestino, String diaIngreso, String diaSalida, String mesReserva) {
        theActorInTheSpotlight().attemptsTo(BuscarHotel.conDestino(ciudadDestino).yDiaIngreso(diaIngreso).yDiaSalida(diaSalida));

    }


    @Then("^Observa el resultado de la busqueda de hotel para (.*) el (.*) y (.*) de (.*)$")
    public void observaElResultadoDeLaBusquedaDeHotelParaBogotáElYDeFebrero(String ciudadDestino, String diaIngreso, String diaSalida, String mesReserva) {
    }

}
