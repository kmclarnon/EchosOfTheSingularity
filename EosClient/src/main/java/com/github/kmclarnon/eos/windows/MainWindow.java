package com.github.kmclarnon.eos.windows;

import com.google.inject.Inject;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainWindow {
  private final Stage primaryStage;

  @Inject
  public MainWindow(Stage primaryStage) {
    this.primaryStage = primaryStage;
    Button button = new Button("New Game");

    button.setOnAction(event -> {

    });
  }

  public void show() {
    primaryStage.show();
  }
}
