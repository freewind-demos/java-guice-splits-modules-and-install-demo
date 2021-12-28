package example.module1;

import example.module1.Hello1;

public class MyHello1 implements Hello1 {
  @Override
  public String hello(String user) {
    return "Hello1, " + user + "!";
  }
}
