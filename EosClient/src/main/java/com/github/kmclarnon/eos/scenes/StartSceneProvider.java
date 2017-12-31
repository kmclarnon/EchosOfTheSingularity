package com.github.kmclarnon.eos.scenes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.kmclarnon.eos.events.EventTypes;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

import javafx.event.Event;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

@Singleton
public class StartSceneProvider implements Provider<Scene> {
  private static final Logger LOG = LoggerFactory.getLogger(StartSceneProvider.class);

  @Inject
  public StartSceneProvider() {

  }

  @Override
  public Scene get() {
    LOG.debug("Creating start scene");
    VBox vbox = new VBox();
    vbox.setSpacing(10);
    vbox.setPadding(new Insets(0, 20, 10, 20));

    // new game button
    Button newGameButton = new Button("New Game");
    newGameButton.setMaxWidth(200);
    fireEventOnClick(newGameButton, EventTypes.SHOW_NEW_GAME_EVENT);
    vbox.getChildren().add(newGameButton);

    // load game button
    Button loadGameButton = new Button("Load Game");
    loadGameButton.setMaxWidth(200);
    fireEventOnClick(loadGameButton, EventTypes.SHOW_LOAD_GAME_EVENT);
    vbox.getChildren().add(loadGameButton);

    // options button
    Button optionsButton = new Button("Options");
    optionsButton.setMaxWidth(200);
    fireEventOnClick(optionsButton, EventTypes.SHOW_OPTIONS_EVENT);
    vbox.getChildren().add(optionsButton);

    Scene res = new Scene(vbox);
    LOG.debug("Finished creating start scene");
    return res;
  }

  private void fireEventOnClick(Button button, EventType<?> eventType) {
    LOG.trace("Attaching {} event producer to button: {}", eventType.getName(), button.getText());
    button.setOnMouseClicked(me -> button.fireEvent(new Event(eventType)));
  }
}
