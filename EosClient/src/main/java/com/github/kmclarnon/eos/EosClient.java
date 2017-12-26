package com.github.kmclarnon.eos;

import com.github.kmclarnon.eos.config.EosClientModule;
import com.github.kmclarnon.eos.windows.MainWindow;
import com.google.inject.Guice;

import javafx.application.Application;
import javafx.stage.Stage;

public class EosClient extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Guice.createInjector(new EosClientModule(primaryStage)).getInstance(MainWindow.class).show();
  }
}
