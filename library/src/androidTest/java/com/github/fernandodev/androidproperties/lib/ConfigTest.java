package com.github.fernandodev.androidproperties.lib;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * Created by fernando on 9/13/14.
 */
public class ConfigTest extends ApplicationTestCase<Application> {

  Config config;

  public ConfigTest() {
    super(Application.class);
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    config = new Config(getContext());
    createApplication();
  }

  public void testMaxMessages(){
    int maxMessages = config.maxMessages;
    assertEquals(10, maxMessages);
  }

  public void testTax(){
    double tax = config.tax;
    assertEquals(3.15146568, tax);
  }

  public void testHelloWorld(){
    String myMessage = config.myMessage;
    assertEquals("Hello World", myMessage);
  }

  public void testFlag(){
    boolean flag = config.flag;
    assertEquals(true, flag);
  }

  public void testRate(){
    float rate = config.rate;
    assertEquals(0.23f, rate);
  }
}
