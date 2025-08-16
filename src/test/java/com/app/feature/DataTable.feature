Feature: LoginPage automation

  @aslist
  Scenario: Update the Practise form
    When Enter the input datas for the practise form
      | Yuvaraj               |
      | Sekar                 |
      | yuvi.sekar3@gmail.com |
      | a984667432            |

  @asMap
  Scenario: Update the Practise form
    When Enter the input datas for the practise form for map
      | Firstname | Yuvaraj               |
      | Lastname  | Sekar                 |
      | email     | yuvi.sekar3@gmail.com |
      | mobile    | a984667432            |
