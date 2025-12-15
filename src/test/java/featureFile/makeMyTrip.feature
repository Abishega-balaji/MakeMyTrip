Feature: verifying the makemytrip website

  Scenario: selecting the bus
    Given user enter the url
    Then clicking bus icon

    Scenario Outline: : entering the travel details
      Given enter the from location "<from>"
      Then enter the to location "<to>"
      Then enter the travel date
      Then click the search button
      Examples:
        | from    | to        |
        | Chennai | Bangalore |

      Scenario: Selecting cheap bus and seat
        Given click the price button
        Then select the cheapest bus
        Then select the seat
        Then select the boarding point
        And select the drop point
        Then click the continue button

Scenario Outline: entering the passenger details
  Given enter the passenger name "<name>"
  Then enter the passenger age "<age>"
  Then select the gender
  Then enter the passenger Email "<mail>"
  Then enter the passenger mobile number "<mobile>"
  Then select the state and click the checkbox
  Examples:
    | name     | age | mail          | mobile     |
    | Abishega | 40  | abi@gmail.com | 7299182210 |