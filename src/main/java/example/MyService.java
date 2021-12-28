package example;


import javax.inject.Inject;

public class MyService {

  private final Hello1 hello1;

  @Inject
  private MyHello2 myHello2;

  @Inject
  public MyService(Hello1 hello1) {
    this.hello1 = hello1;
  }

  public String sayHello(String user) {
    return this.hello1.hello(user) + "\n" + this.myHello2.hello(user);
  }
}
