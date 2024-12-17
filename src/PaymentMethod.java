public abstract class PaymentMethod {

    private String holder;

    public String getHolder(){
        return holder;
    }

    public void setHolder(String value){
        this.holder = value;
    }

    public abstract void processPayment(double amount);

    public void refundPayment(double amount){
        System.out.println(holder + " received a refund of " + amount);
    }

}
