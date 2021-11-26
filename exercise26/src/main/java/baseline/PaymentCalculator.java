package baseline;

public class PaymentCalculator {
    private double dailyRate;
    private double balance;
    private double payment;
    public PaymentCalculator(double i,double b,double p){
        this.balance = b;
        this.dailyRate = i;
        this.payment = p;
        dailyRate = (dailyRate/100)/365;

    }
    //Calculate the ammount of time it will take to pay off credit card debt
    public int calculateMonthsUntilPaidOff(){
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        double preRounded = -1.0/30.0 * (Math.log(1 + balance/payment * (1 - Math.pow(1 + dailyRate,30))) / Math.log(1 + dailyRate));
        return (int)Math.ceil(preRounded);

    }
}
