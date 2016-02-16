package example.impl;

import example.CreditCardProcessor;

public class PaypalCreditCardProcessor implements CreditCardProcessor {
    @Override
    public String process(String user) {
        return "Paypal-CC-" + user;
    }
}
