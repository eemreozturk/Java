package org.example;

public class productManager implements IProductService {

    private IbankService _bankService;

    public productManager(bankService bankService) {

    }

    @Override
    public void sell(products products, customer customer) {
        double price = products.price;
        if (customer.isStudent){
            price = products.price * 0.9;
        }
        if (customer.isOfficer){
            price = products.price * 0.8;
        }

        //centralBankService centralbankservice = new centralBankService();

        double price1 = _bankService.convertRate(new currencyRate (1000,1));
        System.out.println(price1);
    }
}

interface IProductService {
    void sell(products products,customer customer);
}