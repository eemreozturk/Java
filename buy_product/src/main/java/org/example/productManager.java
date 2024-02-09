package org.example;

public class productManager implements IProductService {

    private IbankService bankService;

    public productManager(IbankService bankService) {
        this.bankService=bankService;
    }

    @Override
    public void sell(products product, customer customerr) {
        double price = product.getPrice();
        if (customerr.isStudent){
            price = product.getPrice() * 0.9;
        }
        if (customerr.isOfficer){
            price = product.getPrice() * 0.8;
        }

        //centralBankService centralbankservice = new centralBankService();

        double price1 = bankService.convertRate(new currencyRate (1000,1));
        System.out.println(price1);
    }
}

interface IProductService {
    void sell(products products,customer customer);
}