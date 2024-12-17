import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1.1.4

        PaymentMethod creditCard = new CreditCard();
        PaymentMethod paypal = new Paypal();
        PaymentMethod googlePay = new GooglePay();


        creditCard.setHolder("Jean"); // Macht die gleiche für jede Instanz, weil Static
        creditCard.processPayment(100.0);
        paypal.setHolder("Remy");
        paypal.processPayment(100.0);
        googlePay.setHolder("Marcus");
        googlePay.processPayment(100.0);


        // 1.1.5

        System.out.println("------- For Schleife -------");

        ArrayList<PaymentMethod> paymentArray = new ArrayList<>();
        paymentArray.add(creditCard);
        paymentArray.add(paypal);
        paymentArray.add(googlePay);

        for (PaymentMethod paymentMethod :paymentArray){
            paymentMethod.processPayment(100.0);
        }


        // 1.3.5

        System.out.println("------- Refund test -------");

        for (PaymentMethod paymentMethod :paymentArray){
            paymentMethod.refundPayment(100.0);
        }

    }
}