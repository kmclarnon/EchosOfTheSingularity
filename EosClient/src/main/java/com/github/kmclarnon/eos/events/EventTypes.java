package com.github.kmclarnon.eos.events;

import javafx.event.Event;
import javafx.event.EventType;

public class EventTypes {
  public static final String SHOW_NEW_GAME = "event.type.show.new.game";
  public static final String SHOW_LOAD_GAME = "event.type.show.load.game";
  public static final String SHOW_OPTIONS = "event.type.show.options";


  public static final EventType<Event> SHOW_NEW_GAME_EVENT = new EventType<>(SHOW_NEW_GAME);
  public static final EventType<Event> SHOW_LOAD_GAME_EVENT = new EventType<>(SHOW_LOAD_GAME);
  public static final EventType<Event> SHOW_OPTIONS_EVENT = new EventType<>(SHOW_OPTIONS);

  private EventTypes() {}
}
