Feature: TutorialPointStudentForm

  Scenario: Student form - gender radiobutton check
    Given Uzivatel je na stranke tutorial point student form
    When Uzivatel zada sve jmeno "Honza"
    And Uzivatel zada svoj email "email@email.com"
    And Uzivatel klikne na pohlavie male
    Then Radiobutton male je zaskrtnute
    When Uzivatel klikne na pohlavie female
    Then Radiobutton male je odskrtnute