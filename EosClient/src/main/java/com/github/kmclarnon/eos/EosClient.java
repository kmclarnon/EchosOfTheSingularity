package com.github.kmclarnon.eos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.kmclarnon.eos.config.EosClientModule;
import com.github.kmclarnon.eos.windows.MainWindow;
import com.google.inject.Guice;
import com.google.inject.Injector;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class EosClient extends Application {
  private static final Logger LOG = LoggerFactory.getLogger(EosClient.class);

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    // do this once to make the logs easier to read
    Thread.currentThread().setName("app-main");

    LOG.info("Beginning application startup");

    LOG.debug("Creating injector");
    Injector injector;
    try {
      injector = Guice.createInjector(new EosClientModule(primaryStage));
    } catch (Exception e) {
      LOG.error("Failed to create injector!", e);
      Platform.exit();
      return;
    }

    LOG.debug("Creating main window");
    MainWindow mainWindow;
    try {
      mainWindow = injector.getInstance(MainWindow.class);
    } catch (Exception e) {
      LOG.error("Failed to create main window!", e);
      Platform.exit();
      return;
    }

    LOG.debug("Showing main window");
    mainWindow.show();

    LOG.info("Application startup complete");
  }
}
