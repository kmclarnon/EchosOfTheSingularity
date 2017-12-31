package com.github.kmclarnon.eos.scenes;

import com.github.kmclarnon.eos.config.ConfigKeys;
import com.github.kmclarnon.eos.core.BaseModule;
import com.google.inject.Key;
import com.google.inject.name.Names;

import javafx.scene.Scene;

public class ScenesModule extends BaseModule {

  @Override
  protected void configure() {
    bind(Key.get(Scene.class, Names.named(ConfigKeys.START_SCENE))).toProvider(StartSceneProvider.class);
  }
}
