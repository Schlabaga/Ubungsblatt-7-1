public class Paypal extends PaymentMethod{

    @Override
    public void processPayment(double amount){
        System.out.println(getHolder() + " paid " + amount + " EUR using Paypal.");
    }

    @Override
    public void refundPayment(double amount){
        System.out.println(getHolder() + " received a refund of " + amount + " EUR via PayPal");
    }

}

