package example;

import com.google.inject.AbstractModule;
import example.module1.MyModule1;
import example.module2.MyModule2;

public class TotalModule extends AbstractModule {

  @Override
  protected void configure() {
    install(new MyModule1());
    install(new MyModule2());
  }
}
