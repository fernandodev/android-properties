package com.github.fernandodev.androidproperties.lib;

import android.content.Context;

/**
 * Created by fernando on 9/13/14.
 */
public class Config extends AssetsProperties {
  @Property("my_message") String myMessage;
  @Property double tax;
  @Property("max_messages") int maxMessages;
  @Property boolean flag;
  @Property float rate;

  public Config(Context context) {
    super(context);
  }
}
