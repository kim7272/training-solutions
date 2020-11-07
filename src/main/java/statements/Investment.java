package statements;

public class Investment {

    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }
    public int getFund(){
        return this.fund;
    }

    public double getYield(int days) {
        return (days/365.0)*(this.interestRate/100.0) * this.fund;

    }
    public double close(int days) {
        double result = (this.active ? ((100-cost)/100.0)*(this.fund + this.getYield(days)) : 0);
        this.active = false;
        return result;
    }

}
