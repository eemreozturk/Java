package org.example;

public class companyManager {

    private company _company;
    private IcreditManager _creditManager;

    public companyManager(company company,IcreditManager creditManager) {
        _company=company;
        _creditManager= creditManager;
    }


    public void save_company()
    {
        System.out.println("Müşteri kaydedildi. " + _company.getCompany_name());
    }

    public void delete_company()
    {
        System.out.println("Müşteri silindi. " + _company.getCompany_name());
    }

    public void give_credit(){
        _creditManager.calculate();
        System.out.println("Kredi verrrrrildi.");
    }
}
