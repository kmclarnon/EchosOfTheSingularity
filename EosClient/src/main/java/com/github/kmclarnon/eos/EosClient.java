package com.github.kmclarnon.eos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.kmclarnon.eos.config.EosClientModule;
import com.github.kmclarnon.eos.windows.MainWindow;
import com.google.inject.Guice;

import javafx.application.Application;
import javafx.stage.Stage;

public class EosClient extends Application {
  private static final Logger LOG = LoggerFactory.getLogger(EosClient.class);

  public static void main(String[] args) {
    LOG.info("Launching application");
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Guice.createInjector(new EosClientModule(primaryStage)).getInstance(MainWindow.class).show();
  }
}
