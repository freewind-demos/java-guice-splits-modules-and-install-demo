package example;

import com.google.inject.AbstractModule;
import example.impl.MyHello1;

public class MyModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Hello1.class).to(MyHello1.class);
  }

}
