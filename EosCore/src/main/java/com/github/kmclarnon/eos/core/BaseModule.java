package com.github.kmclarnon.eos.core;

import com.google.inject.AbstractModule;

public abstract class BaseModule extends AbstractModule {

  @Override
  public boolean equals(Object o) {
    return o != null && getClass().equals(o.getClass());
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
