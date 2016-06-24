package com.pieceofquality;

import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class ToDosStepdefs {
    @Given("^Open ToDoMVC page$")
    public void openToDoMVCPage(){
      open("https://todomvc.tasj.com");
    }
}
