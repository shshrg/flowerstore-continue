package flower.store;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public String pay() {
        return "Payed for order with PayPal.";
    }
    
}
