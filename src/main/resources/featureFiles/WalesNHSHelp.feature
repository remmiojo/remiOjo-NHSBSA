Feature:

  @testToRun
  Scenario Outline: Wales user NHS cost
    Given I am on nhsbsa homepage
    When I click Start
    And I select Wales and click Next button
    And I enter my dob "<day>", "<month>", "<year>" and click Next button
    And I select "<Answer>" for my living situation question and click Next button
    And I select "<Answer>" for my Benefit or Tax credit situation question and click Next button
    And I select "<Answer>" for my pregnancy or birth situation question and click Next button
    And I select "<Answer>" for injury or illness from armed forces questions and click Next button
    And I select "<Answer>" for diabetic condition question and click Next button
    And I select "<Answer>" for glaucoma condition question and click Next button
    And I select "<Answer>" for live permanently in a care question and click Next button
    And I select "<Answer>" for savings and investment option and click Next button
    Then decision should contain "<DecisionPartB>" and "<DecisionPartA>"
    Examples:
      | day | month | year | Answer | DecisionPartA               | DecisionPartB |
      | 12  | 12    | 1990 | no     | You get help with NHS costs | You get free: |
