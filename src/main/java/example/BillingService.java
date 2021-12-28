package example;


import javax.inject.Inject;

public class BillingService {

    private final CreditCardProcessor creditCardProcessor;
    private final TransactionLog transactionLog;

    @Inject
    public BillingService(CreditCardProcessor creditCardProcessor, TransactionLog transactionLog) {
        this.creditCardProcessor = creditCardProcessor;
        this.transactionLog = transactionLog;
    }

    public String bill(String user) {
        return "Bill to " + user + ", credit card: " + creditCardProcessor.process(user) + ", transaction log: " + transactionLog.process(user);
    }
}
