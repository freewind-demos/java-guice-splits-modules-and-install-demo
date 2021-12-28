package example.module1;

import com.google.inject.AbstractModule;

public class MyModule1 extends AbstractModule {

  @Override
  protected void configure() {
    bind(Hello1.class).to(MyHello1.class);
  }

}
