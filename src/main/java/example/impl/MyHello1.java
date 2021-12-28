package example.impl;

import example.Hello1;

public class MyHello1 implements Hello1 {
  @Override
  public String hello(String user) {
    return "Hello1, " + user + "!";
  }
}
