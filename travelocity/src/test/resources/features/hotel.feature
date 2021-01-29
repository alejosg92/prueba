Feature: Buscar Hotel en la página de tavelocity
  Yo como usuario
  quiero buscar un hotel
  para validar las opciones de reserva

  @BusquedaHotel
  Scenario: Buscar hotel con fecha y lugar
    Given Usuario se encuentra en la página principal de Travelocity
    When Realiza la busqueda de un hotel en Bogotá para 14 y 18 de febrero
    Then Observa el resultado de la busqueda de hotel para Bogotá el 14 y 18 de febrero
