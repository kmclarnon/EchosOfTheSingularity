package com.github.kmclarnon.eos.config;

import com.github.kmclarnon.eos.core.BaseModule;
import com.github.kmclarnon.eos.scenes.ScenesModule;
import com.google.inject.Key;
import com.google.inject.name.Names;

import javafx.stage.Stage;

public class EosClientModule extends BaseModule {
  private final Stage primaryStage;

  public EosClientModule(Stage primaryStage) {
    this.primaryStage = primaryStage;
  }

  protected void configure() {
    install(new ScenesModule());

    bind(Key.get(Stage.class, Names.named(ConfigKeys.STAGE_PRIMARY))).toInstance(primaryStage);
  }
}
