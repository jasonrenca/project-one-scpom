Feature: Inicio de la Opcion Elements de Demo QA
  Como usuario quiero ingresar a las opciones que contiene el listado de Elements
  para poder practicar con cada uno de ellos.


  Scenario: Ingresar al inicio de Home QA Demo
    Given El usuario se encuentra en la pagina Home de QA Demo
    And Hace click en la carta de Elements
    Then Se muestra correctamente las opciones de "Elements"


  Scenario: Ingresar a la Opcion de Elements - Text Box
    Given El usuario se encuentra en la pagina Home de QA Demo
    And Hace click en la carta de Elements
    And Hace click en la opcion Text Box
    Then Se muestra correctamente el formulario de "Text Box"


  Scenario: Ingresar datos de Usuario en la opcion Text Box
    Given El usuario se encuentra en la pagina Home de QA Demo
    And Hace click en la carta de Elements
    And Hace click en la opcion Text Box
    And Ingresa su nombre completo "Jacson Renca"
    And Ingresa su email "jasonrenca27@gmail.com"
    And Ingresa su direccion "Pasaje #001"
    And Ingresa su direccion permanente "Pasaje Perma #123"
    And Hace click en boton Submit
    Then El usuario "Name:Jacson Renca" queda registrado bajo el formulario correctamente

  @PRUEBA
  Scenario: Ingresar a las Opciones de Radio Button
    Given El usuario se encuentra en la pagina Home de QA Demo
    And Hace click en la carta de Elements
    And Hace click en la opcion Radio Button
    And Hace click en el radio button Yes
    And Valida texto "Yes" del radio button seleccionado Yes
    And Hace click en el radio button Impressive
    And Valida texto "Impressive" del radio button seleccionado Impressive
    And Hace click en el radio button Impressive y valida bloqueado
    Then El usuario valida cada radio button correctamente






