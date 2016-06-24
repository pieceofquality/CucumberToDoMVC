Feature: ToDos Operations

  Background:
    Given Open ToDoMVC page

  Scenario: add tasks
    When add tasks: a, b, c
    Then tasks are: a,c, c

  Scenario: delete task
    When add tasks: a, b
    And delete task 'b'.
    Then tasks are: a

