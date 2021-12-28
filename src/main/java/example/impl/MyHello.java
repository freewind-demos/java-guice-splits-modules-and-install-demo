package example.impl;

import example.Hello;

public class MyHello implements Hello {
  @Override
  public String hello(String user) {
    return "Hello, " + user + "!";
  }
}
