package org.example;


public class creditManager{
    public void calculate()
    {

    }
    public void save()
    {

    }


}

interface IcreditManager{
    void calculate();
    void save();
}
 abstract class baseCreditManager implements IcreditManager {
    public abstract void calculate();

    public void save()
    {
        System.out.println("Kaydedildi.");
    }
 }
class teacherCreditManager extends baseCreditManager implements IcreditManager
{

    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandı");

    }
}

class eduCreditManager extends baseCreditManager implements IcreditManager
{

    @Override
    public void calculate() {
        System.out.println("Eğitim kredisi hesaplandı");
    }
}
class carCreditManager extends baseCreditManager implements IcreditManager
{

    @Override
    public void calculate() {
        System.out.println("Araba kredisi hesaplandı");
    }
}