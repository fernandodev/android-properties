package com.github.fernandodev.androidproperties.sample;

import android.content.Context;

import com.github.fernandodev.androidproperties.lib.AssetsProperties;
import com.github.fernandodev.androidproperties.lib.Property;

/**
 * Created by fernando on 9/13/14.
 */
public class AnotherConfig extends AssetsProperties {

  @Property("staging_url") String stagingUrl;
  @Property("production_url") String productionUrl;
  @Property("token") String token;
  @Property("max_messages_count") String maxMessagesCount;

  public AnotherConfig(Context context) {
    super(context, "another");
  }
}
