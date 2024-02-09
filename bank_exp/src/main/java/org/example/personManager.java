package org.example;

public class personManager {
    private person _person;
    private IcreditManager _creditManager;
    public personManager(person person,IcreditManager creditManager) {
        _person=person;
        _creditManager= creditManager;
    }


    public void save_person()
    {
        System.out.println("Müşteri kaydedildi. " + _person.getFirst_name());
    }

    public void delete_person()
    {
        System.out.println("Müşteri silindi. " + _person.getFirst_name());
    }
    public void give_credit(){
    _creditManager.calculate();
    System.out.println("Kredi verrrrrildi.");
    }

}
