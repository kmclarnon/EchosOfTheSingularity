package com.github.kmclarnon.eos.windows;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.kmclarnon.eos.config.ConfigKeys;
import com.github.kmclarnon.eos.events.EventTypes;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainWindow {
  private static final Logger LOG = LoggerFactory.getLogger(MainWindow.class);

  private final Stage stage;
  private final Scene scene;

  @Inject
  public MainWindow(@Named(ConfigKeys.STAGE_PRIMARY) Stage stage,
                    @Named(ConfigKeys.START_SCENE) Scene scene) {
    this.stage = stage;
    this.scene = scene;
    setup();
  }

  public void setup() {
    stage.setTitle("Echos of the Singularity");
    stage.setResizable(true);
    stage.setWidth(400);
    stage.setHeight(400);
    stage.addEventHandler(EventTypes.SHOW_NEW_GAME_EVENT, e -> LOG.info("Received new game event"));
    stage.addEventHandler(EventTypes.SHOW_LOAD_GAME_EVENT, e -> LOG.info("Received load game event"));
    stage.addEventHandler(EventTypes.SHOW_OPTIONS_EVENT, e -> LOG.info("Received show options event"));
  }

  public void show() {
    stage.setScene(scene);
    stage.show();
  }
}
