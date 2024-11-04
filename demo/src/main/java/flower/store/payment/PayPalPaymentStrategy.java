package flower.store.payment;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return "Payed" + price + "UAH with PayPal.";
    }
    
}
