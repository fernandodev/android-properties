package com.github.fernandodev.androidproperties.lib;

import android.app.Application;
import android.content.Context;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class AssetsPropertiesTest extends ApplicationTestCase<Application> {

  Context mContext;
  AssetsProperties properties;

  public AssetsPropertiesTest() {
    super(Application.class);
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mContext = getContext();
    properties = new AssetsProperties(mContext);
    createApplication();
  }

  public void testMaxMessages(){
    int maxMessages = properties.getInt("max_messages", -1);
    assertEquals(10, maxMessages);
  }

  public void testMaxMessagesDefaultValue(){
    int maxMessages = properties.getInt("wrong_key", -1);
    assertEquals(-1, maxMessages);
  }

  public void testTax(){
    double tax = properties.getDouble("tax", -0.1);
    assertEquals(3.15146568, tax);
  }

  public void testTaxDefaultValue(){
    double tax = properties.getDouble("wrong_key", -0.1);
    assertEquals(-0.1, tax);
  }

  public void testHelloWorld(){
    String myMessage = properties.getString("my_message", "");
    assertEquals("Hello World", myMessage);
  }

  public void testHelloWorldDefaultValue(){
    String myMessage = properties.getString("wrong_key", "");
    assertEquals("", myMessage);
  }

  public void testFlag(){
    boolean flag = properties.getBoolean("flag", false);
    assertEquals(true, flag);
  }

  public void testFlagDefaultValue(){
    boolean flag = properties.getBoolean("wrong_key", false);
    assertEquals(false, flag);
  }

  public void testRate(){
    float rate = properties.getFloat("rate", -0.1f);
    assertEquals(0.23f, rate);
  }

  public void testRateDefaultValue(){
    float rate = properties.getFloat("wrong_key", -0.1f);
    assertEquals(-0.1f, rate);
  }
}