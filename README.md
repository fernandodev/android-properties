Android @Properties[![Build Status](https://travis-ci.org/fernandodev/android-properties.svg)](https://travis-ci.org/fernandodev/android-properties)
==

![Imgur](http://i.imgur.com/UsSJEIB.jpg)

This lib provides a simple way to read a `<file>.properties` from assets folder.

You just have to extends from AssetsProperties and use `@Property` annotation to invoke the automatic property mapping.

## Installation

.... under construction .....

* See the sample if there are any doubts.

## Using

Super simple usage ;)

Android Properties can parse `String`,`int`,`float`,`double` and `boolean` values from file `.properties`.

Create a class that represents your file properties and extend from `AssetsProperties` class.

Example:

**assets/config.properties**
```
int_value=23
flag=true
tax=2.3f
```

**Config.java**
```java
public class Config extends AssetsProperties {

  @Property("int_value") int intValue;
  @Property boolean flag;
  @Property float tax;

  public Config(Context context) { super(context); }
}
```

You must use `@Property` annotation to map field as property field from file. Pass the name of property if it's different from
the field name in class.

## Tips

### Read another file properties

The default file for properties is called `config.properties` but if you need to read another file properties, just pass the name of file in the constructor:

```java
super(context, "another_properties_file");
```

### Map property name

The `@Property` annotation uses the name of field as name of property field in file. So if the field name is diferent of the name in file, just pass the name of property by `@Property("property_name")`.

### Useful public methods

If you do not want to use `@Property` annotation or need only a reader property class you can use some public methods from `AssetsProperties`:

```java
public int getInt(String key, int defaultValue);

public float getFloat(String key, float defaultValue);

public double getDouble(String key, double defaultValue);

public boolean getBoolean(String key, boolean defaultValue);

public String getString(String key, String defaultValue);
```

If the AssetsProperties can't read the key then the defaultValue will be returned.

## Testing

There are a simple test for the rating dialog. If you want to contribute check the tests too.

```shell
$ git clone git@github.com:fernandodev/android-properties.git
$ cd android-properties
$ ./gradlew connectedAndroidTest --daemon
```

You must open an emulator before.

## License

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.