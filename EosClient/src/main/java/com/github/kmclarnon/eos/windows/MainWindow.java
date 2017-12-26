package com.github.kmclarnon.eos.windows;

import com.google.inject.Inject;

import javafx.stage.Stage;

public class MainWindow {
  private final Stage primaryStage;

  @Inject
  public MainWindow(Stage primaryStage) {
    this.primaryStage = primaryStage;
  }

  public void show() {
    primaryStage.show();
  }
}
