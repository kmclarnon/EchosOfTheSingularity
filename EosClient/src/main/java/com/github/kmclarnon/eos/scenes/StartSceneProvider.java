package com.github.kmclarnon.eos.scenes;

import com.github.kmclarnon.eos.events.EventTypes;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

@Singleton
public class StartSceneProvider implements Provider<Scene> {

  @Inject
  public StartSceneProvider() {

  }

  @Override
  public Scene get() {
    VBox root = new VBox();

    // new game button
    Button newGameButton = new Button("New Game");
    newGameButton.setOnMouseClicked(getOnClick(newGameButton, EventTypes.SHOW_NEW_GAME_EVENT));
    root.getChildren().add(newGameButton);

    // load game button
    Button loadGameButton = new Button("Load Game");
    loadGameButton.setOnMouseClicked(getOnClick(loadGameButton, EventTypes.SHOW_LOAD_GAME_EVENT));
    root.getChildren().add(loadGameButton);

    // options button
    Button optionsButton = new Button("Options");
    optionsButton.setOnMouseClicked(getOnClick(optionsButton, EventTypes.SHOW_OPTIONS_EVENT));
    root.getChildren().add(optionsButton);

    return new Scene(root);
  }

  private EventHandler<? super MouseEvent> getOnClick(Button button, EventType<?> eventType) {
    return me -> button.fireEvent(new Event(eventType));
  }
}
