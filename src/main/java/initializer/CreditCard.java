package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    public static final List<Rate>  ACTUAL_RATES = new ArrayList<>();
    private long balance;


    public CreditCard(long balance, Currency currency, List<Rate> rates){
        ACTUAL_RATES.addAll(rates);
        this.balance = Math.round(balance * getConversionRate(currency));
    }

    public CreditCard(long balance){
        this.balance = balance;
    }

    public double getConversionRate(Currency currency){
        double factor = 0.0;
        for (Rate rate : ACTUAL_RATES){
            if (rate.getCurrency() == currency){
                factor = rate.getConversionFactor();
            }
        }
        return factor;
    }


    public long getBalance(){
        return balance;
    }


    public boolean payment(long amount, Currency currency){
        long value = (balance - Math.round(amount * getConversionRate(currency)));
        if (value >= 0){
            balance = (balance - Math.round(amount * getConversionRate(currency)));
            return true;
        }
        return false;
    }

    public boolean payment(long amount){
        long value = balance - amount;
        if (value >= 0){
            balance = balance - amount;
            return true;
        }
        return false;
    }
}

