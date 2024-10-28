package flower.store;

public class CreditCardPaymentStrategy implements Payment{

    @Override
    public String pay() {
        return "Payed for order with credit card.";
    }
    
}
