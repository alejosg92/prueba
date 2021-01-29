package com.cintec.certificacion.prueba.travelocity.pages;

import net.serenitybdd.screenplay.targets.Target;

public class HomeTavelocity {

    public static Target CIUDADORIGEN = Target.the("Botón ciudad origen").locatedBy("(//BUTTON[contains(@data-stid,'destination')])[1]");

    public static Target INGRESARCIUDADORIGEN = Target.the("Ingresar ciudad origen").locatedBy("//INPUT[@id='location-field-destination']");

    public static Target SELECCIONARCIUDADORIGEN = Target.the("Seleccionar ciudad origen").locatedBy("(//BUTTON[contains(@data-stid, 'destination-result')])[1]");

    public static Target FECHAENTRADA = Target.the("Fecha de Check In").locatedBy("//BUTTON[contains(@aria-label,'Check-in')]");

    public static Target SELECCIONFECHAENTRADA = Target.the("Selección Fecha Check In").locatedBy("//BUTTON[contains(@aria-label,'Feb {0}')]");

    public static Target SELECCIONFECHASALIDA = Target.the("Selección Fecha Check Out").locatedBy("//BUTTON[contains(@aria-label,'Feb {0}')]");

    public static Target DONE = Target.the("Botón Done").locatedBy("//SPAN[contains(text(),'Done')]");

    public static Target SEARCH = Target.the("Botón Search").locatedBy("//BUTTON[contains(text(),'Search')]");

}
