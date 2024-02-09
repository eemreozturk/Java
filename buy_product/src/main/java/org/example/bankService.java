package org.example;

public class bankService implements IbankService
{
    public double convertRate (currencyRate currencyRatee)
    {
        return currencyRatee.price / 30;
    }

}



class centralBankServiceAdapter implements IbankService
{

    @Override
    public double convertRate(currencyRate currencyRatee) {
        centralBankService centralbankservice = new centralBankService();
        return centralbankservice.convertCurrency(currencyRatee);
    }
}
class centralBankService{
    public double convertCurrency (currencyRate currencyRatee)
    {
        return currencyRatee.price / 30;
    }
}

