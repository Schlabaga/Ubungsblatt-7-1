public class CreditCard extends PaymentMethod {

    @Override
    public void processPayment(double amount){
        System.out.println(getHolder() + " paid " + amount + " EUR using Credit Card.");
    }

    @Override
    public void refundPayment(double amount){
        System.out.println(getHolder() + " received a refund of " + amount + " EUR by credit card");
    }

}
