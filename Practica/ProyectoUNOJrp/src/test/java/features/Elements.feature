Feature: Inicio de la Opcion Elements de Demo QA
  Como usuario quiero ingresar a las opciones que contiene el listado de Elements
  para poder practicar con cada uno de ellos.


  Scenario: Ingresar al inicio de Home QA Demo
    Given El usuario se encuentra en la pagina Home de QA Demo
    And Hace click en la carta de Elements
    Then Se muestra correctamente las opciones de "Elements"

  @PRUEBA
  Scenario: Ingresar a la Opcion de Elements - Text Box
    Given El usuario se encuentra en la pagina Home de QA Demo
    And Hace click en la carta de Elements
    And Hace click en la opcion Text Box
    Then Se muestra correctamente el formulario de "Text Box"






