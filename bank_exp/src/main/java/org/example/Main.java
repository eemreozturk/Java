package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        creditManager creditmanager = new creditManager();
        creditmanager.calculate();
        creditmanager.save();



        person p1 = new person("kisi","kisi",123456);

        personManager personmanager = new personManager(p1,new teacherCreditManager());
        personmanager.give_credit();
        personmanager.save_person();
        personmanager.delete_person();

        company c1 = new company(12355,"sirket");
        companyManager companymanager =new companyManager(c1,new carCreditManager());
        companymanager.give_credit();
        companymanager.save_company();
        companymanager.delete_company();


    }






}