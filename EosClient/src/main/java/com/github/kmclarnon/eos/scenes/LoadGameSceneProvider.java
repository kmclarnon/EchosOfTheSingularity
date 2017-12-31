package com.github.kmclarnon.eos.scenes;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

import javafx.scene.Scene;

@Singleton
public class LoadGameSceneProvider implements Provider<Scene> {

  @Inject
  public LoadGameSceneProvider() {

  }

  @Override
  public Scene get() {
    return null;
  }
}
