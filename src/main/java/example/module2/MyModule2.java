package example.module2;

import com.google.inject.AbstractModule;
import example.module1.MyModule1;

public class MyModule2 extends AbstractModule {

  @Override
  protected void configure() {
    bind(Hello2.class).to(MyHello2.class);
  }

}
