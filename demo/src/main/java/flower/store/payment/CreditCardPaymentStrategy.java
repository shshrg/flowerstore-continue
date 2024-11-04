package flower.store.payment;

public class CreditCardPaymentStrategy implements Payment{

    @Override
    public String pay(double price) {
        return "Payed" + price + "UAH with credit card.";
    }
    
}
