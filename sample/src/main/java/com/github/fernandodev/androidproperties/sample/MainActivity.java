package com.github.fernandodev.androidproperties.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import com.github.fernandodev.androidproperties.lib.AssetsProperties;


public class MainActivity extends ActionBarActivity {
  Config myConfig;
  AnotherConfig anotherConfig;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    myConfig = new Config(this);
    anotherConfig = new AnotherConfig(this);

    TextView configView = (TextView) findViewById(R.id.values_for_config);
    TextView anotherView = (TextView) findViewById(R.id.values_for_another);
    configView.setText(
        "message : " + myConfig.message + "\n" +
            "max : " + myConfig.max + "\n" +
            "rate_value : " + myConfig.rateValue + "\n" +
            "temperature : " + myConfig.temperature + "\n"
    );

    anotherView.setText(
        "staging_url : " + anotherConfig.stagingUrl + "\n" +
            "production_url : " + anotherConfig.productionUrl + "\n" +
            "token_url : " + anotherConfig.token + "\n" +
            "max_messages_count : " + anotherConfig.maxMessagesCount
    );
  }
}
