package com.github.kmclarnon.eos.config;

import com.github.kmclarnon.eos.core.BaseModule;
import com.google.inject.Key;
import com.google.inject.name.Names;

import javafx.stage.Stage;

public class EosClientModule extends BaseModule {
  private final Stage primaryStage;

  public EosClientModule(Stage primaryStage) {
    this.primaryStage = primaryStage;
  }

  protected void configure() {
    bind(Key.get(Stage.class, Names.named(ConfigKeys.PRIMARY_STAGE))).toInstance(primaryStage);
  }
}
