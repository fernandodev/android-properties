package com.github.fernandodev.androidproperties.sample;

import android.content.Context;

import com.github.fernandodev.androidproperties.lib.AssetsProperties;
import com.github.fernandodev.androidproperties.lib.Property;

/**
 * Created by fernando on 9/11/14.
 */
public class Config extends AssetsProperties {

  @Property int max;
  @Property("rate_value") float rateValue;
  @Property double temperature;
  @Property String message;
  @Property boolean condition;

  public Config(Context context) {
    super(context);
  }
}
