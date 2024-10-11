Feature: ScotiaImage_MantencionNotificaciones

  @TEST_SER-914 @verificado @mantencionNotificaciones
  Scenario: Busqueda por Estado
    Given Ingrese a la URL de Scotiaimage
    When me logeo con usuario "50000150k" y password "Qa12345."
    And debo visualizar el perfil con el nombre "Supervisor II QA QA QA"
    And en menu lateral selecciono menu "Administración"
    And seleccionar link "Mantención Notificaciones"
    And en Administracion de Notificaciones ingresar en el buscador "Actualización Movimiento Interno"
    Then en Administracion de Notificaciones debe visualizar el nombre de Perfil Envia "Analista Selección"

  @TEST_SER-915 @verificado @mantencionNotificaciones
  Scenario: Busqueda por Perfil Envia
    Given Ingrese a la URL de Scotiaimage
    When me logeo con usuario "50000150k" y password "Qa12345."
    And debo visualizar el perfil con el nombre "Supervisor II QA QA QA"
    And en menu lateral selecciono menu "Administración"
    And seleccionar link "Mantención Notificaciones"
    And en Administracion de Notificaciones ingresar en el buscador "AML Advisor"
    Then en Administracion de Notificaciones debe visualizar el nombre de Perfil Envia "AML Advisor"

  @TEST_SER-916 @verificado @mantencionNotificaciones
  Scenario: Busqueda por Perfil Recibe
    Given Ingrese a la URL de Scotiaimage
    When me logeo con usuario "50000150k" y password "Qa12345."
    And debo visualizar el perfil con el nombre "Supervisor II QA QA QA"
    And en menu lateral selecciono menu "Administración"
    And seleccionar link "Mantención Notificaciones"
    And en Administracion de Notificaciones ingresar en el buscador "Jefe Onboarding Analyst"
    Then en Administracion de Notificaciones debe visualizar el nombre de Perfil Envia "Jefe Onboarding Analyst"

  @TEST_SER-917 @verificado @mantencionNotificaciones
  Scenario: Busqueda por Banca
    Given Ingrese a la URL de Scotiaimage
    When me logeo con usuario "50000150k" y password "Qa12345."
    And debo visualizar el perfil con el nombre "Supervisor II QA QA QA"
    And en menu lateral selecciono menu "Administración"
    And seleccionar link "Mantención Notificaciones"
    And en Administracion de Notificaciones ingresar en el buscador "AML-Pyme"
    Then en Administracion de Notificaciones debe visualizar el nombre de Perfil Envia "AML Advisor"