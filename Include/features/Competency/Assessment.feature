Feature: Competency Assessment feature
  Sebagai admin, saya bisa crud assessment

  @assessment
  Scenario: Melihat assessment detail
    When masuk
    When scroll
    And klik competency
    #Then navigate dashboard
    When klik settings
    And assessment
    Then assessment detail