package example;

import com.google.inject.AbstractModule;
import example.impl.PaypalCreditCardProcessor;

public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
    }

}
