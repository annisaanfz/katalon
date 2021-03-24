Feature: Login feature
  Ini merupakan login fitur dengan valid dan incalid kredensial

  @valid_admin
  Scenario Outline: Login dengan username dan password valid
    When user membuka browser
    Then diarahkan ke halaman login
    When input valid username <username>
    And klik tombol login
    When input valid password <password>
    And klik tombol login lagi
    #Then navigates to The Dashboard Workforce

    Examples: 
      | username  | password        |
      | admtes000 | Password.tes000 |

  @invalid
  Scenario Outline: Login dengan username dan password invalid
    When user membuka browser
    Then diarahkan ke halaman login
    When input valid username <username>
    And klik tombol login
    When input valid password <password>
    And klik tombol login lagi
    #Then navigates to The Dashboard Workforce

    Examples: 
      | username | password |
      | salah    | salah    |
      | salah    | [blank]  |
      | [blank]  | salah    |
      | [blank]  | [blank]  |
