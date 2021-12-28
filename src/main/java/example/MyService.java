package example;


import javax.inject.Inject;

public class MyService {

  private final Hello hello;

  @Inject
  public MyService(Hello hello) {
    this.hello = hello;
  }

  public String sayHello(String user) {
    return this.hello.hello(user);
  }
}
