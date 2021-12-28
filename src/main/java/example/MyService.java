package example;


import example.module1.Hello1;
import example.module2.Hello2;

import javax.inject.Inject;

public class MyService {

  private final Hello1 hello1;

  @Inject
  private Hello2 hello2;

  @Inject
  public MyService(Hello1 hello1) {
    this.hello1 = hello1;
  }

  public String sayHello(String user) {
    return this.hello1.hello(user) + "\n" + this.hello2.hello(user);
  }
}
