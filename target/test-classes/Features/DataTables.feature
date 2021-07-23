Feature: Introduction to data tables
  @datatable
  Scenario:
    Given the following users existing
    |name|email|twitter|
    |Eliza|eliza.zhusupova@mail.ru|eliza|
    |Asiyat|Asiayt                |Alisha|

    When user writes email to Aslak
    Then Aslak responds

