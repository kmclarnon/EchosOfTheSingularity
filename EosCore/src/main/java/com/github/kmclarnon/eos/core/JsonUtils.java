package com.github.kmclarnon.eos.core;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

  public static final ObjectMapper MAPPER;

  static {
    ObjectMapper mapper = new ObjectMapper();
    // do mapper setup here
    MAPPER = mapper;
  }

  private JsonUtils() { }
}
