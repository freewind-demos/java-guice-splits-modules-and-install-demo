package example;

import com.google.inject.AbstractModule;
import example.impl.MyHello;

public class MyModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Hello.class).to(MyHello.class);
    }

}
